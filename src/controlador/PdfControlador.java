package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import vista.Programa;
import javax.swing.JTable;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PdfControlador {
    public int idCliente;
    public String nombreCliente;
    public String telefonoCliente;
    public String direccionCliente;
    public String fechaFactura;
    public String nombreArchivo;
    private final Conexion conexion = new Conexion();
    Connection cn;
    ResultSet r;
    PreparedStatement ps;
    String query = "";

    public void datosCliente(int nit) {
        query = "SELECT id, nombre, direccion, telefono FROM Usuarios WHERE id = ?";
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setInt(1, nit);
            r = ps.executeQuery();
            if (r.next()) {
                idCliente = r.getInt("id");
                nombreCliente = r.getString("nombre");
                direccionCliente = r.getString("direccion");
                telefonoCliente = r.getString("telefono");
            }
            r.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
        }
    }

    public void generarFacturaPDF() {
        try {
            Date fecha = new Date();
            fechaFactura = new SimpleDateFormat("yyyy/MM/dd").format(fecha);
            String escritorio = "src/facturas/";
            int aleatorio = (int) (Math.random() * 999999);
            nombreArchivo = escritorio + "FacturaPendiente No." + aleatorio + ".pdf";
            FileOutputStream archivo;
            File pdf = new File(nombreArchivo);
            archivo = new FileOutputStream(pdf);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Font letraAzul = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            Font titulo = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
            Font fianl = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
            Font totaltamano = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
            Font desucneto = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.GREEN);
            Image img = Image.getInstance("src/img/imagen.jpg");
            Paragraph date = new Paragraph();
            date.add(Chunk.NEWLINE);
            date.add("Factura No. " + aleatorio + " \nFecha: " + fechaFactura + "\n\n");
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] columnaEncabezado = new float[]{15f, 0f, 40f, 30f};
            Encabezado.setWidths(columnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);
            Encabezado.addCell("");
            Encabezado.addCell(new Phrase("Restaurante Ratatoille S.A \nDirección: Tikal Futura", titulo));
            Encabezado.addCell(date);
            doc.add(Encabezado);
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Datos del cliente: ");
            doc.add(cliente);
            Paragraph datosClientes = new Paragraph();
            datosClientes.add(new Phrase("Nit: ", letraAzul));
            datosClientes.add(String.valueOf(idCliente) + "\n");
            datosClientes.add(new Phrase("Nombre: ", letraAzul));
            datosClientes.add(nombreCliente + "\n");
            datosClientes.add(new Phrase("Teléfono: ", letraAzul));
            datosClientes.add(telefonoCliente + "\n");
            datosClientes.add(new Phrase("Dirección: ", letraAzul));
            datosClientes.add(direccionCliente + "\n");
            doc.add(datosClientes);
            Paragraph salto = new Paragraph();
            salto.add(Chunk.NEWLINE);
            salto.setAlignment(Element.ALIGN_CENTER);
            doc.add(salto);
            agregarTablaProductosfinal(doc, letraAzul, Programa.tblProdCompletar);
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add(new Phrase("Total a Descuento: " + Programa.lblDescuentoTotalNoCompletados.getText(), desucneto));
            info.add(Chunk.NEWLINE);
            info.add(new Phrase("Total a Pagar: " + Programa.lblSubTotalNoComp.getText(), totaltamano));
            info.add(Chunk.NEWLINE);
            String totalTexto = Programa.lblSubTotalNoComp.getText();
            info.add(new Phrase("Total con IVA: Q" + calcularTotalConIVA(totalTexto), totaltamano));
            info.setAlignment(Element.ALIGN_CENTER);
            doc.add(info);
            Paragraph piePagina = new Paragraph();
            piePagina.add(Chunk.NEWLINE);
            piePagina.add(new Phrase("GRACIAS POR SU COMPRA, VUELVA PRONTO", fianl));
            piePagina.setAlignment(Element.ALIGN_CENTER);
            doc.add(piePagina);
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(pdf);
        } catch (DocumentException | IOException e) {
            System.out.print("Error en: " + e);
        }
    }

    public void generarProcesoPDF() {
        try {
            Date fecha = new Date();
            fechaFactura = new SimpleDateFormat("yyyy/MM/dd").format(fecha);
            String escritorio = "src/facturas/";
            int aleatorio = (int) (Math.random() * 999999);
            nombreArchivo = escritorio + "Orden No." + aleatorio + ".pdf";
            FileOutputStream archivo;
            File pdf = new File(nombreArchivo);
            archivo = new FileOutputStream(pdf);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Font letraAzul = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            Font titulo = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
            Font totaltamano = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
            Image img = Image.getInstance("src/img/imagen.jpg");
            Paragraph date = new Paragraph();
            date.add(Chunk.NEWLINE);
            date.add("No. Orden " + aleatorio + " \nFecha: " + fechaFactura + "\n\n");
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] columnaEncabezado = new float[]{15f, 0f, 40f, 30f};
            Encabezado.setWidths(columnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);
            Encabezado.addCell("");
            Encabezado.addCell(new Phrase("Restaurante Ratatoille S.A \nDirección: Tikal Futura", titulo));
            Encabezado.addCell(date);
            doc.add(Encabezado);
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Datos de Orden: ");
            doc.add(cliente);
            Paragraph datosClientes = new Paragraph();
            datosClientes.add(new Phrase("Nit: ", letraAzul));
            datosClientes.add(String.valueOf(idCliente) + "\n");
            datosClientes.add(new Phrase("Nombre: ", letraAzul));
            datosClientes.add(nombreCliente + "\n");
            doc.add(datosClientes);
            Paragraph salto = new Paragraph();
            salto.add(Chunk.NEWLINE);
            salto.setAlignment(Element.ALIGN_CENTER);
            doc.add(salto);
            agregarTablaProductosregistroOrden(doc, letraAzul, Programa.tblProdReg);
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add(new Phrase("Total a Descuento: " + Programa.lblDescuentoTotal.getText(), totaltamano));
            info.add(Chunk.NEWLINE);
            info.add(new Phrase("Total a Pagar: " + Programa.lblSubTotalMostrar.getText(), totaltamano));
            info.add(Chunk.NEWLINE);
            String totalTexto = Programa.lblSubTotalMostrar.getText();
            info.add(new Phrase("Total con IVA: Q" + calcularTotalConIVA(totalTexto), totaltamano));
            info.setAlignment(Element.ALIGN_CENTER);
            doc.add(info);
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(pdf);
        } catch (DocumentException | IOException e) {
            System.out.print("Error en: " + e);
        }
    }
    public void generarProcesoClientePDF() {
        try {
            Date fecha = new Date();
            fechaFactura = new SimpleDateFormat("yyyy/MM/dd").format(fecha);
            String escritorio = "src/facturas/";
            int aleatorio = (int) (Math.random() * 999999);
            nombreArchivo = escritorio + "Orden No." + aleatorio + ".pdf";
            FileOutputStream archivo;
            File pdf = new File(nombreArchivo);
            archivo = new FileOutputStream(pdf);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Font letraAzul = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            Font titulo = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.BLACK);
            Font totaltamano = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK);
            Image img = Image.getInstance("src/img/imagen.jpg");
            Paragraph date = new Paragraph();
            date.add(Chunk.NEWLINE);
            date.add("No. Orden " + aleatorio + " \nFecha: " + fechaFactura + "\n\n");
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] columnaEncabezado = new float[]{15f, 0f, 40f, 30f};
            Encabezado.setWidths(columnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);
            Encabezado.addCell("");
            Encabezado.addCell(new Phrase("Restaurante Ratatoille S.A \nDirección: Tikal Futura", titulo));
            Encabezado.addCell(date);
            doc.add(Encabezado);
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Datos de Orden: ");
            doc.add(cliente);
            Paragraph datosClientes = new Paragraph();
            datosClientes.add(new Phrase("Nit: ", letraAzul));
            datosClientes.add(String.valueOf(idCliente) + "\n");
            datosClientes.add(new Phrase("Nombre: ", letraAzul));
            datosClientes.add(nombreCliente + "\n");
            doc.add(datosClientes);
            Paragraph salto = new Paragraph();
            salto.add(Chunk.NEWLINE);
            salto.setAlignment(Element.ALIGN_CENTER);
            doc.add(salto);
            agregarTablaProductosregistroCliente(doc, letraAzul, Programa.tblPedidoCliente);
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add(new Phrase("Total a Pagar: " + Programa.lblSubTotalCliente.getText(), totaltamano));
            info.add(Chunk.NEWLINE);
            String totalTexto = Programa.lblSubTotalCliente.getText();
            info.add(new Phrase("Total con IVA: Q" + calcularTotalConIVA(totalTexto), totaltamano));
            info.setAlignment(Element.ALIGN_CENTER);
            doc.add(info);
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(pdf);
        } catch (DocumentException | IOException e) {
            System.out.print("Error en: " + e);
        }
    }
    public void agregarTablaProductosregistroOrden(Document doc, Font letraAzul, JTable tblProdReg) throws DocumentException {
        PdfPTable tablaProducto = new PdfPTable(5);
        tablaProducto.setWidthPercentage(100);
        tablaProducto.getDefaultCell().setBorder(0);
        float[] columnaproducto = new float[]{40f, 15f, 15f, 15f ,30f};
        tablaProducto.setWidths(columnaproducto);
        tablaProducto.setHorizontalAlignment(Element.ALIGN_CENTER);
        String[] encabezados = {"Productos ", "Cantidad ", "Precio U ","Descuento ", "Total "};
        for (String encabezado : encabezados) {
            PdfPCell celda = new PdfPCell(new Phrase(encabezado, letraAzul));
            celda.setBorder(0);
            tablaProducto.addCell(celda);
        }
        for (int i = 0; i < tblProdReg.getRowCount(); i++) {
           
            if(tblProdReg.getValueAt(i, 0) != null){
            String producto = (String)tblProdReg.getValueAt(i, 0);
            String cantidad = String.valueOf(tblProdReg.getValueAt(i, 1));
            String precioU = String.valueOf(tblProdReg.getValueAt(i, 2));
            String descuento = String.valueOf(tblProdReg.getValueAt(i, 3));
            String subtotal = String.valueOf(tblProdReg.getValueAt(i, 4));      
            tablaProducto.addCell(producto);
            tablaProducto.addCell(cantidad);      
            tablaProducto.addCell(precioU);
            tablaProducto.addCell(descuento);
            tablaProducto.addCell(subtotal);                
            }

        }
        doc.add(tablaProducto);
        doc.add(Chunk.NEWLINE);
    }

        public void agregarTablaProductosregistroCliente(Document doc, Font letraAzul, JTable tblPedidoCliente) throws DocumentException {
        PdfPTable tablaProducto = new PdfPTable(4);
        tablaProducto.setWidthPercentage(100);
        tablaProducto.getDefaultCell().setBorder(0);
        float[] columnaproducto = new float[]{40f, 15f,  15f, 30f};
        tablaProducto.setWidths(columnaproducto);
        tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
        String[] encabezados = {"Productos ", "Cantidad ",  "Precio U ", "Total "};
        for (String encabezado : encabezados) {
            PdfPCell celda = new PdfPCell(new Phrase(encabezado, letraAzul));
            celda.setBorder(0);
            tablaProducto.addCell(celda);
        }
        for (int i = 0; i < tblPedidoCliente.getRowCount(); i++) {
            String producto = obtenerValorSeguro(tblPedidoCliente, i, 0);
            String precioU = obtenerValorSeguro(tblPedidoCliente, i, 1);
            String cantidad = obtenerValorSeguro(tblPedidoCliente, i, 2);    
            String subtotal = obtenerValorSeguro(tblPedidoCliente, i, 3);
            
            tablaProducto.addCell(producto);
            tablaProducto.addCell(precioU);
            tablaProducto.addCell(cantidad);        
            tablaProducto.addCell(subtotal);
        }
        doc.add(tablaProducto);
        doc.add(Chunk.NEWLINE);
    }
        
    public void agregarTablaProductosfinal(Document doc, Font letraAzul, JTable tblProdCompletar) throws DocumentException {
        PdfPTable tablaProducto = new PdfPTable(5);
        tablaProducto.setWidthPercentage(100);
        tablaProducto.getDefaultCell().setBorder(0);
        float[] columnaproducto = new float[]{40f, 15f, 15f, 15f, 30f};
        tablaProducto.setWidths(columnaproducto);
        tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
        String[] encabezados = {"Productos ", "Cantidad ",  "Descuento ", "Precio U ", "Total "};
        for (String encabezado : encabezados) {
            PdfPCell celda = new PdfPCell(new Phrase(encabezado, letraAzul));
            celda.setBorder(0);
            tablaProducto.addCell(celda);
        }
        for (int i = 0; i < tblProdCompletar.getRowCount(); i++) {
            String producto = obtenerValorSeguro(tblProdCompletar, i, 0);
            String cantidad = obtenerValorSeguro(tblProdCompletar, i, 1);          
            String descuento = obtenerValorSeguro(tblProdCompletar, i, 3);
            String precio = obtenerValorSeguro(tblProdCompletar, i, 2);
            String subtotal = obtenerValorSeguro(tblProdCompletar, i, 4);
            
            tablaProducto.addCell(producto);
            tablaProducto.addCell(cantidad);
            tablaProducto.addCell(descuento);
            tablaProducto.addCell(precio);
            tablaProducto.addCell(subtotal);
        }
        doc.add(tablaProducto);
        doc.add(Chunk.NEWLINE);
    }

    public double calcularTotalConIVA(String totalTexto) {
        totalTexto = totalTexto.replaceAll("[^\\d.]", "");
        double total = Double.parseDouble(totalTexto);
        double iva = total * 0.16;
        return total + iva;
    }

    private String obtenerValorSeguro(JTable tabla, int fila, int columna) {
        Object valor = tabla.getValueAt(fila, columna);
        return valor != null ? valor.toString() : "";
    }
}