package vista;

import java.awt.Color;
import controlador.ClienteControlador;
import controlador.EmpleadoControlador;
import controlador.PdfControlador;
import controlador.ProductoControlador;
import controlador.mainControlador;
import modelo.Producto;
import java.awt.CardLayout;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import controlador.PedidoControlador;
import controlador.ProveedorControlador;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Pedido;
import modelo.Proveedor;


public class Programa extends javax.swing.JFrame {
    ClienteControlador clienteControlador = new ClienteControlador();
    EmpleadoControlador empleadoControlador = new EmpleadoControlador();
    ProductoControlador productoControlador = new ProductoControlador();
    PedidoControlador pedidoControlador = new PedidoControlador();
    ProveedorControlador proveedorControlador = new ProveedorControlador();
    mainControlador mainControlador = new mainControlador();
    PdfControlador PDFControlador = new PdfControlador();
    boolean showPassword = false;
    
    List<Producto> listaProductos = productoControlador.consultarProductos();
    List<Pedido> listaPedidos = pedidoControlador.consultarPedidos();
    List<Empleado> listaEmpleados = empleadoControlador.consultarEmpleados();
    List<Proveedor> listaProveedores = proveedorControlador.consultarProveedores();
    List<Cliente> listaClientes = clienteControlador.consultarCliente();
    
    
    public Programa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        lblMensajeCorreo = new javax.swing.JLabel();
        passClave = new javax.swing.JPasswordField();
        lblTexto = new javax.swing.JLabel();
        lblDecoracion = new javax.swing.JLabel();
        lblShowHide = new javax.swing.JLabel();
        lblLoginTitle = new javax.swing.JLabel();
        lblMensajeContra = new javax.swing.JLabel();
        Registrar = new javax.swing.JPanel();
        pnlRegistrar = new javax.swing.JPanel();
        lblRegTitulo = new javax.swing.JLabel();
        txtRegNombre = new javax.swing.JTextField();
        txtRegTelefono = new javax.swing.JTextField();
        txtRegCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRegDireccion = new javax.swing.JTextField();
        lblRegBack = new javax.swing.JLabel();
        passRegClaveConf = new javax.swing.JPasswordField();
        passRegClave = new javax.swing.JPasswordField();
        lblRegMensaje = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        aplicacionCliente = new javax.swing.JPanel();
        menuBarCliente = new javax.swing.JPanel();
        lblLogOutCliente = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel44 = new javax.swing.JLabel();
        panelAppCliente = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        cbxTipoProductosCliente = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaProductosCliente = new javax.swing.JList<>();
        lblNombreProductoCliente = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAreaDescripcionProductoCliente = new javax.swing.JTextArea();
        lblPrecioCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblPedidoCliente = new javax.swing.JTable();
        btnEliminarMesero1 = new javax.swing.JButton();
        btnMenosItemCliente = new javax.swing.JButton();
        spnMenosCantidadCliente = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lblTotalCompletoCliente = new javax.swing.JLabel();
        lblSubTotalCliente = new javax.swing.JLabel();
        lblImpuestosCliente = new javax.swing.JLabel();
        btnGenerarPedidoCliente = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        txtNitCliente = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblDisponiblesCliente = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        aplicacionCajero = new javax.swing.JPanel();
        menuBarCajero = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRegistrarOrden = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblCompletarOrden = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblConsultarPedido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuCajero = new javax.swing.JPanel();
        regOrden = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdReg = new javax.swing.JTable();
        lblNumPedido = new javax.swing.JLabel();
        btnEliminarTabla = new javax.swing.JButton();
        btnEliminarItem = new javax.swing.JButton();
        btnDescuentoTabla = new javax.swing.JButton();
        cbxDescuento = new javax.swing.JComboBox<>();
        spnMenosCantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        lblDescuentoTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblSubTotalMostrar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblImpuestos = new javax.swing.JLabel();
        btnPagarPedido = new javax.swing.JButton();
        lblTotalRecibo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxRegProductos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProductos = new javax.swing.JList<>();
        spnCantReg = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblDispReg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPrecioReg = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotReg = new javax.swing.JLabel();
        lblAddReg = new javax.swing.JLabel();
        compOrden = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblProdCompletar = new javax.swing.JTable();
        btnEliminarTablaNoCompletado = new javax.swing.JButton();
        btnDescuentoTablaNoComp = new javax.swing.JButton();
        cbxDescuentoNoComp = new javax.swing.JComboBox<>();
        spnMenosCantidadNoComp = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        lblDescuentoTotalNoCompletados = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblSubTotalNoComp = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblImpuestosNoComp = new javax.swing.JLabel();
        btnPagarPedidoNoComp = new javax.swing.JButton();
        lblTotalReciboNoComp = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNITNoComp = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaProductosPendientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        consultarPedidos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConsultaPedidos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDescuentoTotalConsulta = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblSubTotalConsulta = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblImpuestosConsulta = new javax.swing.JLabel();
        lblTotalReciboConsulta = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNitConsulta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPedidos = new javax.swing.JList<>();
        cbxFiltrarPedidos = new javax.swing.JComboBox<>();
        aplicacionMesero = new javax.swing.JPanel();
        menuBarMesero = new javax.swing.JPanel();
        lblLogOutMesero = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        panelAppMesero = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaProductosMesero = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        cbxTipoProductosMesero = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        btnAgregarMesero = new javax.swing.JButton();
        lblDisponibleMesero = new javax.swing.JLabel();
        lblPrecioMesero = new javax.swing.JLabel();
        spnCantidadMesero = new javax.swing.JSpinner();
        lblTotalMesero = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblPedidoMesero = new javax.swing.JTable();
        btnEliminarMesero = new javax.swing.JButton();
        btnMenosItemMesero = new javax.swing.JButton();
        spnMenosCantidadMesero = new javax.swing.JSpinner();
        btnDescuento = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblTotalCompletoMesero = new javax.swing.JLabel();
        lblSubTotalMesero = new javax.swing.JLabel();
        lblDescuentoMesero = new javax.swing.JLabel();
        lblImpuestosMesero = new javax.swing.JLabel();
        btnGenerarPedido = new javax.swing.JButton();
        cbxDescuentoMesero = new javax.swing.JComboBox<>();
        lblNumPedidoMesero = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtNitMesero = new javax.swing.JTextField();
        aplicacionAdmin = new javax.swing.JPanel();
        menuBarProveedor = new javax.swing.JPanel();
        lblLogOut1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        lblGestionEmpleados = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        lblGestionProductos = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        lblGestionProveedore = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblGestionProveedore1 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        appAdmin = new javax.swing.JPanel();
        pnlGestionEmpleados = new javax.swing.JPanel();
        tabPaneGestionEmpleados = new javax.swing.JTabbedPane();
        pnlRegistrarEmpleado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtAreaDireccionEmpleado = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        txtCargoEmpleado = new javax.swing.JTextField();
        txtSalarioEmpleado = new javax.swing.JTextField();
        txtEmailEmpleado = new javax.swing.JTextField();
        txtClaveEmpleado = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblMensaje1 = new javax.swing.JLabel();
        pnlActualizarEmpleado = new javax.swing.JPanel();
        pnlConsultarEmpleadoAdmin1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblConsultarEmpleadosActualizar = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNombreConsultaEmpleado1 = new javax.swing.JLabel();
        lblEmailConsultaEmpleado1 = new javax.swing.JLabel();
        lblTelefonoConsultaEmpleado1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        lblEstadoActualizarEmpleado = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtAreaDireccionActualizarEmpleado = new javax.swing.JTextArea();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        lblCargoConsultaEmpleado1 = new javax.swing.JLabel();
        lblSalarioConsultaEmpleado1 = new javax.swing.JLabel();
        lblFechaActualizarEmpleado = new javax.swing.JLabel();
        txtNombreActualizarEmpleado = new javax.swing.JTextField();
        txtCorreoActualizarEmpleado = new javax.swing.JTextField();
        txtTelefonoActualizarEmpleado = new javax.swing.JTextField();
        txtCargoActualizarEmpleado = new javax.swing.JTextField();
        txtSalarioActualizarEmpleado = new javax.swing.JTextField();
        chbxBajaEmpleado = new javax.swing.JCheckBox();
        txtApellidoActualizarEmpleado = new javax.swing.JTextField();
        lblNombreConsultaEmpleado2 = new javax.swing.JLabel();
        btnActualizarEmpleado = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        txtClaveActualizarEmpleado = new javax.swing.JTextField();
        lblMensajeActualizarEmpleado = new javax.swing.JLabel();
        pnlConsultarEmpleadoAdmin = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblConsultarEmpleados = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        cbxAgruparEmpleados = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblNombreConsultaEmpleado = new javax.swing.JLabel();
        lblEmailConsultaEmpleado = new javax.swing.JLabel();
        lblTelefonoConsultaEmpleado = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        lblEstadoConsultaEmpleado = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaDireccionConsultaEmpleado = new javax.swing.JTextArea();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        lblCargoConsultaEmpleado = new javax.swing.JLabel();
        lblSalarioConsultaEmpleado = new javax.swing.JLabel();
        lblFechaConsultaEmpleado = new javax.swing.JLabel();
        pnlGestionProductos = new javax.swing.JPanel();
        tabPaneGestionProductos = new javax.swing.JTabbedPane();
        pnlRegistrarProducto = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        txtNombreProductoReg = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtAreaDescripcionProdReg = new javax.swing.JTextArea();
        txtStockProductoReg = new javax.swing.JTextField();
        txtPrecioProdReg = new javax.swing.JTextField();
        txtTipoProductoReg = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        lblMensajeProducto = new javax.swing.JLabel();
        lblMensaje3 = new javax.swing.JLabel();
        pnlActualizarProducto = new javax.swing.JPanel();
        pnlActualizarProd = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblConsultarProductosActualizar = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblNombreConsultaEmpleado3 = new javax.swing.JLabel();
        lblEmailConsultaEmpleado2 = new javax.swing.JLabel();
        lblTelefonoConsultaEmpleado2 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel78 = new javax.swing.JLabel();
        lblEstadoActualizarProducto = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtAreaDescripProdActualizar = new javax.swing.JTextArea();
        jSeparator22 = new javax.swing.JSeparator();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtTipoProducto = new javax.swing.JTextField();
        chbxBajaProducto = new javax.swing.JCheckBox();
        txtStockProducto = new javax.swing.JTextField();
        lblNombreConsultaEmpleado4 = new javax.swing.JLabel();
        btnActualizarProducto = new javax.swing.JButton();
        lblMensajeActualizarProducto = new javax.swing.JLabel();
        pnlConsultarProducto = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblConsultarProductos = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        cbxAgruparProductos = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        lblNombreConsultaProducto = new javax.swing.JLabel();
        lblPrecioConsulta = new javax.swing.JLabel();
        lblStockProducto = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel84 = new javax.swing.JLabel();
        lblEstadoConsultaProducto = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtAreaDescripcionProducto = new javax.swing.JTextArea();
        jSeparator25 = new javax.swing.JSeparator();
        lblTipoProducto = new javax.swing.JLabel();
        pnlGestionProveedores = new javax.swing.JPanel();
        tabPaneGestionProveedores = new javax.swing.JTabbedPane();
        pnlRegistrarProveedor = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        txtNombreProveedorReg = new javax.swing.JTextField();
        txtNitProveedorReg = new javax.swing.JTextField();
        txtContactoProveedor = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtAreaDireccionProveedorReg = new javax.swing.JTextArea();
        jLabel90 = new javax.swing.JLabel();
        txtTelefonoEmpresarialReg = new javax.swing.JTextField();
        txtTelefonoContactoReg = new javax.swing.JTextField();
        btnRegistrarProveedor = new javax.swing.JButton();
        lblMensajeProveedor = new javax.swing.JLabel();
        pnlActualizarProveedor = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        tblConsultarProveedoresAdm = new javax.swing.JTable();
        jLabel91 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblNombreConsultaEmpleado5 = new javax.swing.JLabel();
        lblEmailConsultaEmpleado3 = new javax.swing.JLabel();
        lblTelefonoConsultaEmpleado3 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtAreaDireccionActualizarProveedor = new javax.swing.JTextArea();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel95 = new javax.swing.JLabel();
        lblSalarioConsultaEmpleado2 = new javax.swing.JLabel();
        txtNombreActualizarProveedor = new javax.swing.JTextField();
        txtNitActualizarProveedor = new javax.swing.JTextField();
        txtContactoActualizarProveedor = new javax.swing.JTextField();
        txtTelefonoEmpresarialAct = new javax.swing.JTextField();
        btnActualizarProveedor = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        txtTelefonoContacto = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        lblMensajeActualizarProveedor = new javax.swing.JLabel();
        pnlConsultarProveedor = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tblConsultarProveedores = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblNombreConsultaProveedor = new javax.swing.JLabel();
        lblContactoProveedor = new javax.swing.JLabel();
        lblNitProveedor = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txtAreaDireccionProveedor = new javax.swing.JTextArea();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel101 = new javax.swing.JLabel();
        lblTelefonoEmpresaProveedor = new javax.swing.JLabel();
        lblTelefonoContactoProveedor = new javax.swing.JLabel();
        pnlGestionClientes = new javax.swing.JPanel();
        pnlGestionClientesMain = new javax.swing.JPanel();
        tabPaneGestionClientes = new javax.swing.JTabbedPane();
        pnlRegistrarCliente = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        txtNombreClienteReg = new javax.swing.JTextField();
        txtTelefonoReg = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtAreaDireccionClienteReg = new javax.swing.JTextArea();
        jLabel106 = new javax.swing.JLabel();
        txtCorreoClienteReg = new javax.swing.JTextField();
        txtClaveClienteReg = new javax.swing.JTextField();
        btnRegistrarCliente = new javax.swing.JButton();
        lblMensajeCliente = new javax.swing.JLabel();
        lblMensaje5 = new javax.swing.JLabel();
        pnlActualizarCliente = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblActualizarClientes = new javax.swing.JTable();
        jLabel107 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblNombreConsultaEmpleado6 = new javax.swing.JLabel();
        lblEmailConsultaEmpleado4 = new javax.swing.JLabel();
        lblTelefonoConsultaEmpleado4 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        txtAreaDireccionActualizarCliente = new javax.swing.JTextArea();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        lblSalarioConsultaEmpleado3 = new javax.swing.JLabel();
        txtNombreActualizarCliente = new javax.swing.JTextField();
        txtTelefonoActualizarCliente = new javax.swing.JTextField();
        txtNitActualizarCliente = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        btnActualizarCliente = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        lblMensajeClientesActualizar = new javax.swing.JLabel();
        pnlConsultarCliente = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblConsultarClientesAdmin = new javax.swing.JTable();
        jLabel113 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblNombreClienteConsulta = new javax.swing.JLabel();
        lblTelefonoClienteConsulta = new javax.swing.JLabel();
        lblNitCliente = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        txtAreaDireccionClienteConsulta = new javax.swing.JTextArea();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel116 = new javax.swing.JLabel();
        lblClienteCorreoConsultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(11, 14, 29));
        Login.setMinimumSize(new java.awt.Dimension(800, 600));
        Login.setLayout(null);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vivanda_logo_durazno.jpg"))); // NOI18N
        Login.add(icono);
        icono.setBounds(90, 90, 260, 360);

        panelLogin.setBackground(new java.awt.Color(44, 57, 94));
        panelLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        txtCorreo.setBackground(new java.awt.Color(34, 40, 49));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(102, 153, 255));
        lblRegistrar.setText("Registrar una cuenta");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
        });

        lblMensajeCorreo.setForeground(new java.awt.Color(255, 51, 51));

        passClave.setBackground(new java.awt.Color(34, 40, 49));
        passClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passClave.setForeground(new java.awt.Color(153, 153, 153));
        passClave.setText("Contraseña");
        passClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passClave.setEchoChar('\u0000');
        passClave.setFocusAccelerator((char)0);
        passClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passClaveFocusLost(evt);
            }
        });

        lblTexto.setBackground(new java.awt.Color(255, 255, 255));
        lblTexto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("¿No tienes una cuenta?");

        lblDecoracion.setForeground(new java.awt.Color(102, 102, 102));
        lblDecoracion.setText("--------------------------- O ----------------------------");

        lblShowHide.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblShowHide.setForeground(new java.awt.Color(102, 153, 255));
        lblShowHide.setText("Mostrar");
        lblShowHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowHideMouseClicked(evt);
            }
        });

        lblLoginTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Iniciar Sesión");
        lblLoginTitle.setToolTipText("");

        lblMensajeContra.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexto)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRegistrar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeContra, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensajeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShowHide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lblDecoracion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblLoginTitle)
                .addGap(43, 43, 43)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblShowHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passClave, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeContra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDecoracion)
                .addGap(18, 18, 18)
                .addComponent(lblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrar)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        Login.add(panelLogin);
        panelLogin.setBounds(400, 60, 370, 470);

        mainPanel.add(Login, "login");

        Registrar.setBackground(new java.awt.Color(30, 40, 49));
        Registrar.setMinimumSize(new java.awt.Dimension(800, 600));
        Registrar.setLayout(null);

        pnlRegistrar.setBackground(new java.awt.Color(57, 62, 70));
        pnlRegistrar.setPreferredSize(new java.awt.Dimension(800, 600));

        lblRegTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblRegTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lblRegTitulo.setText("Registrar una Cuenta");

        txtRegNombre.setBackground(new java.awt.Color(34, 40, 49));
        txtRegNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtRegNombre.setText("Nombre");
        txtRegNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegNombreFocusLost(evt);
            }
        });

        txtRegTelefono.setBackground(new java.awt.Color(34, 40, 49));
        txtRegTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtRegTelefono.setText("Telefono");
        txtRegTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegTelefonoFocusLost(evt);
            }
        });

        txtRegCorreo.setBackground(new java.awt.Color(34, 40, 49));
        txtRegCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtRegCorreo.setText("nombre@ejemplo.com");
        txtRegCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegCorreoFocusLost(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("-----------------------------------------------------------");

        txtRegDireccion.setBackground(new java.awt.Color(34, 40, 49));
        txtRegDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRegDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtRegDireccion.setText("Dirección");
        txtRegDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRegDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRegDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegDireccionFocusLost(evt);
            }
        });

        lblRegBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        lblRegBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegBackMouseClicked(evt);
            }
        });

        passRegClaveConf.setBackground(new java.awt.Color(34, 40, 49));
        passRegClaveConf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passRegClaveConf.setForeground(new java.awt.Color(153, 153, 153));
        passRegClaveConf.setText("Confirmar Contraseña");
        passRegClaveConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passRegClaveConf.setEchoChar('\u0000');
        passRegClaveConf.setFocusAccelerator((char)0);
        passRegClaveConf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passRegClaveConfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passRegClaveConfFocusLost(evt);
            }
        });
        passRegClaveConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRegClaveConfActionPerformed(evt);
            }
        });

        passRegClave.setBackground(new java.awt.Color(34, 40, 49));
        passRegClave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passRegClave.setForeground(new java.awt.Color(153, 153, 153));
        passRegClave.setText("Contraseña");
        passRegClave.setToolTipText("HOLAAAA");
        passRegClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        passRegClave.setEchoChar('\u0000');
        passRegClave.setFocusAccelerator((char)0);
        passRegClave.setPreferredSize(new java.awt.Dimension(64, 16));
        passRegClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passRegClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passRegClaveFocusLost(evt);
            }
        });
        passRegClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRegClaveActionPerformed(evt);
            }
        });

        lblRegMensaje.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegMensaje.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblRegBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblRegTitulo))
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passRegClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passRegClaveConf)
                            .addComponent(lblRegMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRegBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(txtRegNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRegTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRegDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passRegClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passRegClaveConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Registrar.add(pnlRegistrar);
        pnlRegistrar.setBounds(310, 40, 470, 520);

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Vivanda_logo_durazno.jpg"))); // NOI18N
        lblIcono.setToolTipText("");
        Registrar.add(lblIcono);
        lblIcono.setBounds(30, 90, 260, 410);

        mainPanel.add(Registrar, "registrar");

        aplicacionCliente.setBackground(new java.awt.Color(30, 40, 49));
        aplicacionCliente.setLayout(new java.awt.BorderLayout());

        menuBarCliente.setBackground(new java.awt.Color(57, 62, 70));
        menuBarCliente.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarCliente.setPreferredSize(new java.awt.Dimension(800, 50));

        lblLogOutCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOutCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOutCliente.setText("Cerrar Sesión");
        lblLogOutCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutClienteMouseClicked(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel44.setToolTipText("");

        javax.swing.GroupLayout menuBarClienteLayout = new javax.swing.GroupLayout(menuBarCliente);
        menuBarCliente.setLayout(menuBarClienteLayout);
        menuBarClienteLayout.setHorizontalGroup(
            menuBarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 670, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOutCliente)
                .addContainerGap())
        );
        menuBarClienteLayout.setVerticalGroup(
            menuBarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOutCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        aplicacionCliente.add(menuBarCliente, java.awt.BorderLayout.NORTH);

        panelAppCliente.setBackground(new java.awt.Color(30, 40, 49));
        panelAppCliente.setMaximumSize(new java.awt.Dimension(800, 550));
        panelAppCliente.setMinimumSize(new java.awt.Dimension(800, 550));
        panelAppCliente.setPreferredSize(new java.awt.Dimension(800, 550));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Filtrar Productos:");

        cbxTipoProductosCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cbxTipoProductosCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoProductosClienteItemStateChanged(evt);
            }
        });

        listaProductosCliente.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductosClienteValueChanged(evt);
            }
        });
        jScrollPane12.setViewportView(listaProductosCliente);

        lblNombreProductoCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreProductoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreProductoCliente.setText("Producto");

        txtAreaDescripcionProductoCliente.setColumns(15);
        txtAreaDescripcionProductoCliente.setLineWrap(true);
        txtAreaDescripcionProductoCliente.setRows(5);
        txtAreaDescripcionProductoCliente.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txtAreaDescripcionProductoCliente);

        lblPrecioCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPrecioCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioCliente.setText("Precio");

        jButton1.setText("Agregar al Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel9.setPreferredSize(new java.awt.Dimension(430, 556));

        tblPedidoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio U", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tblPedidoCliente);
        if (tblPedidoCliente.getColumnModel().getColumnCount() > 0) {
            tblPedidoCliente.getColumnModel().getColumn(0).setMinWidth(250);
        }

        btnEliminarMesero1.setText("Eliminar Orden");
        btnEliminarMesero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMesero1ActionPerformed(evt);
            }
        });

        btnMenosItemCliente.setText("- Item");
        btnMenosItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosItemClienteActionPerformed(evt);
            }
        });

        spnMenosCantidadCliente.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel57.setText("SubTotal:");

        jLabel59.setText("Impuestos:");

        jLabel60.setText("Total:");

        lblTotalCompletoCliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalCompletoCliente.setText("Q 0.00");

        lblSubTotalCliente.setText("Q 0.00");

        lblImpuestosCliente.setText("Q 0.00");

        btnGenerarPedidoCliente.setText("Realizar Pedido");
        btnGenerarPedidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoClienteActionPerformed(evt);
            }
        });

        jLabel61.setText("NIT:");

        jLabel62.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("PEDIDO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnMenosItemCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnMenosCantidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarMesero1))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSubTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImpuestosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel60)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalCompletoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerarPedidoCliente)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarMesero1)
                    .addComponent(btnMenosItemCliente)
                    .addComponent(spnMenosCantidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(lblSubTotalCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImpuestosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalCompletoCliente)
                        .addComponent(jLabel60)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNitCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(btnGenerarPedidoCliente))
                .addGap(40, 40, 40))
        );

        lblDisponiblesCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDisponiblesCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblDisponiblesCliente.setText("Disponibles");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout panelAppClienteLayout = new javax.swing.GroupLayout(panelAppCliente);
        panelAppCliente.setLayout(panelAppClienteLayout);
        panelAppClienteLayout.setHorizontalGroup(
            panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addComponent(jScrollPane12)
                    .addGroup(panelAppClienteLayout.createSequentialGroup()
                        .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAppClienteLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(cbxTipoProductosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreProductoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAppClienteLayout.createSequentialGroup()
                                .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisponiblesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAppClienteLayout.setVerticalGroup(
            panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAppClienteLayout.createSequentialGroup()
                        .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(cbxTipoProductosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreProductoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAppClienteLayout.createSequentialGroup()
                                .addComponent(lblPrecioCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDisponiblesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAppClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionCliente.add(panelAppCliente, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionCliente, "appCliente");

        aplicacionCajero.setBackground(new java.awt.Color(204, 102, 0));
        aplicacionCajero.setForeground(new java.awt.Color(102, 102, 255));
        aplicacionCajero.setPreferredSize(new java.awt.Dimension(800, 600));
        aplicacionCajero.setLayout(new java.awt.BorderLayout());

        menuBarCajero.setBackground(new java.awt.Color(57, 62, 70));
        menuBarCajero.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarCajero.setPreferredSize(new java.awt.Dimension(800, 42));

        lblLogOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setText("Cerrar Sesión");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblRegistrarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRegistrarOrden.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarOrden.setText("Registrar Orden");
        lblRegistrarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarOrdenMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCompletarOrden.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCompletarOrden.setForeground(new java.awt.Color(255, 255, 255));
        lblCompletarOrden.setText("Completar Orden");
        lblCompletarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompletarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompletarOrdenMouseClicked(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblConsultarPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblConsultarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarPedido.setText("Consultar Pedidos");
        lblConsultarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarPedidoMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout menuBarCajeroLayout = new javax.swing.GroupLayout(menuBarCajero);
        menuBarCajero.setLayout(menuBarCajeroLayout);
        menuBarCajeroLayout.setHorizontalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(lblConsultarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCompletarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistrarOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOut)
                .addContainerGap())
        );
        menuBarCajeroLayout.setVerticalGroup(
            menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarCajeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarCajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegistrarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCompletarOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConsultarPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionCajero.add(menuBarCajero, java.awt.BorderLayout.NORTH);

        menuCajero.setBackground(new java.awt.Color(30, 40, 49));
        menuCajero.setPreferredSize(new java.awt.Dimension(800, 560));
        menuCajero.setLayout(new java.awt.CardLayout());

        regOrden.setBackground(new java.awt.Color(30, 40, 49));
        regOrden.setPreferredSize(new java.awt.Dimension(800, 540));

        jPanel1.setBackground(new java.awt.Color(57, 62, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 550));

        tblProdReg.setBackground(new java.awt.Color(204, 204, 204));
        tblProdReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblProdReg.setForeground(new java.awt.Color(0, 0, 0));
        tblProdReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio U", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdReg.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane2.setViewportView(tblProdReg);
        if (tblProdReg.getColumnModel().getColumnCount() > 0) {
            tblProdReg.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        lblNumPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNumPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblNumPedido.setText("Pedido #");

        btnEliminarTabla.setText("- Item");
        btnEliminarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaActionPerformed(evt);
            }
        });

        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });

        btnDescuentoTabla.setText("Aplicar Descuento");
        btnDescuentoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoTablaActionPerformed(evt);
            }
        });

        cbxDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.05", "0.03", "0.1", "0.08" }));

        spnMenosCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descuento:");

        lblDescuentoTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotal.setText("Q 0.00");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SubTotal:");

        lblSubTotalMostrar.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalMostrar.setText("Q 0.00");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Impuestos:");

        lblImpuestos.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestos.setText("Q 0.00");

        btnPagarPedido.setText("Generar Factura");
        btnPagarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPedidoActionPerformed(evt);
            }
        });

        lblTotalRecibo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalRecibo.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalRecibo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalRecibo.setText("Q 0.00");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Total :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIT");

        txtNIT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNIT.setForeground(new java.awt.Color(204, 204, 204));
        txtNIT.setText("Ingresar nit");
        txtNIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNITFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNITFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumPedido)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarPedido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescuentoTotal)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDescuentoTabla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarTabla)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMenosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblSubTotalMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblTotalRecibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarItem)
                    .addComponent(cbxDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuentoTabla)
                    .addComponent(spnMenosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblDescuentoTotal)
                    .addComponent(jLabel18)
                    .addComponent(lblImpuestos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSubTotalMostrar)
                    .addComponent(lblTotalRecibo)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarPedido)
                    .addComponent(jLabel6)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Producto");

        cbxRegProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbxRegProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRegProductosItemStateChanged(evt);
            }
        });

        listProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listProductosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listProductos);

        spnCantReg.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnCantReg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantRegStateChanged(evt);
            }
        });
        spnCantReg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnCantRegPropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Disponible");

        lblDispReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDispReg.setForeground(new java.awt.Color(255, 255, 255));
        lblDispReg.setText("-");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio");

        lblPrecioReg.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioReg.setText("Q 0.0");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");

        lblTotReg.setForeground(new java.awt.Color(255, 255, 255));
        lblTotReg.setText("Q 0.0");

        lblAddReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        lblAddReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddRegMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout regOrdenLayout = new javax.swing.GroupLayout(regOrden);
        regOrden.setLayout(regOrdenLayout);
        regOrdenLayout.setHorizontalGroup(
            regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRegProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDispReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(spnCantReg, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAddReg)))
                .addContainerGap())
        );
        regOrdenLayout.setVerticalGroup(
            regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(regOrdenLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxRegProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblAddReg))
                            .addGroup(regOrdenLayout.createSequentialGroup()
                                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regOrdenLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDispReg)
                                            .addComponent(jLabel11)
                                            .addComponent(lblPrecioReg)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regOrdenLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(lblTotReg))
                                    .addGroup(regOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spnCantReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        menuCajero.add(regOrden, "regOrden");

        compOrden.setBackground(new java.awt.Color(30, 40, 49));

        jPanel6.setBackground(new java.awt.Color(57, 62, 70));
        jPanel6.setPreferredSize(new java.awt.Dimension(420, 550));

        tblProdCompletar.setBackground(new java.awt.Color(204, 204, 204));
        tblProdCompletar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblProdCompletar.setForeground(new java.awt.Color(0, 0, 0));
        tblProdCompletar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio U", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProdCompletar.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane8.setViewportView(tblProdCompletar);
        if (tblProdCompletar.getColumnModel().getColumnCount() > 0) {
            tblProdCompletar.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        btnEliminarTablaNoCompletado.setText("- Item");
        btnEliminarTablaNoCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaNoCompletadoActionPerformed(evt);
            }
        });

        btnDescuentoTablaNoComp.setText("Aplicar Descuento");
        btnDescuentoTablaNoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoTablaNoCompActionPerformed(evt);
            }
        });

        cbxDescuentoNoComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.05", "0.03", "0.1", "0.08" }));

        spnMenosCantidadNoComp.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Descuento:");

        lblDescuentoTotalNoCompletados.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotalNoCompletados.setText("Q 0.00");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("SubTotal:");

        lblSubTotalNoComp.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalNoComp.setText("Q 0.00");

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Impuestos:");

        lblImpuestosNoComp.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestosNoComp.setText("Q 0.00");

        btnPagarPedidoNoComp.setText("Generar Factura");
        btnPagarPedidoNoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPedidoNoCompActionPerformed(evt);
            }
        });

        lblTotalReciboNoComp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalReciboNoComp.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalReciboNoComp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalReciboNoComp.setText("Q 0.00");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Total :");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("NIT");

        txtNITNoComp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNITNoComp.setForeground(new java.awt.Color(204, 204, 204));
        txtNITNoComp.setText("Ingresar nit");
        txtNITNoComp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNITNoCompFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNITNoCompFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(lblDescuentoTotalNoCompletados)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(btnDescuentoTablaNoComp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxDescuentoNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblImpuestosNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarTablaNoCompletado)
                                    .addComponent(jLabel38))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMenosCantidadNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblSubTotalNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40)))))
                        .addGap(5, 5, 5)
                        .addComponent(lblTotalReciboNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNITNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarPedidoNoComp)))
                .addContainerGap())
            .addComponent(jScrollPane8)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDescuentoNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuentoTablaNoComp)
                    .addComponent(spnMenosCantidadNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTablaNoCompletado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(lblDescuentoTotalNoCompletados)
                    .addComponent(jLabel39)
                    .addComponent(lblImpuestosNoComp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(lblSubTotalNoComp)
                    .addComponent(lblTotalReciboNoComp)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarPedidoNoComp)
                    .addComponent(jLabel41)
                    .addComponent(txtNITNoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        listaProductosPendientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProductosPendientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductosPendientesValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(listaProductosPendientes);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos no completados");

        javax.swing.GroupLayout compOrdenLayout = new javax.swing.GroupLayout(compOrden);
        compOrden.setLayout(compOrdenLayout);
        compOrdenLayout.setHorizontalGroup(
            compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addContainerGap())))
        );
        compOrdenLayout.setVerticalGroup(
            compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuCajero.add(compOrden, "compOrden");

        consultarPedidos.setBackground(new java.awt.Color(30, 40, 49));
        consultarPedidos.setPreferredSize(new java.awt.Dimension(828, 600));

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(420, 550));

        tblConsultaPedidos.setBackground(new java.awt.Color(204, 204, 204));
        tblConsultaPedidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblConsultaPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tblConsultaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio U", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultaPedidos.setPreferredSize(new java.awt.Dimension(420, 80));
        jScrollPane4.setViewportView(tblConsultaPedidos);
        if (tblConsultaPedidos.getColumnModel().getColumnCount() > 0) {
            tblConsultaPedidos.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pedido #");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Descuento:");

        lblDescuentoTotalConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblDescuentoTotalConsulta.setText("Q 0.00");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SubTotal:");

        lblSubTotalConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotalConsulta.setText("Q 0.00");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Impuestos:");

        lblImpuestosConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestosConsulta.setText("Q 0.00");

        lblTotalReciboConsulta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalReciboConsulta.setForeground(new java.awt.Color(102, 102, 255));
        lblTotalReciboConsulta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalReciboConsulta.setText("Q 0.00");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NIT:");

        lblNitConsulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNitConsulta.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        lblNombreConsulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreConsulta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblDescuentoTotalConsulta)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblImpuestosConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblSubTotalConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNitConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalReciboConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblDescuentoTotalConsulta)
                    .addComponent(jLabel20)
                    .addComponent(lblImpuestosConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblSubTotalConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNitConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lblTotalReciboConsulta))
                        .addGap(42, 42, 42))))
        );

        listPedidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listPedidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPedidosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPedidos);

        cbxFiltrarPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Completados", "No Completados", " " }));
        cbxFiltrarPedidos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiltrarPedidosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout consultarPedidosLayout = new javax.swing.GroupLayout(consultarPedidos);
        consultarPedidos.setLayout(consultarPedidosLayout);
        consultarPedidosLayout.setHorizontalGroup(
            consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(consultarPedidosLayout.createSequentialGroup()
                        .addComponent(cbxFiltrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        consultarPedidosLayout.setVerticalGroup(
            consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultarPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultarPedidosLayout.createSequentialGroup()
                        .addComponent(cbxFiltrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuCajero.add(consultarPedidos, "consPedidos");

        aplicacionCajero.add(menuCajero, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionCajero, "appCajero");

        aplicacionMesero.setLayout(new java.awt.BorderLayout());

        menuBarMesero.setBackground(new java.awt.Color(57, 62, 70));
        menuBarMesero.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarMesero.setPreferredSize(new java.awt.Dimension(800, 42));

        lblLogOutMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOutMesero.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOutMesero.setText("Cerrar Sesión");
        lblLogOutMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMeseroMouseClicked(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel42.setToolTipText("");

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Registrar Pedido");

        javax.swing.GroupLayout menuBarMeseroLayout = new javax.swing.GroupLayout(menuBarMesero);
        menuBarMesero.setLayout(menuBarMeseroLayout);
        menuBarMeseroLayout.setHorizontalGroup(
            menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(207, 207, 207)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOutMesero)
                .addContainerGap())
        );
        menuBarMeseroLayout.setVerticalGroup(
            menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(menuBarMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLogOutMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionMesero.add(menuBarMesero, java.awt.BorderLayout.NORTH);

        panelAppMesero.setBackground(new java.awt.Color(30, 40, 49));

        listaProductosMesero.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProductosMeseroValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(listaProductosMesero);

        jLabel4.setText("Tipo de producto:");

        cbxTipoProductosMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cbxTipoProductosMesero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoProductosMeseroItemStateChanged(evt);
            }
        });

        jLabel53.setText("Disponible:");

        jLabel54.setText("Cantidad:");

        jLabel55.setText("Precio:");

        jLabel56.setText("Total:");

        btnAgregarMesero.setText("AGREGAR");
        btnAgregarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMeseroActionPerformed(evt);
            }
        });

        lblDisponibleMesero.setText("-");

        lblPrecioMesero.setText("Q 0.00");

        spnCantidadMesero.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadMeseroStateChanged(evt);
            }
        });
        spnCantidadMesero.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnCantidadMeseroPropertyChange(evt);
            }
        });

        lblTotalMesero.setText("Q 0.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarMesero))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoProductosMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addGap(18, 18, 18)
                                .addComponent(spnCantidadMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotalMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel55)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPrecioMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblDisponibleMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoProductosMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(lblDisponibleMesero))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(spnCantidadMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(lblPrecioMesero))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(lblTotalMesero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarMesero)
                .addContainerGap())
        );

        tblPedidoMesero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio U", "Cantidad", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblPedidoMesero);
        if (tblPedidoMesero.getColumnModel().getColumnCount() > 0) {
            tblPedidoMesero.getColumnModel().getColumn(0).setMinWidth(250);
            tblPedidoMesero.getColumnModel().getColumn(3).setHeaderValue("Descuento");
        }

        btnEliminarMesero.setText("Eliminar Producto");
        btnEliminarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMeseroActionPerformed(evt);
            }
        });

        btnMenosItemMesero.setText("- Item");
        btnMenosItemMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosItemMeseroActionPerformed(evt);
            }
        });

        spnMenosCantidadMesero.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnDescuento.setText("Descuento");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });

        jLabel45.setText("SubTotal:");

        jLabel46.setText("Descuento:");

        jLabel47.setText("Impuestos:");

        jLabel48.setText("Total:");

        lblTotalCompletoMesero.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotalCompletoMesero.setText("Q 0.00");

        lblSubTotalMesero.setText("Q 0.00");

        lblDescuentoMesero.setText("Q 0.00");

        lblImpuestosMesero.setText("Q 0.00");

        btnGenerarPedido.setText("Generar Pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        cbxDescuentoMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.03", "0.1", "0.08", "0.05" }));

        lblNumPedidoMesero.setText("Pedido #");

        jLabel50.setText("NIT:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(lblImpuestosMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNitMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTotalCompletoMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnMenosItemMesero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnMenosCantidadMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDescuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxDescuentoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarMesero))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumPedidoMesero)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel45))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubTotalMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescuentoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNumPedidoMesero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarMesero)
                    .addComponent(btnMenosItemMesero)
                    .addComponent(spnMenosCantidadMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescuento)
                    .addComponent(cbxDescuentoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lblSubTotalMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(lblDescuentoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImpuestosMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(lblTotalCompletoMesero)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarPedido)
                    .addComponent(jLabel50)
                    .addComponent(txtNitMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelAppMeseroLayout = new javax.swing.GroupLayout(panelAppMesero);
        panelAppMesero.setLayout(panelAppMeseroLayout);
        panelAppMeseroLayout.setHorizontalGroup(
            panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAppMeseroLayout.setVerticalGroup(
            panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppMeseroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAppMeseroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        aplicacionMesero.add(panelAppMesero, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionMesero, "appMesero");

        aplicacionAdmin.setPreferredSize(new java.awt.Dimension(800, 600));
        aplicacionAdmin.setLayout(new java.awt.BorderLayout());

        menuBarProveedor.setBackground(new java.awt.Color(57, 62, 70));
        menuBarProveedor.setMaximumSize(new java.awt.Dimension(800, 42));
        menuBarProveedor.setMinimumSize(new java.awt.Dimension(800, 42));
        menuBarProveedor.setPreferredSize(new java.awt.Dimension(800, 42));

        lblLogOut1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblLogOut1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut1.setText("Cerrar Sesión");
        lblLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut1MouseClicked(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblGestionEmpleados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGestionEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionEmpleados.setText("Gestion de Empleados");
        lblGestionEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGestionEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionEmpleadosMouseClicked(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblGestionProductos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGestionProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionProductos.setText("Gestion de Productos");
        lblGestionProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGestionProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionProductosMouseClicked(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblGestionProveedore.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGestionProveedore.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionProveedore.setText("Gestion de Proveedores");
        lblGestionProveedore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGestionProveedore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionProveedoreMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food-icon.png"))); // NOI18N
        jLabel16.setToolTipText("");

        lblGestionProveedore1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGestionProveedore1.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionProveedore1.setText("Gestion de Clientes ");
        lblGestionProveedore1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGestionProveedore1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblGestionProveedore1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGestionProveedore1MouseClicked(evt);
            }
        });

        jSeparator41.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator41.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout menuBarProveedorLayout = new javax.swing.GroupLayout(menuBarProveedor);
        menuBarProveedor.setLayout(menuBarProveedorLayout);
        menuBarProveedorLayout.setHorizontalGroup(
            menuBarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(lblGestionProveedore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGestionProveedore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGestionProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGestionEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogOut1)
                .addContainerGap())
        );
        menuBarProveedorLayout.setVerticalGroup(
            menuBarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuBarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator41)
                    .addGroup(menuBarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblGestionProveedore1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator11)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLogOut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGestionEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGestionProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGestionProveedore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aplicacionAdmin.add(menuBarProveedor, java.awt.BorderLayout.NORTH);

        appAdmin.setBackground(new java.awt.Color(30, 40, 49));
        appAdmin.setMaximumSize(new java.awt.Dimension(800, 557));
        appAdmin.setMinimumSize(new java.awt.Dimension(800, 557));
        appAdmin.setPreferredSize(new java.awt.Dimension(800, 557));
        appAdmin.setLayout(new java.awt.CardLayout());

        pnlGestionEmpleados.setBackground(new java.awt.Color(30, 40, 49));

        tabPaneGestionEmpleados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneGestionEmpleadosStateChanged(evt);
            }
        });

        pnlRegistrarEmpleado.setBackground(new java.awt.Color(57, 62, 70));

        jLabel25.setText("Apellido:");

        jLabel26.setText("Cargo:");

        jLabel28.setText("Salario:");

        jLabel32.setText("Teléfono:");

        jLabel33.setText("Dirección:");

        jLabel34.setText("Email:");

        jLabel35.setText("Contraseña:");

        jLabel24.setText("Nombre:");

        jLabel36.setText("Datos Personales");

        txtApellidoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEmpleadoActionPerformed(evt);
            }
        });

        txtAreaDireccionEmpleado.setColumns(20);
        txtAreaDireccionEmpleado.setRows(5);
        jScrollPane15.setViewportView(txtAreaDireccionEmpleado);

        jLabel51.setText("Datos Empresariales");

        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 51, 51));

        lblMensaje1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensaje1.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator15)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel36)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel32)
                                            .addGap(27, 27, 27)
                                            .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane15)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel28)
                                                .addComponent(jLabel34)
                                                .addComponent(jLabel35))
                                            .addGap(13, 13, 13)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(29, 29, 29))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txtNombreEmpleado)))))
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMensaje1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegistrarEmpleadoLayout = new javax.swing.GroupLayout(pnlRegistrarEmpleado);
        pnlRegistrarEmpleado.setLayout(pnlRegistrarEmpleadoLayout);
        pnlRegistrarEmpleadoLayout.setHorizontalGroup(
            pnlRegistrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
        );
        pnlRegistrarEmpleadoLayout.setVerticalGroup(
            pnlRegistrarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPaneGestionEmpleados.addTab("Registrar", pnlRegistrarEmpleado);

        pnlConsultarEmpleadoAdmin1.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarEmpleadosActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarEmpleadosActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarEmpleadosActualizarMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblConsultarEmpleadosActualizar);
        if (tblConsultarEmpleadosActualizar.getColumnModel().getColumnCount() > 0) {
            tblConsultarEmpleadosActualizar.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarEmpleadosActualizar.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Empleados");

        lblNombreConsultaEmpleado1.setText("Nombre:");

        lblEmailConsultaEmpleado1.setText("Email:");

        lblTelefonoConsultaEmpleado1.setText("Teléfono:");

        jLabel58.setText("Estado: ");

        lblEstadoActualizarEmpleado.setText("True/False");

        jLabel63.setText("Información Personal");

        jLabel64.setText("Dirección");

        txtAreaDireccionActualizarEmpleado.setColumns(20);
        txtAreaDireccionActualizarEmpleado.setLineWrap(true);
        txtAreaDireccionActualizarEmpleado.setRows(5);
        txtAreaDireccionActualizarEmpleado.setWrapStyleWord(true);
        jScrollPane16.setViewportView(txtAreaDireccionActualizarEmpleado);

        jLabel65.setText("Datos Empresariales:");

        lblCargoConsultaEmpleado1.setText("Cargo:");

        lblSalarioConsultaEmpleado1.setText("Salario:");

        lblFechaActualizarEmpleado.setText("Fecha de Ingreso:");

        chbxBajaEmpleado.setText("Dar de baja");

        lblNombreConsultaEmpleado2.setText("Apellido:");

        btnActualizarEmpleado.setText("Actualizar Información");
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        jLabel66.setText("Contraseña:");

        txtClaveActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActualizarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18)
                    .addComponent(jScrollPane16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailConsultaEmpleado1)
                            .addComponent(lblTelefonoConsultaEmpleado1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoActualizarEmpleado)
                            .addComponent(txtTelefonoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 61, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNombreConsultaEmpleado1)
                                .addGap(26, 26, 26)
                                .addComponent(txtNombreActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNombreConsultaEmpleado2)
                                .addGap(26, 26, 26)
                                .addComponent(txtApellidoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblCargoConsultaEmpleado1)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSalarioActualizarEmpleado)
                                    .addComponent(txtCargoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSalarioConsultaEmpleado1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtClaveActualizarEmpleado)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFechaActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEstadoActualizarEmpleado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxBajaEmpleado))
                                    .addComponent(jLabel63))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(lblEstadoActualizarEmpleado)
                    .addComponent(chbxBajaEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreConsultaEmpleado1)
                    .addComponent(txtNombreActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreConsultaEmpleado2)
                    .addComponent(txtApellidoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailConsultaEmpleado1)
                    .addComponent(txtCorreoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoConsultaEmpleado1)
                    .addComponent(txtTelefonoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoConsultaEmpleado1)
                    .addComponent(txtCargoActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioConsultaEmpleado1)
                    .addComponent(txtSalarioActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtClaveActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lblFechaActualizarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarEmpleado)
                .addContainerGap())
        );

        lblMensajeActualizarEmpleado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensajeActualizarEmpleado.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlConsultarEmpleadoAdmin1Layout = new javax.swing.GroupLayout(pnlConsultarEmpleadoAdmin1);
        pnlConsultarEmpleadoAdmin1.setLayout(pnlConsultarEmpleadoAdmin1Layout);
        pnlConsultarEmpleadoAdmin1Layout.setHorizontalGroup(
            pnlConsultarEmpleadoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadoAdmin1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarEmpleadoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(pnlConsultarEmpleadoAdmin1Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMensajeActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlConsultarEmpleadoAdmin1Layout.setVerticalGroup(
            pnlConsultarEmpleadoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadoAdmin1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarEmpleadoAdmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConsultarEmpleadoAdmin1Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMensajeActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlActualizarEmpleadoLayout = new javax.swing.GroupLayout(pnlActualizarEmpleado);
        pnlActualizarEmpleado.setLayout(pnlActualizarEmpleadoLayout);
        pnlActualizarEmpleadoLayout.setHorizontalGroup(
            pnlActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlConsultarEmpleadoAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlActualizarEmpleadoLayout.setVerticalGroup(
            pnlActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarEmpleadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlConsultarEmpleadoAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPaneGestionEmpleados.addTab("Actualizar", pnlActualizarEmpleado);

        pnlConsultarEmpleadoAdmin.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cargo", "Estado", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblConsultarEmpleados);
        if (tblConsultarEmpleados.getColumnModel().getColumnCount() > 0) {
            tblConsultarEmpleados.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarEmpleados.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblConsultarEmpleados.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblConsultarEmpleados.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblConsultarEmpleados.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Agrupar por:");

        cbxAgruparEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No agrupar", "Cargo", "Estado", " " }));
        cbxAgruparEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAgruparEmpleadosItemStateChanged(evt);
            }
        });

        lblNombreConsultaEmpleado.setText("Nombre:");

        lblEmailConsultaEmpleado.setText("Email:");

        lblTelefonoConsultaEmpleado.setText("Teléfono:");

        jLabel27.setText("Estado: ");

        lblEstadoConsultaEmpleado.setText("True/False");

        jLabel29.setText("Información Personal");

        jLabel30.setText("Dirección");

        txtAreaDireccionConsultaEmpleado.setColumns(20);
        txtAreaDireccionConsultaEmpleado.setLineWrap(true);
        txtAreaDireccionConsultaEmpleado.setRows(5);
        txtAreaDireccionConsultaEmpleado.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAreaDireccionConsultaEmpleado);

        jLabel31.setText("Datos Empresariales:");

        lblCargoConsultaEmpleado.setText("Cargo:");

        lblSalarioConsultaEmpleado.setText("Salario:");

        lblFechaConsultaEmpleado.setText("Fecha de Ingreso:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefonoConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSalarioConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jSeparator14)
                    .addComponent(lblCargoConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEstadoConsultaEmpleado))
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFechaConsultaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblEstadoConsultaEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreConsultaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmailConsultaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefonoConsultaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCargoConsultaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSalarioConsultaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFechaConsultaEmpleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConsultarEmpleadoAdminLayout = new javax.swing.GroupLayout(pnlConsultarEmpleadoAdmin);
        pnlConsultarEmpleadoAdmin.setLayout(pnlConsultarEmpleadoAdminLayout);
        pnlConsultarEmpleadoAdminLayout.setHorizontalGroup(
            pnlConsultarEmpleadoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadoAdminLayout.createSequentialGroup()
                .addGroup(pnlConsultarEmpleadoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarEmpleadoAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAgruparEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultarEmpleadoAdminLayout.setVerticalGroup(
            pnlConsultarEmpleadoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarEmpleadoAdminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlConsultarEmpleadoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarEmpleadoAdminLayout.createSequentialGroup()
                        .addGroup(pnlConsultarEmpleadoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(cbxAgruparEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPaneGestionEmpleados.addTab("Consultar", pnlConsultarEmpleadoAdmin);

        javax.swing.GroupLayout pnlGestionEmpleadosLayout = new javax.swing.GroupLayout(pnlGestionEmpleados);
        pnlGestionEmpleados.setLayout(pnlGestionEmpleadosLayout);
        pnlGestionEmpleadosLayout.setHorizontalGroup(
            pnlGestionEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneGestionEmpleados)
                .addContainerGap())
        );
        pnlGestionEmpleadosLayout.setVerticalGroup(
            pnlGestionEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionEmpleadosLayout.createSequentialGroup()
                .addComponent(tabPaneGestionEmpleados)
                .addContainerGap())
        );

        appAdmin.add(pnlGestionEmpleados, "gestionEmp");

        pnlGestionProductos.setBackground(new java.awt.Color(30, 40, 49));

        tabPaneGestionProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneGestionProductosStateChanged(evt);
            }
        });

        pnlRegistrarProducto.setBackground(new java.awt.Color(57, 62, 70));

        jLabel68.setText("Stock:");

        jLabel69.setText("Precio:");

        jLabel71.setText("Descripción:");

        jLabel72.setText("Tipo:");

        jLabel74.setText("Nombre:");

        jLabel75.setText("Datos del Producto:");

        txtAreaDescripcionProdReg.setColumns(20);
        txtAreaDescripcionProdReg.setRows(5);
        jScrollPane17.setViewportView(txtAreaDescripcionProdReg);

        btnRegistrarProducto.setText("Registrar Producto");
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        lblMensajeProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensajeProducto.setForeground(new java.awt.Color(255, 51, 51));

        lblMensaje3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensaje3.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addComponent(jLabel68)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtStockProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel75)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel69)
                                                .addComponent(jLabel72))
                                            .addGap(40, 40, 40)
                                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPrecioProdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtTipoProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel74)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtNombreProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblMensaje3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator19)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane17))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtNombreProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtStockProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioProdReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoProductoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addGap(18, 18, 18)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(lblMensaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegistrarProductoLayout = new javax.swing.GroupLayout(pnlRegistrarProducto);
        pnlRegistrarProducto.setLayout(pnlRegistrarProductoLayout);
        pnlRegistrarProductoLayout.setHorizontalGroup(
            pnlRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        pnlRegistrarProductoLayout.setVerticalGroup(
            pnlRegistrarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPaneGestionProductos.addTab("Registrar", pnlRegistrarProducto);

        pnlActualizarProducto.setBackground(new java.awt.Color(30, 40, 49));

        pnlActualizarProd.setBackground(new java.awt.Color(30, 40, 49));

        tblConsultarProductosActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarProductosActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarProductosActualizarMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(tblConsultarProductosActualizar);
        if (tblConsultarProductosActualizar.getColumnModel().getColumnCount() > 0) {
            tblConsultarProductosActualizar.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarProductosActualizar.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Productos");

        lblNombreConsultaEmpleado3.setText("Nombre:");

        lblEmailConsultaEmpleado2.setText("Precio:");

        lblTelefonoConsultaEmpleado2.setText("Tipo:");

        jLabel78.setText("Disponible:");

        lblEstadoActualizarProducto.setText("True/False");

        jLabel79.setText("Información del Producto");

        jLabel80.setText("Descripción:");

        txtAreaDescripProdActualizar.setColumns(20);
        txtAreaDescripProdActualizar.setLineWrap(true);
        txtAreaDescripProdActualizar.setRows(5);
        txtAreaDescripProdActualizar.setWrapStyleWord(true);
        jScrollPane19.setViewportView(txtAreaDescripProdActualizar);

        chbxBajaProducto.setText("Dar de baja");

        lblNombreConsultaEmpleado4.setText("Stock:");

        btnActualizarProducto.setText("Actualizar Información");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator22)
                    .addComponent(jScrollPane19)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreConsultaEmpleado4)
                                    .addComponent(lblNombreConsultaEmpleado3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailConsultaEmpleado2)
                                    .addComponent(lblTelefonoConsultaEmpleado2))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel80))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel78)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEstadoActualizarProducto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chbxBajaProducto))
                                    .addComponent(jLabel79))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnActualizarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(lblEstadoActualizarProducto)
                    .addComponent(chbxBajaProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreConsultaEmpleado3)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreConsultaEmpleado4))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailConsultaEmpleado2)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoConsultaEmpleado2)
                    .addComponent(txtTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarProducto)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        lblMensajeActualizarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensajeActualizarProducto.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlActualizarProdLayout = new javax.swing.GroupLayout(pnlActualizarProd);
        pnlActualizarProd.setLayout(pnlActualizarProdLayout);
        pnlActualizarProdLayout.setHorizontalGroup(
            pnlActualizarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(pnlActualizarProdLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMensajeActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlActualizarProdLayout.setVerticalGroup(
            pnlActualizarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlActualizarProdLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMensajeActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlActualizarProductoLayout = new javax.swing.GroupLayout(pnlActualizarProducto);
        pnlActualizarProducto.setLayout(pnlActualizarProductoLayout);
        pnlActualizarProductoLayout.setHorizontalGroup(
            pnlActualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlActualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlActualizarProductoLayout.setVerticalGroup(
            pnlActualizarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlActualizarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPaneGestionProductos.addTab("Actualizar", pnlActualizarProducto);

        pnlConsultarProducto.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarProductosMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(tblConsultarProductos);
        if (tblConsultarProductos.getColumnModel().getColumnCount() > 0) {
            tblConsultarProductos.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarProductos.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Agrupar por:");

        cbxAgruparProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cbxAgruparProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAgruparProductosItemStateChanged(evt);
            }
        });

        lblNombreConsultaProducto.setText("Nombre:");

        lblPrecioConsulta.setText("Precio:");

        lblStockProducto.setText("Stock:");

        jLabel84.setText("Disponible:");

        lblEstadoConsultaProducto.setText("True/False");

        jLabel85.setText("Información del Producto:");

        jLabel86.setText("Dirección");

        txtAreaDescripcionProducto.setColumns(20);
        txtAreaDescripcionProducto.setLineWrap(true);
        txtAreaDescripcionProducto.setRows(5);
        txtAreaDescripcionProducto.setWrapStyleWord(true);
        jScrollPane21.setViewportView(txtAreaDescripcionProducto);

        lblTipoProducto.setText("Tipo:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreConsultaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrecioConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStockProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jSeparator25)
                    .addComponent(lblTipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEstadoConsultaProducto))
                            .addComponent(jLabel85)
                            .addComponent(jLabel86))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(lblEstadoConsultaProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreConsultaProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecioConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStockProducto)
                .addGap(16, 16, 16)
                .addComponent(lblTipoProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConsultarProductoLayout = new javax.swing.GroupLayout(pnlConsultarProducto);
        pnlConsultarProducto.setLayout(pnlConsultarProductoLayout);
        pnlConsultarProductoLayout.setHorizontalGroup(
            pnlConsultarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProductoLayout.createSequentialGroup()
                .addGroup(pnlConsultarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAgruparProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultarProductoLayout.setVerticalGroup(
            pnlConsultarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProductoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlConsultarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProductoLayout.createSequentialGroup()
                        .addGroup(pnlConsultarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(cbxAgruparProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPaneGestionProductos.addTab("Consultar", pnlConsultarProducto);

        javax.swing.GroupLayout pnlGestionProductosLayout = new javax.swing.GroupLayout(pnlGestionProductos);
        pnlGestionProductos.setLayout(pnlGestionProductosLayout);
        pnlGestionProductosLayout.setHorizontalGroup(
            pnlGestionProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneGestionProductos)
                .addContainerGap())
        );
        pnlGestionProductosLayout.setVerticalGroup(
            pnlGestionProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGestionProductosLayout.createSequentialGroup()
                .addComponent(tabPaneGestionProductos)
                .addContainerGap())
        );

        appAdmin.add(pnlGestionProductos, "gestionProd");

        pnlGestionProveedores.setBackground(new java.awt.Color(30, 40, 49));

        tabPaneGestionProveedores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneGestionProveedoresStateChanged(evt);
            }
        });

        pnlRegistrarProveedor.setBackground(new java.awt.Color(57, 62, 70));

        jLabel67.setText("NIT:");

        jLabel70.setText("Telefono Empresarial:");

        jLabel73.setText("Telefono del Contacto:");

        jLabel76.setText("Contacto:");

        jLabel81.setText("Dirección:");

        jLabel88.setText("Nombre:");

        jLabel89.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel89.setText("Datos del Proveedor");

        txtNitProveedorReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitProveedorRegActionPerformed(evt);
            }
        });

        txtAreaDireccionProveedorReg.setColumns(20);
        txtAreaDireccionProveedorReg.setRows(5);
        jScrollPane22.setViewportView(txtAreaDireccionProveedorReg);

        jLabel90.setText("Datos Empresariales");

        btnRegistrarProveedor.setText("Registrar Proveedor");
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        lblMensajeProveedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensajeProveedor.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator26)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel73))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefonoContactoReg, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoEmpresarialReg)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel89)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel76)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel88)
                                            .addComponent(jLabel67))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNitProveedorReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreProveedorReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtNombreProveedorReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txtNitProveedorReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtContactoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtTelefonoEmpresarialReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoContactoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensajeProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegistrarProveedorLayout = new javax.swing.GroupLayout(pnlRegistrarProveedor);
        pnlRegistrarProveedor.setLayout(pnlRegistrarProveedorLayout);
        pnlRegistrarProveedorLayout.setHorizontalGroup(
            pnlRegistrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        pnlRegistrarProveedorLayout.setVerticalGroup(
            pnlRegistrarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPaneGestionProveedores.addTab("Registrar", pnlRegistrarProveedor);

        pnlActualizarProveedor.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarProveedoresAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarProveedoresAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarProveedoresAdmMouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(tblConsultarProveedoresAdm);
        if (tblConsultarProveedoresAdm.getColumnModel().getColumnCount() > 0) {
            tblConsultarProveedoresAdm.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarProveedoresAdm.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Proveedores");

        jPanel11.setBackground(new java.awt.Color(57, 62, 70));

        lblNombreConsultaEmpleado5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreConsultaEmpleado5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreConsultaEmpleado5.setText("Nombre:");

        lblEmailConsultaEmpleado3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmailConsultaEmpleado3.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailConsultaEmpleado3.setText("Nit:");

        lblTelefonoConsultaEmpleado3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoConsultaEmpleado3.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonoConsultaEmpleado3.setText("Contacto:");

        jLabel93.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Información de Contacto");

        jLabel94.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Dirección");

        txtAreaDireccionActualizarProveedor.setColumns(20);
        txtAreaDireccionActualizarProveedor.setLineWrap(true);
        txtAreaDireccionActualizarProveedor.setRows(5);
        txtAreaDireccionActualizarProveedor.setWrapStyleWord(true);
        jScrollPane24.setViewportView(txtAreaDireccionActualizarProveedor);

        jLabel95.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Datos Empresariales:");

        lblSalarioConsultaEmpleado2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSalarioConsultaEmpleado2.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioConsultaEmpleado2.setText("Telefono Empresarial");

        btnActualizarProveedor.setText("Actualizar Información");
        btnActualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedorActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Telefono Contacto");

        txtTelefonoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoContactoActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Proveedor");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator29)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane24)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailConsultaEmpleado3)
                                    .addComponent(lblTelefonoConsultaEmpleado3)
                                    .addComponent(jLabel93)
                                    .addComponent(jLabel94))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lblSalarioConsultaEmpleado2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(txtTelefonoEmpresarialAct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel95)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lblNombreConsultaEmpleado5)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNitActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContactoActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreConsultaEmpleado5)
                    .addComponent(txtNombreActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailConsultaEmpleado3)
                    .addComponent(txtNitActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoConsultaEmpleado3)
                    .addComponent(txtContactoActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioConsultaEmpleado2)
                    .addComponent(txtTelefonoEmpresarialAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActualizarProveedor)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        lblMensajeActualizarProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensajeActualizarProveedor.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlActualizarProveedorLayout = new javax.swing.GroupLayout(pnlActualizarProveedor);
        pnlActualizarProveedor.setLayout(pnlActualizarProveedorLayout);
        pnlActualizarProveedorLayout.setHorizontalGroup(
            pnlActualizarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel91)
                    .addComponent(lblMensajeActualizarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlActualizarProveedorLayout.setVerticalGroup(
            pnlActualizarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlActualizarProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMensajeActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPaneGestionProveedores.addTab("Actualizar", pnlActualizarProveedor);

        pnlConsultarProveedor.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarProveedoresMouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(tblConsultarProveedores);
        if (tblConsultarProveedores.getColumnModel().getColumnCount() > 0) {
            tblConsultarProveedores.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarProveedores.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel97.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Proveedores");

        lblNombreConsultaProveedor.setText("Nombre:");

        lblContactoProveedor.setText("Contacto:");

        lblNitProveedor.setText("Nit:");

        jLabel99.setText("Información De la Empresa");

        jLabel100.setText("Dirección");

        txtAreaDireccionProveedor.setColumns(20);
        txtAreaDireccionProveedor.setLineWrap(true);
        txtAreaDireccionProveedor.setRows(5);
        txtAreaDireccionProveedor.setWrapStyleWord(true);
        jScrollPane26.setViewportView(txtAreaDireccionProveedor);

        jLabel101.setText("Datos de Contacto:");

        lblTelefonoEmpresaProveedor.setText("Telefono de Empresa:");

        lblTelefonoContactoProveedor.setText("Telefono de Contacto:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreConsultaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNitProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefonoContactoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jSeparator32)
                    .addComponent(lblTelefonoEmpresaProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreConsultaProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContactoProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNitProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefonoEmpresaProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefonoContactoProveedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConsultarProveedorLayout = new javax.swing.GroupLayout(pnlConsultarProveedor);
        pnlConsultarProveedor.setLayout(pnlConsultarProveedorLayout);
        pnlConsultarProveedorLayout.setHorizontalGroup(
            pnlConsultarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProveedorLayout.createSequentialGroup()
                .addGroup(pnlConsultarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProveedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel97))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultarProveedorLayout.setVerticalGroup(
            pnlConsultarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarProveedorLayout.createSequentialGroup()
                .addGroup(pnlConsultarProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarProveedorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlConsultarProveedorLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPaneGestionProveedores.addTab("Consultar", pnlConsultarProveedor);

        javax.swing.GroupLayout pnlGestionProveedoresLayout = new javax.swing.GroupLayout(pnlGestionProveedores);
        pnlGestionProveedores.setLayout(pnlGestionProveedoresLayout);
        pnlGestionProveedoresLayout.setHorizontalGroup(
            pnlGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneGestionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGestionProveedoresLayout.setVerticalGroup(
            pnlGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneGestionProveedores)
        );

        appAdmin.add(pnlGestionProveedores, "gestionProveedor");

        pnlGestionClientes.setBackground(new java.awt.Color(30, 40, 49));

        pnlGestionClientesMain.setBackground(new java.awt.Color(30, 40, 49));

        tabPaneGestionClientes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPaneGestionClientesStateChanged(evt);
            }
        });

        pnlRegistrarCliente.setBackground(new java.awt.Color(57, 62, 70));

        jLabel87.setText("Teléfono:");

        jLabel92.setText("Correo:");

        jLabel98.setText("Contraseña:");

        jLabel103.setText("Dirección:");

        jLabel104.setText("Nombre:");

        jLabel105.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel105.setText("Datos del Cliente");

        txtTelefonoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoRegActionPerformed(evt);
            }
        });

        txtAreaDireccionClienteReg.setColumns(20);
        txtAreaDireccionClienteReg.setRows(5);
        jScrollPane27.setViewportView(txtAreaDireccionClienteReg);

        jLabel106.setText("Datos de la Cuenta");

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        lblMensajeCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensajeCliente.setForeground(new java.awt.Color(255, 51, 51));

        lblMensaje5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensaje5.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMensajeCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator34)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel98))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClaveClienteReg, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtCorreoClienteReg)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel105)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel104)
                                            .addComponent(jLabel87))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefonoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreClienteReg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(lblMensaje5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(txtNombreClienteReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtTelefonoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtCorreoClienteReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveClienteReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98))
                .addGap(12, 12, 12)
                .addComponent(btnRegistrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensajeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(lblMensaje5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRegistrarClienteLayout = new javax.swing.GroupLayout(pnlRegistrarCliente);
        pnlRegistrarCliente.setLayout(pnlRegistrarClienteLayout);
        pnlRegistrarClienteLayout.setHorizontalGroup(
            pnlRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        pnlRegistrarClienteLayout.setVerticalGroup(
            pnlRegistrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPaneGestionClientes.addTab("Registrar", pnlRegistrarCliente);

        pnlActualizarCliente.setBackground(new java.awt.Color(57, 62, 70));

        tblActualizarClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblActualizarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActualizarClientesMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(tblActualizarClientes);
        if (tblActualizarClientes.getColumnModel().getColumnCount() > 0) {
            tblActualizarClientes.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblActualizarClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Clientes");

        jPanel17.setBackground(new java.awt.Color(57, 62, 70));

        lblNombreConsultaEmpleado6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreConsultaEmpleado6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreConsultaEmpleado6.setText("Nombre:");

        lblEmailConsultaEmpleado4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEmailConsultaEmpleado4.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailConsultaEmpleado4.setText("Telefono:");

        lblTelefonoConsultaEmpleado4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTelefonoConsultaEmpleado4.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefonoConsultaEmpleado4.setText("NIT:");

        jLabel108.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Información de Cliente");

        jLabel109.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("Dirección");

        txtAreaDireccionActualizarCliente.setColumns(20);
        txtAreaDireccionActualizarCliente.setLineWrap(true);
        txtAreaDireccionActualizarCliente.setRows(5);
        txtAreaDireccionActualizarCliente.setWrapStyleWord(true);
        jScrollPane29.setViewportView(txtAreaDireccionActualizarCliente);

        jLabel110.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Datos de la Cuenta:");

        lblSalarioConsultaEmpleado3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSalarioConsultaEmpleado3.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioConsultaEmpleado3.setText("Correo:");

        btnActualizarCliente.setText("Actualizar Información");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Cliente");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator37)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane29)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmailConsultaEmpleado4)
                                    .addComponent(lblTelefonoConsultaEmpleado4)
                                    .addComponent(jLabel108)
                                    .addComponent(jLabel109))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(lblSalarioConsultaEmpleado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(lblNombreConsultaEmpleado6)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefonoActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNitActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel112))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreConsultaEmpleado6)
                    .addComponent(txtNombreActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailConsultaEmpleado4)
                    .addComponent(txtTelefonoActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoConsultaEmpleado4)
                    .addComponent(txtNitActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioConsultaEmpleado3)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarCliente)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        lblMensajeClientesActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMensajeClientesActualizar.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pnlActualizarClienteLayout = new javax.swing.GroupLayout(pnlActualizarCliente);
        pnlActualizarCliente.setLayout(pnlActualizarClienteLayout);
        pnlActualizarClienteLayout.setHorizontalGroup(
            pnlActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jLabel107)
                    .addComponent(lblMensajeClientesActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlActualizarClienteLayout.setVerticalGroup(
            pnlActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlActualizarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMensajeClientesActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPaneGestionClientes.addTab("Actualizar", pnlActualizarCliente);

        pnlConsultarCliente.setBackground(new java.awt.Color(57, 62, 70));

        tblConsultarClientesAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsultarClientesAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultarClientesAdminMouseClicked(evt);
            }
        });
        jScrollPane30.setViewportView(tblConsultarClientesAdmin);
        if (tblConsultarClientesAdmin.getColumnModel().getColumnCount() > 0) {
            tblConsultarClientesAdmin.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblConsultarClientesAdmin.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel113.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Clientes");

        lblNombreClienteConsulta.setText("Nombre:");

        lblTelefonoClienteConsulta.setText("Telefono:");

        lblNitCliente.setText("Nit:");

        jLabel114.setText("Información del Cliente");

        jLabel115.setText("Dirección");

        txtAreaDireccionClienteConsulta.setColumns(20);
        txtAreaDireccionClienteConsulta.setLineWrap(true);
        txtAreaDireccionClienteConsulta.setRows(5);
        txtAreaDireccionClienteConsulta.setWrapStyleWord(true);
        jScrollPane31.setViewportView(txtAreaDireccionClienteConsulta);

        jLabel116.setText("Datos de la Cuenta:");

        lblClienteCorreoConsultar.setText("Correo:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreClienteConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefonoClienteConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNitCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator38, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jSeparator40)
                    .addComponent(lblClienteCorreoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel114)
                            .addComponent(jLabel115)
                            .addComponent(jLabel116))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreClienteConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelefonoClienteConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNitCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClienteCorreoConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlConsultarClienteLayout = new javax.swing.GroupLayout(pnlConsultarCliente);
        pnlConsultarCliente.setLayout(pnlConsultarClienteLayout);
        pnlConsultarClienteLayout.setHorizontalGroup(
            pnlConsultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarClienteLayout.createSequentialGroup()
                .addGroup(pnlConsultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel113))
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultarClienteLayout.setVerticalGroup(
            pnlConsultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarClienteLayout.createSequentialGroup()
                .addGroup(pnlConsultarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarClienteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlConsultarClienteLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPaneGestionClientes.addTab("Consultar", pnlConsultarCliente);

        javax.swing.GroupLayout pnlGestionClientesMainLayout = new javax.swing.GroupLayout(pnlGestionClientesMain);
        pnlGestionClientesMain.setLayout(pnlGestionClientesMainLayout);
        pnlGestionClientesMainLayout.setHorizontalGroup(
            pnlGestionClientesMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionClientesMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPaneGestionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGestionClientesMainLayout.setVerticalGroup(
            pnlGestionClientesMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPaneGestionClientes)
        );

        javax.swing.GroupLayout pnlGestionClientesLayout = new javax.swing.GroupLayout(pnlGestionClientes);
        pnlGestionClientes.setLayout(pnlGestionClientesLayout);
        pnlGestionClientesLayout.setHorizontalGroup(
            pnlGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(pnlGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlGestionClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGestionClientesMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlGestionClientesLayout.setVerticalGroup(
            pnlGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(pnlGestionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlGestionClientesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlGestionClientesMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        appAdmin.add(pnlGestionClientes, "gestionClientes");

        aplicacionAdmin.add(appAdmin, java.awt.BorderLayout.CENTER);

        mainPanel.add(aplicacionAdmin, "appAdmin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginCliente(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(clienteControlador.loginCliente(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appCliente");
                    break;
            }
            List<String> filtrarProductos = new ArrayList<>();
            for(Producto producto : listaProductos){
                if(!filtrarProductos.contains(producto.getTipo())){
                    filtrarProductos.add(producto.getTipo());
                    cbxTipoProductosCliente.addItem(producto.getTipo());
                }
            }
            actualizarPedidosCliente();
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loginCajero(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(empleadoControlador.loginEmpleado(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appCajero");
                    break;
            }   
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Producto productos : listaProductos){
            model.addElement(productos.getNombre());
        }
        listProductos.setModel(model);
        
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void loginMesero(String correo, String clave){
        CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(empleadoControlador.loginEmpleado(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appMesero");
                    break;
            }
            List<String> filtrarProductos = new ArrayList<>();
            for(Producto producto : listaProductos){
                if(!filtrarProductos.contains(producto.getTipo())){
                    filtrarProductos.add(producto.getTipo());
                    cbxTipoProductosMesero.addItem(producto.getTipo());
                }
            }
            actualizarListaPedidosMesero();
            lblNumPedidoMesero.setText("Pedido #" + String.valueOf(numPedido()));
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    private void loginAdmin(String correo, String clave){
         CardLayout card = (CardLayout)mainPanel.getLayout();
        try{
            switch(empleadoControlador.loginEmpleado(correo, clave)){
                case 1: 
                    lblMensajeCorreo.setText("Correo incorrecto");
                    break;
                case 2:
                    lblMensajeContra.setText("Contraseña incorrecta");
                    break;
                case 3:
                    card.show(mainPanel, "appAdmin");
                    break;
            }
            List<String> filtrarProductos = new ArrayList<>();
            for(Producto producto : listaProductos){
                if(!filtrarProductos.contains(producto.getTipo())){
                    filtrarProductos.add(producto.getTipo());
                    cbxAgruparProductos.addItem(producto.getTipo());
                }
            }
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }    
    }
    
    private Producto productoActual(String productoSeleccionado){
        
        for(Producto producto : listaProductos){
            if(producto.getNombre().equals(productoSeleccionado)){
                return producto;
            }           
        }
        for(Producto producto : listaProductos){ 
                return producto;       
        }
        return null;
    }
    
    private double calcularTotalDescuento(int f){
        Producto producto = productoActual(listProductos.getSelectedValue());
        int cantidad = (int)tblProdReg.getValueAt(f, 1);
        double total;
        double descuento;
        
        descuento = producto.getPrecio() * cantidad * (Float)tblProdReg.getValueAt(f, 3);
  
        total = producto.getPrecio() * cantidad - descuento;
        
        return total;
    }
    
    private double calcularTotal(String productoActual, int cantidad){
        Producto producto = productoActual(productoActual);
        double total;
        
        total = producto.getPrecio() * cantidad;
  
        return total;
    }
    
    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if("Correo".equals(txtCorreo.getText())){
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.WHITE);
        }
        lblMensajeCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if("".equals(txtCorreo.getText())){
            txtCorreo.setText("Correo");
            txtCorreo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtCorreoFocusLost
   
    private void actualizarPedidosCliente(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();

        for(Producto productos : listaProductos){
            if(cbxTipoProductosCliente.getSelectedItem().equals(productos.getTipo())){      
                model.addElement(productos.getNombre());
            }else if(cbxTipoProductosCliente.getSelectedItem().equals("Todos")){
                model.addElement(productos.getNombre());
            } 
        }       
        listaProductosCliente.setModel(model);
    }
    //CODIGO DE MESERO
    private void actualizarListaPedidosMesero(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();

        for(Producto productos : listaProductos){
            if(cbxTipoProductosMesero.getSelectedItem().equals(productos.getTipo())){      
                model.addElement(productos.getNombre());
            }else if(cbxTipoProductosMesero.getSelectedItem().equals("Todos")){
                model.addElement(productos.getNombre());
            } 
        }       
        listaProductosMesero.setModel(model);
    }
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String correo = txtCorreo.getText();
        char[] password = passClave.getPassword();
        String clave = String.valueOf(password);
 
        int comprobarCorreo = mainControlador.comprobarCorreo(correo);
        
        if(comprobarCorreo!=5){
            txtCorreo.setText("");
            passClave.setText("");
        }
         
       switch(comprobarCorreo){
            case 1:
                loginCliente(correo, clave);
                break;
            case 2:
                loginMesero(correo, clave);
                break;
            case 3:
                loginCajero(correo, clave);   
                break;
            case 4:
                loginAdmin(correo, clave);
                break;
            case 5:
                lblMensajeCorreo.setText("Correo incorrecto");
                break;
        }   
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "registrar");
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void passClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusGained
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("");
            passClave.setForeground(Color.WHITE);
        }
        showContra();
        lblMensajeContra.setText("");
    }//GEN-LAST:event_passClaveFocusGained

    private void passClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passClaveFocusLost
        if("".equals(String.valueOf(passClave.getPassword()))){
            passClave.setText("Contraseña");
            passClave.setForeground(Color.GRAY);
        }
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passClaveFocusLost

    private void lblShowHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowHideMouseClicked
        if(showPassword){
            lblShowHide.setText("Mostrar");
        }else{
            lblShowHide.setText("Ocultar");
        }
        showPassword = !showPassword;
        if("Contraseña".equals(String.valueOf(passClave.getPassword()))){
            passClave.setEchoChar('\u0000');
        }else{
            showContra();
        }
    }//GEN-LAST:event_lblShowHideMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtRegNombre.getText();
        String correo = txtRegCorreo.getText();
        String telefono = txtRegTelefono.getText();
        String direccion = txtRegDireccion.getText();
        String password = String.valueOf(passRegClave.getPassword());
        String confPassword = String.valueOf(passRegClaveConf.getPassword());
        
        lblRegMensaje.setForeground(Color.RED);
        
        if("Nombre".equals(nombre)){
            lblRegMensaje.setText("Por favor, ingrese nombre");
            return;
        }
        
        if("Telefono".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese telefono");
            return;
        }
        
        if("Dirección".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese direccion");
            return;
        }
        
        if("nombre@ejemplo.com".equals(telefono)){
            lblRegMensaje.setText("Por favor, ingrese correo");
            return;
        }
        
        if(!mainControlador.comprobarCliente(correo)){
            lblRegMensaje.setText("Por favor, ingrese correo válido ej. @gmail.com");
            return;
        }
        
        if("Contraseña".equals(password)){
            lblRegMensaje.setText("Por favor, ingrese contraseña");
            return;
        }
        
        if(!password.equals(confPassword)){
            lblRegMensaje.setText("Las contraseñas no coinciden");
            return;
        }
        if(clienteControlador.comprobarCorreo(correo)){
            lblRegMensaje.setText("El correo ya existe");
            return;
        }
        
        try {
            clienteControlador.registrarCliente(correo, password, nombre, telefono, direccion);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lblRegMensaje.setForeground(Color.BLUE);
        lblRegMensaje.setText("Cuenta registrada");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblRegBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegBackMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblRegBackMouseClicked

    private void passRegClaveConfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveConfFocusGained
        if("Confirmar Contraseña".equals(String.valueOf(passRegClaveConf.getPassword()))){
            passRegClaveConf.setText("");
            passRegClaveConf.setForeground(Color.WHITE);
        }
        lblRegMensaje.setText("");
        passRegClaveConf.setEchoChar('\u2022');
    }//GEN-LAST:event_passRegClaveConfFocusGained

    private void passRegClaveConfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveConfFocusLost
        if("".equals(String.valueOf(passRegClaveConf.getPassword()))){
            passRegClaveConf.setText("Confirmar Contraseña");
            passRegClaveConf.setForeground(Color.GRAY);
            passRegClaveConf.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passRegClaveConfFocusLost

    private void passRegClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveFocusGained
        if("Contraseña".equals(String.valueOf(passRegClave.getPassword()))){
            passRegClave.setText("");
            passRegClave.setForeground(Color.WHITE);
        }
        lblRegMensaje.setText("");
        passRegClave.setEchoChar('\u2022');
    }//GEN-LAST:event_passRegClaveFocusGained

    private void passRegClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passRegClaveFocusLost
        if("".equals(String.valueOf(passRegClave.getPassword()))){
            passRegClave.setText("Contraseña");
            passRegClave.setForeground(Color.GRAY);
            passRegClave.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passRegClaveFocusLost

    private void passRegClaveConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRegClaveConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRegClaveConfActionPerformed

    private void txtRegNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegNombreFocusGained
        if("Nombre".equals(txtRegNombre.getText())){
            txtRegNombre.setText("");
            txtRegNombre.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegNombreFocusGained

    private void txtRegNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegNombreFocusLost
        if("".equals(txtRegNombre.getText())){
            txtRegNombre.setText("Nombre");
            txtRegNombre.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegNombreFocusLost

    private void txtRegTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegTelefonoFocusGained
        if("Telefono".equals(txtRegTelefono.getText())){
            txtRegTelefono.setText("");
            txtRegTelefono.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegTelefonoFocusGained

    private void txtRegTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegTelefonoFocusLost
        if("".equals(txtRegTelefono.getText())){
            txtRegTelefono.setText("Telefono");
            txtRegTelefono.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegTelefonoFocusLost

    private void txtRegDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegDireccionFocusGained
        if("Dirección".equals(txtRegDireccion.getText())){
            txtRegDireccion.setText("");
            txtRegDireccion.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegDireccionFocusGained

    private void txtRegDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegDireccionFocusLost
        if("".equals(txtRegDireccion.getText())){
            txtRegDireccion.setText("Dirección");
            txtRegDireccion.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegDireccionFocusLost

    private void txtRegCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegCorreoFocusGained
        if("nombre@ejemplo.com".equals(txtRegCorreo.getText())){
            txtRegCorreo.setText("");
            txtRegCorreo.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_txtRegCorreoFocusGained

    private void txtRegCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegCorreoFocusLost
        if("".equals(txtRegCorreo.getText())){
            txtRegCorreo.setText("nombre@ejemplo.com");
            txtRegCorreo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRegCorreoFocusLost

    private void passRegClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRegClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRegClaveActionPerformed

    private void lblRegistrarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarOrdenMouseClicked
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "regOrden");
    }//GEN-LAST:event_lblRegistrarOrdenMouseClicked

    private void listProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listProductosValueChanged
        Producto producto = productoActual(listProductos.getSelectedValue());
        lblDispReg.setText(String.valueOf(producto.getStock()));
    
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.parseInt(lblDispReg.getText()), 1);     
        spnCantReg.setModel(model);
   
        lblPrecioReg.setText("Q " + String.valueOf(producto.getPrecio()));
    }//GEN-LAST:event_listProductosValueChanged

    private void lblAddRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddRegMouseClicked
        Producto producto = productoActual(listProductos.getSelectedValue());
       
        if(existeRegistro()){
            for(int f = 0; f<tblProdReg.getRowCount(); f++){
                if(tblProdReg.getValueAt(f, 0) == listProductos.getSelectedValue()){
                    if((int)tblProdReg.getValueAt(f, 1) + (int)spnCantReg.getValue() > producto.getStock()){
                        return;
                    }
                    tblProdReg.setValueAt((int)tblProdReg.getValueAt(f, 1) + (int)spnCantReg.getValue(), f, 1);
                    tblProdReg.setValueAt(calcularTotalDescuento(f), f, 4);
                    actualizarDatos();
                }          
            }
        }else{
            
            for(int f = 0; f<tblProdReg.getRowCount(); f++){
                if(tblProdReg.getValueAt(f, 0)==null){
                    tblProdReg.setValueAt(producto.getNombre(), f, 0);
                    tblProdReg.setValueAt(spnCantReg.getValue(), f, 1);
                    tblProdReg.setValueAt(producto.getPrecio(), f, 2);
                    tblProdReg.setValueAt(Float.valueOf((String)cbxDescuento.getSelectedItem()), f, 3);
                    tblProdReg.setValueAt(calcularTotalDescuento(f), f, 4);
                    actualizarDatos();
                return;                     
                }    
            }
        }  
    }//GEN-LAST:event_lblAddRegMouseClicked

    private void spnCantRegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantRegStateChanged
        lblTotReg.setText("Q " + calcularTotal(listProductos.getSelectedValue(), (int)spnCantReg.getValue()));
    }//GEN-LAST:event_spnCantRegStateChanged

    private void spnCantRegPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnCantRegPropertyChange
        lblTotReg.setText("Q " + calcularTotal(listProductos.getSelectedValue(), (int)spnCantReg.getValue()));
    }//GEN-LAST:event_spnCantRegPropertyChange

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void btnDescuentoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoTablaActionPerformed
        int fila = tblProdReg.getSelectedRow();
        float descuento = Float.parseFloat((String)cbxDescuento.getSelectedItem());
        tblProdReg.setValueAt(descuento, fila, 3);
        tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        actualizarDatos();
    }//GEN-LAST:event_btnDescuentoTablaActionPerformed

    private void txtNITFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusGained
        if("Ingresar nit".equals(txtNIT.getText())){
            txtNIT.setText("");
            txtNIT.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITFocusGained

    private void txtNITFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITFocusLost
        if("".equals(txtNIT.getText())){
            txtNIT.setText("Ingresar nit");
            txtNIT.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtNITFocusLost

    private void cbxRegProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRegProductosItemStateChanged
        actualizarListaProductos();
    }//GEN-LAST:event_cbxRegProductosItemStateChanged

    private void btnPagarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPedidoActionPerformed
        int nitFacuta = Integer.parseInt(txtNIT.getText());
        String nit = txtNIT.getText();
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = numPedido();
        double total = getNumero(lblTotalRecibo.getText());
        int seRegistro = 0;
        
        for(int f = 0; f <tblProdReg.getRowCount(); f++){
            if(tblProdReg.getValueAt(f, 0)!= null){
                String producto = (String)tblProdReg.getValueAt(f, 0);
                int cantidad = (int)tblProdReg.getValueAt(f, 1);
                double precioU = (double )tblProdReg.getValueAt(f, 2);
                float descuento = (float)tblProdReg.getValueAt(f, 3);
                seRegistro = pedidoControlador.registarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, true, precioU);
            }
            
        }
        
        if(seRegistro == 1){
            PDFControlador.datosCliente(nitFacuta);
            PDFControlador.generarProcesoPDF();
            for(int f = 0; f < tblProdReg.getRowCount(); f++){
                for(int c = 0; c < tblProdReg.getColumnCount(); c++){
                tblProdReg.setValueAt(null, f, c);
                }
            }
            actualizarDatos();
        }
    }//GEN-LAST:event_btnPagarPedidoActionPerformed

    private double getNumero(String numero) {
        String soloNumero = numero.replaceAll("[^\\d.]", ""); 
        return Double.parseDouble(soloNumero);
    }
    
    private void btnEliminarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaActionPerformed
        int fila = tblProdReg.getSelectedRow();
        int cantidad = (int)spnMenosCantidad.getValue();
        if((int)tblProdReg.getValueAt(fila, 1) > 1){
            tblProdReg.setValueAt((int)tblProdReg.getValueAt(fila, 1) - cantidad, fila, 1);
            tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        }
        actualizarDatos();
    }//GEN-LAST:event_btnEliminarTablaActionPerformed

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        int fila = tblProdReg.getSelectedRow();
        
        for(int c = 0; c < tblProdReg.getColumnCount(); c++){
            tblProdReg.setValueAt(null, fila, c);
        }
        actualizarDatos();
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void lblCompletarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompletarOrdenMouseClicked
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "compOrden");
        actualizarListaPedidosPendientes();
        
    }//GEN-LAST:event_lblCompletarOrdenMouseClicked

    private void lblConsultarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarPedidoMouseClicked
        CardLayout card = (CardLayout)menuCajero.getLayout();
        card.show(menuCajero, "consPedidos");
        actualizarListaPedidos();
    }//GEN-LAST:event_lblConsultarPedidoMouseClicked

    private void actualizarListaPedidosPendientes(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Pedido pedido : listaPedidos){      
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(!model.contains(pedidoRegistro)){
                if(!pedido.isEstado()){
                    model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                }             
            }         
        }
        listaProductosPendientes.setModel(model);
    }
    
    private void actualizarListaPedidos(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Pedido pedido : listaPedidos){
            if(cbxFiltrarPedidos.getSelectedItem().equals("Completados")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){
                    if(pedido.isEstado()){
                        model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                    }             
                }
            }else if(cbxFiltrarPedidos.getSelectedItem().equals("No Completados")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){
                    if(!pedido.isEstado()){
                        model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));
                    }             
                }
            }else if(cbxFiltrarPedidos.getSelectedItem().equals("Todos")){
                String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
                if(!model.contains(pedidoRegistro)){  
                    model.addElement("Pedido #" + String.valueOf(pedido.getNumPedido()));        
                }
            }          
        }
        listPedidos.setModel(model);
    }
    
    private void listPedidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPedidosValueChanged
        DefaultTableModel model = (DefaultTableModel) tblConsultaPedidos.getModel();
        model.setRowCount(0);
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listPedidos.getSelectedValue())){
                Object[] fila = new Object[5];
                fila[0] = pedido.getProductos();
                fila[1] = pedido.getCantidad();
                fila[2] = pedido.getPrecioUnitario();
                fila[3] = pedido.getDescuento();
     
                double descuentoTotal = pedido.getCantidad() * pedido.getPrecioUnitario() * pedido.getDescuento();
                double total = pedido.getCantidad() * pedido.getPrecioUnitario() - descuentoTotal;
                
                fila[4] = total;
                model.addRow(fila);
                actualizarDatosConsulta();
                
                lblNombreConsulta.setText(pedido.getNombreCliente());
                lblNitConsulta.setText(pedido.getNitCliente());
            }
        }
        
    }//GEN-LAST:event_listPedidosValueChanged

    private void cbxFiltrarPedidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiltrarPedidosItemStateChanged
        actualizarListaPedidos();
    }//GEN-LAST:event_cbxFiltrarPedidosItemStateChanged

    private void btnEliminarTablaNoCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaNoCompletadoActionPerformed
        int fila = tblProdCompletar.getSelectedRow();
        int cantidad = (int)spnMenosCantidadNoComp.getValue();
        if((int)tblProdCompletar.getValueAt(fila, 1) > 1){
            tblProdCompletar.setValueAt((int)tblProdCompletar.getValueAt(fila, 1) - cantidad, fila, 1);
            tblProdReg.setValueAt(calcularTotalDescuento(fila), fila, 4);
        }
        actualizarDatosPedidoPendiente();
    }//GEN-LAST:event_btnEliminarTablaNoCompletadoActionPerformed

    private void btnDescuentoTablaNoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoTablaNoCompActionPerformed
        int fila = tblProdCompletar.getSelectedRow();
        float descuento = Float.parseFloat((String)cbxDescuentoNoComp.getSelectedItem());
        tblProdCompletar.setValueAt(descuento, fila, 3);
        tblProdCompletar.setValueAt(calcularTotalDescuentoNoComp(fila), fila, 4);
        actualizarDatosPedidoPendiente();
    }//GEN-LAST:event_btnDescuentoTablaNoCompActionPerformed

    private double calcularTotalDescuentoNoComp(int f){
        int cantidad = (int)tblProdCompletar.getValueAt(f, 1);
        double precioU = (double)tblProdCompletar.getValueAt(f, 2);
        double total;
        double descuento;
        
        descuento = precioU * cantidad * (float)tblProdCompletar.getValueAt(f, 3);
  
        total = precioU * cantidad - descuento;
        
        return total;
    }
    
    private void btnPagarPedidoNoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPedidoNoCompActionPerformed
        String nit = txtNITNoComp.getText();
        int nitFacuta = Integer.parseInt(txtNITNoComp.getText());
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = 0;
        int seRegistro = 0;
        double total = getNumero(lblTotalReciboNoComp.getText());
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listaProductosPendientes.getSelectedValue())){
                numPedido = pedido.getNumPedido();
            }
            
        }     
    
        for(int f = 0; f <tblProdCompletar.getRowCount(); f++){
            if(tblProdCompletar.getValueAt(f, 0)!= null){
                String producto = (String)tblProdCompletar.getValueAt(f, 0);
                int cantidad = (int)tblProdCompletar.getValueAt(f, 1);
                float descuento = (float)tblProdCompletar.getValueAt(f, 3);
                seRegistro = pedidoControlador.actualizarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, true);
            }
            
        }
        
        if(seRegistro == 1){
            for(int f = 0; f < tblProdCompletar.getRowCount(); f++){
                for(int c = 0; c < tblProdCompletar.getColumnCount(); c++){
                    tblProdCompletar.setValueAt(null, f, c);
                }
            }
           
            PDFControlador.datosCliente(nitFacuta);
            PDFControlador.generarFacturaPDF();
            actualizarDatosPedidoPendiente();
        }
    }//GEN-LAST:event_btnPagarPedidoNoCompActionPerformed

    private void txtNITNoCompFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITNoCompFocusGained
        if("Ingresar nit".equals(txtNITNoComp.getText())){
            txtNITNoComp.setText("");
            txtNITNoComp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITNoCompFocusGained

    private void txtNITNoCompFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNITNoCompFocusLost
        if("".equals(txtNITNoComp.getText())){
            txtNITNoComp.setText("Ingresar nit");
            txtNITNoComp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNITNoCompFocusLost

    private void listaProductosPendientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductosPendientesValueChanged
        DefaultTableModel model = (DefaultTableModel) tblProdCompletar.getModel();
        model.setRowCount(0);
        for(Pedido pedido : listaPedidos){
            String pedidoRegistro = "Pedido #" + String.valueOf(pedido.getNumPedido());
            if(pedidoRegistro.equals(listaProductosPendientes.getSelectedValue())){
                Object[] fila = new Object[5];
                fila[0] = pedido.getProductos();
                fila[1] = pedido.getCantidad();
                fila[2] = pedido.getPrecioUnitario();
                fila[3] = pedido.getDescuento();
     
                double descuentoTotal = pedido.getCantidad() * pedido.getPrecioUnitario() * pedido.getDescuento();
                double total = pedido.getCantidad() * pedido.getPrecioUnitario() - descuentoTotal;
                
                fila[4] = total;
                model.addRow(fila);
                actualizarDatosPedidoPendiente();
            }
        }
    }//GEN-LAST:event_listaProductosPendientesValueChanged

    private void lblLogOutMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMeseroMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblLogOutMeseroMouseClicked

    private void cbxTipoProductosMeseroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoProductosMeseroItemStateChanged
       actualizarListaPedidosMesero();
    }//GEN-LAST:event_cbxTipoProductosMeseroItemStateChanged

    private void listaProductosMeseroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductosMeseroValueChanged
        Producto producto = productoActual(listaProductosMesero.getSelectedValue());
        lblDisponibleMesero.setText(String.valueOf(producto.getStock()));
    
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.parseInt(lblDisponibleMesero.getText()), 1);     
        spnCantidadMesero.setModel(model);
   
        lblPrecioMesero.setText("Q " + String.valueOf(producto.getPrecio()));
    }//GEN-LAST:event_listaProductosMeseroValueChanged

    private void spnCantidadMeseroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadMeseroStateChanged
        lblTotalMesero.setText("Q " + calcularTotal(listaProductosMesero.getSelectedValue(), (int)spnCantidadMesero.getValue()));
    }//GEN-LAST:event_spnCantidadMeseroStateChanged

    private void spnCantidadMeseroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnCantidadMeseroPropertyChange
        lblTotalMesero.setText("Q " + calcularTotal(listaProductosMesero.getSelectedValue(), (int)spnCantidadMesero.getValue()));
    }//GEN-LAST:event_spnCantidadMeseroPropertyChange

    private void btnAgregarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMeseroActionPerformed
       DefaultTableModel model = (DefaultTableModel) tblPedidoMesero.getModel();
        String productoSeleccionado = listaProductosMesero.getSelectedValue();
        int cantidadNueva = (int) spnCantidadMesero.getValue();
        float descuento = Float.parseFloat((String) cbxDescuentoMesero.getSelectedItem());
        boolean encontrado = false;


        for (int i = 0; i < model.getRowCount(); i++) {
            String nombreProducto = (String) model.getValueAt(i, 0);
            if (nombreProducto.equals(productoSeleccionado)) {
                int cantidadExistente = (int) model.getValueAt(i, 2);
                int nuevaCantidad = cantidadExistente + cantidadNueva;
                for (Producto producto : listaProductos) {
                    if (producto.getNombre().equals(productoSeleccionado)) {
                        double precio = producto.getPrecio();
                        double descuentoTotal = nuevaCantidad * precio * descuento;
                        double total = nuevaCantidad * precio - descuentoTotal;

                        model.setValueAt(nuevaCantidad, i, 2);
                        model.setValueAt(descuento, i, 3);      
                        model.setValueAt(total, i, 4);
                        actualizarDatosMesero();
                        break;
                    }
                }

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (Producto producto : listaProductos) {
                if (producto.getNombre().equals(productoSeleccionado)) {
                    Object[] fila = new Object[5];
                    fila[0] = producto.getNombre();
                    fila[1] = producto.getPrecio();
                    fila[2] = cantidadNueva;
                    fila[3] = descuento;

                    double descuentoTotal = cantidadNueva * producto.getPrecio() * descuento;
                    double total = cantidadNueva * producto.getPrecio() - descuentoTotal;

                    fila[4] = total;
                    model.addRow(fila);
                    actualizarDatosMesero();
                    break;
                }
            }
        }       
    }//GEN-LAST:event_btnAgregarMeseroActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        int fila = tblPedidoMesero.getSelectedRow();
        float descuento = Float.parseFloat((String) cbxDescuentoMesero.getSelectedItem());
        int cantidad = (int) tblPedidoMesero.getValueAt(fila, 2);
        double precio = (double) tblPedidoMesero.getValueAt(fila, 1);
        double descuentoTotal = cantidad * precio * descuento;
        double total = cantidad * precio - descuentoTotal;
        tblPedidoMesero.setValueAt(descuento, fila, 3);
        tblPedidoMesero.setValueAt(total, fila, 4);    
        actualizarDatosMesero();
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void btnMenosItemMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosItemMeseroActionPerformed
        int fila = tblPedidoMesero.getSelectedRow();
        int cantidadActual = (int) tblPedidoMesero.getValueAt(fila, 2);
        int cantidadARestar = (int) spnMenosCantidadMesero.getValue();

        int nuevaCantidad = cantidadActual - cantidadARestar;

        double precio = (double) tblPedidoMesero.getValueAt(fila, 1);
        float descuento = (Float) tblPedidoMesero.getValueAt(fila, 3);

        double descuentoTotal = nuevaCantidad * precio * descuento;
        double total = nuevaCantidad * precio - descuentoTotal;

        tblPedidoMesero.setValueAt(nuevaCantidad, fila, 2); 
        tblPedidoMesero.setValueAt(total, fila, 4);       

        actualizarDatosMesero();
    }//GEN-LAST:event_btnMenosItemMeseroActionPerformed

    private void btnEliminarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMeseroActionPerformed
        int fila = tblPedidoMesero.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPedidoMesero.getModel();
        model.removeRow(fila);
        actualizarDatosMesero(); 
    }//GEN-LAST:event_btnEliminarMeseroActionPerformed

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        String nit = txtNitMesero.getText();
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = numPedido();
        double total = getNumero(lblTotalCompletoMesero.getText());
        int seRegistro = 0;
        for (int f = 0; f < tblPedidoMesero.getRowCount(); f++) {
            if (tblPedidoMesero.getValueAt(f, 0) != null) {
                String producto = (String) tblPedidoMesero.getValueAt(f, 0);
                double precioU = (double) tblPedidoMesero.getValueAt(f, 1);
                int cantidad = (int) tblPedidoMesero.getValueAt(f, 2);
                float descuento = (float) tblPedidoMesero.getValueAt(f, 3);
                seRegistro = pedidoControlador.registarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, false, precioU);
            }
        }
        if(seRegistro == 1){
            DefaultTableModel model = (DefaultTableModel) tblPedidoMesero.getModel();
            model.setRowCount(0); 
            actualizarDatosMesero();
        }
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void lblLogOutClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutClienteMouseClicked
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_lblLogOutClienteMouseClicked

    private void btnEliminarMesero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMesero1ActionPerformed
        int fila = tblPedidoCliente.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPedidoCliente.getModel();
        model.removeRow(fila);
        actualizarDatosCliente();
    }//GEN-LAST:event_btnEliminarMesero1ActionPerformed

    private void btnMenosItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosItemClienteActionPerformed
        int fila = tblPedidoCliente.getSelectedRow();
        int cantidadActual = (int) tblPedidoCliente.getValueAt(fila, 2);
        int cantidadARestar = (int) spnMenosCantidadCliente.getValue();

        int nuevaCantidad = cantidadActual - cantidadARestar;

        double precio = (double) tblPedidoCliente.getValueAt(fila, 1); 
        double total = nuevaCantidad * precio;

        tblPedidoCliente.setValueAt(nuevaCantidad, fila, 2);
        tblPedidoCliente.setValueAt(total, fila, 3);         

        actualizarDatosCliente();
    }//GEN-LAST:event_btnMenosItemClienteActionPerformed

    private void btnGenerarPedidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoClienteActionPerformed
        String nit = txtNitCliente.getText();
        int nitFacuta = Integer.parseInt(txtNitCliente.getText());
        String nombreCliente = clienteControlador.consularNombre(nit);
        int numPedido = numPedido();
        double total = getNumero(lblTotalCompletoCliente.getText());
        int seRegistro = 0;
        for (int f = 0; f < tblPedidoCliente.getRowCount(); f++) {
            if (tblPedidoCliente.getValueAt(f, 0) != null) {
                String producto = (String) tblPedidoCliente.getValueAt(f, 0);
                double precioU = (double) tblPedidoCliente.getValueAt(f, 1);
                int cantidad = (int) tblPedidoCliente.getValueAt(f, 2);
                float descuento = 0;
                seRegistro = pedidoControlador.registarPedido(numPedido, nombreCliente, nit, total, producto, cantidad, descuento, true, precioU);
            }
        }
        if(seRegistro == 1){
            PDFControlador.datosCliente(nitFacuta);
            PDFControlador.generarProcesoClientePDF();
            DefaultTableModel model = (DefaultTableModel) tblPedidoCliente.getModel();
            model.setRowCount(0); 
            actualizarDatosCliente();
        }
    }//GEN-LAST:event_btnGenerarPedidoClienteActionPerformed

    private void cbxTipoProductosClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoProductosClienteItemStateChanged
        actualizarPedidosCliente();
    }//GEN-LAST:event_cbxTipoProductosClienteItemStateChanged

    private void listaProductosClienteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProductosClienteValueChanged
        Producto producto = productoActual(listaProductosCliente.getSelectedValue());
        lblDisponiblesCliente.setText("Disponibles: " + String.valueOf(producto.getStock()));
    
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, producto.getStock(), 1);     
        spnCantReg.setModel(model);
        
        lblNombreProductoCliente.setText(producto.getNombre());
        txtAreaDescripcionProductoCliente.setText(producto.getDescripcion());
        lblPrecioCliente.setText("Precio: Q " + String.valueOf(producto.getPrecio()));
    }//GEN-LAST:event_listaProductosClienteValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblPedidoCliente.getModel();
        String productoSeleccionado = listaProductosCliente.getSelectedValue();
        int cantidadNueva = (int) jSpinner1.getValue();
        boolean encontrado = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            String nombreProducto = (String) model.getValueAt(i, 0);
            if (nombreProducto.equals(productoSeleccionado)) {
                int cantidadExistente = (int) model.getValueAt(i, 2);
                int nuevaCantidad = cantidadExistente + cantidadNueva;

                for (Producto producto : listaProductos) {
                    if (producto.getNombre().equals(productoSeleccionado)) {
                        double precio = producto.getPrecio();
                        double total = nuevaCantidad * precio;

                        model.setValueAt(nuevaCantidad, i, 2); 
                        model.setValueAt(total, i, 3);
                        actualizarDatosCliente();
                        break;
                    }
                }

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (Producto producto : listaProductos) {
                if (producto.getNombre().equals(productoSeleccionado)) {
                    Object[] fila = new Object[4];
                    fila[0] = producto.getNombre();
                    fila[1] = producto.getPrecio();
                    fila[2] = cantidadNueva;
                    fila[3] = cantidadNueva * producto.getPrecio();

                    model.addRow(fila);
                    actualizarDatosCliente();
                    break;
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut1MouseClicked
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "login");
    }//GEN-LAST:event_lblLogOut1MouseClicked

    private void lblGestionEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionEmpleadosMouseClicked
        CardLayout card = (CardLayout)appAdmin.getLayout();
        card.show(appAdmin, "gestionEmp");
    }//GEN-LAST:event_lblGestionEmpleadosMouseClicked

    private void lblGestionProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionProductosMouseClicked
        CardLayout card = (CardLayout)appAdmin.getLayout();
        card.show(appAdmin, "gestionProd");        
    }//GEN-LAST:event_lblGestionProductosMouseClicked

    private void lblGestionProveedoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionProveedoreMouseClicked
       CardLayout card = (CardLayout)appAdmin.getLayout();
        card.show(appAdmin, "gestionProveedor");
    }//GEN-LAST:event_lblGestionProveedoreMouseClicked

    private void tabPaneGestionEmpleadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneGestionEmpleadosStateChanged
        switch(tabPaneGestionEmpleados.getSelectedIndex()){
            case 0 -> {
            }
            case 1 -> {
                llenarTablaModificar(tblConsultarEmpleadosActualizar, empleadoControlador.consultarEmpleados());
            }
            case 2 -> {
                llenarTablaConsulta(tblConsultarEmpleados, empleadoControlador.consultarEmpleados());
            }
        }
    }//GEN-LAST:event_tabPaneGestionEmpleadosStateChanged

    private void cbxAgruparEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAgruparEmpleadosItemStateChanged
        llenarTablaConsulta(tblConsultarEmpleados, empleadoControlador.consultarEmpleados());
    }//GEN-LAST:event_cbxAgruparEmpleadosItemStateChanged

    private void tblConsultarEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarEmpleadosMouseClicked
        listaEmpleados = empleadoControlador.consultarEmpleados();
        int idSeleccionado = (int) tblConsultarEmpleados.getValueAt(tblConsultarEmpleados.getSelectedRow(), 0);
        for(Empleado empleado : listaEmpleados){
            if(empleado.getId() == idSeleccionado){
                lblNombreConsultaEmpleado.setText("Nombre: " + empleado.getNombre());
                lblCargoConsultaEmpleado.setText("Cargo: " + empleado.getCargo());
                lblEstadoConsultaEmpleado.setText("Estado: " + (empleado.isEstado() ? "Activo" : "Inactivo"));
                lblSalarioConsultaEmpleado.setText("Salario: " + empleado.getSalario());
                lblTelefonoConsultaEmpleado.setText("Teléfono: " + empleado.getTelefono());
                txtAreaDireccionConsultaEmpleado.setText(empleado.getDireccion());
                lblEmailConsultaEmpleado.setText("Email: " + empleado.getCorreo());
                lblFechaConsultaEmpleado.setText("Fecha de ingreso: " + empleado.getFechaIngreso().toString());
            }
        }
    }//GEN-LAST:event_tblConsultarEmpleadosMouseClicked

    private void txtApellidoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEmpleadoActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        if(!verificarCampos()){
            return;
        }

        String nombre = txtNombreEmpleado.getText();
        String apellido = txtApellidoEmpleado.getText();
        String cargo = txtCargoEmpleado.getText();
        boolean estado = true;
        double salario = Double.parseDouble(txtSalarioEmpleado.getText());
        String telefono = txtTelefonoEmpleado.getText();
        String direccion = txtAreaDireccionEmpleado.getText();
        String email = txtEmailEmpleado.getText();
        Date fechaIngreso = new Date();
        String password = txtClaveEmpleado.getText();
        boolean registroExitoso = false;
        
        if(mainControlador.comprobarCorreo(email)==5){
            lblMensaje.setText("El correo es incorrecto");
            return;
        }
        
        try {
             registroExitoso = empleadoControlador.registrarEmpleado(cargo, estado, fechaIngreso, salario, nombre, apellido, telefono, direccion, email, password);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (registroExitoso) {
            lblMensaje.setText("Empleado registrado correctamente.");
            limpiarCamposEmpleado();
        } else {
            lblMensaje.setText("Error al registrar el empleado.");
        }   
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void tblConsultarEmpleadosActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarEmpleadosActualizarMouseClicked
        int idSeleccionado = (int) tblConsultarEmpleadosActualizar.getValueAt(tblConsultarEmpleadosActualizar.getSelectedRow(), 0);
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId() == idSeleccionado) {
                txtNombreActualizarEmpleado.setText(empleado.getNombre());
                txtApellidoActualizarEmpleado.setText(empleado.getApellido());
                txtCargoActualizarEmpleado.setText(empleado.getCargo());
                txtSalarioActualizarEmpleado.setText(String.valueOf(empleado.getSalario()));
                txtTelefonoActualizarEmpleado.setText(empleado.getTelefono());
                txtCorreoActualizarEmpleado.setText(empleado.getCorreo());

                lblFechaActualizarEmpleado.setText("Fecha de ingreso: " + empleado.getFechaIngreso().toString());
                txtAreaDireccionActualizarEmpleado.setText(empleado.getDireccion());
                lblEstadoActualizarEmpleado.setText(empleado.isEstado() ? "Activo" : "Inactivo");
            }
        }
       
    }//GEN-LAST:event_tblConsultarEmpleadosActualizarMouseClicked

    private void txtClaveActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActualizarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActualizarEmpleadoActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        int id = (int) tblConsultarEmpleadosActualizar.getValueAt(tblConsultarEmpleadosActualizar.getSelectedRow(), 0);
        // Obtener datos desde la interfaz
        String nombre = txtNombreActualizarEmpleado.getText();
        String apellido = txtApellidoActualizarEmpleado.getText();
        String cargo = txtCargoActualizarEmpleado.getText();
        double salario = Double.parseDouble(txtSalarioActualizarEmpleado.getText());
        String telefono = txtTelefonoActualizarEmpleado.getText();
        String direccion = txtAreaDireccionActualizarEmpleado.getText();
        String correo = txtCorreoActualizarEmpleado.getText();
        String password = txtClaveActualizarEmpleado.getText();
        boolean estado = !chbxBajaEmpleado.isSelected(); 
        
        try {
            if (empleadoControlador.actualizarEmpleado(cargo, estado, salario, id, nombre, apellido, telefono, direccion, correo, password)) {
                lblMensajeActualizarEmpleado.setText("Empleado actualizado correctamente.");
            } else {
                lblMensajeActualizarEmpleado.setText("Error al actualizar el empleado.");
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        if (!verificarCamposProducto()) {
            return;
        }

        String nombre = txtNombreProductoReg.getText();
        String tipo = txtTipoProductoReg.getText();
        double precio = Double.parseDouble(txtPrecioProdReg.getText());
        int stock = Integer.parseInt(txtStockProductoReg.getText());
        String descripcion = txtAreaDescripcionProdReg.getText();
        boolean activo = true;

        boolean registroExitoso = productoControlador.registrarProducto(nombre, precio, descripcion, stock, activo, tipo);

        if (registroExitoso) {
            lblMensajeProducto.setText("Producto registrado correctamente.");
            limpiarCamposProducto();
        } else {
            lblMensajeProducto.setText("Error al registrar el producto.");
        }
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void tblConsultarProductosActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarProductosActualizarMouseClicked
        listaProductos = productoControlador.consultarProductos();
        int idSeleccionado = (int) tblConsultarProductosActualizar.getValueAt(tblConsultarProductosActualizar.getSelectedRow(), 0);

        for (Producto producto : listaProductos) {
            if (producto.getId() == idSeleccionado) {
                txtNombreProducto.setText(producto.getNombre());
                txtPrecioProducto.setText(String.valueOf(producto.getPrecio()));
                txtStockProducto.setText(String.valueOf(producto.getStock()));
                txtTipoProducto.setText(producto.getTipo());
                txtAreaDescripProdActualizar.setText(producto.getDescripcion());
                lblEstadoActualizarProducto.setText("Disponible: " + (producto.isDisponible()? "Sí" : "No"));

            }
        }
    }//GEN-LAST:event_tblConsultarProductosActualizarMouseClicked

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        int id = (int) tblConsultarProductosActualizar.getValueAt(tblConsultarProductosActualizar.getSelectedRow(), 0);
        String nombre = txtNombreProducto.getText();
        String tipo = txtTipoProducto.getText();
        double precio = Double.parseDouble(txtPrecioProducto.getText());
        int stock = Integer.parseInt(txtStockProducto.getText());
        String descripcion = txtAreaDescripProdActualizar.getText();
        boolean activo = !chbxBajaProducto.isSelected();

        if (productoControlador.actualizarProducto(id, nombre, precio, descripcion, stock, activo, tipo)) {
            lblMensajeActualizarProducto.setText("Producto actualizado correctamente.");
        } else {
            lblMensajeActualizarProducto.setText("Error al actualizar el producto.");
        }
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void tblConsultarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarProductosMouseClicked
        listaProductos = productoControlador.consultarProductos();
        int idSeleccionado = (int) tblConsultarProductos.getValueAt(tblConsultarProductos.getSelectedRow(), 0);
        for (Producto producto : listaProductos) {
            if (producto.getId() == idSeleccionado) {
                lblNombreConsultaProducto.setText("Nombre: " + producto.getNombre());
                lblPrecioConsulta.setText("Precio: " + producto.getPrecio());
                lblStockProducto.setText("Stock: " + producto.getStock());
                lblEstadoConsultaProducto.setText("Estado: " + (producto.isDisponible()? "Activo" : "Inactivo"));
                txtAreaDescripcionProducto.setText(producto.getDescripcion());
                lblTipoProducto.setText("Tipo: " + producto.getTipo());
            }
        }
    }//GEN-LAST:event_tblConsultarProductosMouseClicked

    private void cbxAgruparProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAgruparProductosItemStateChanged
        llenarTablaProductosConsulta(tblConsultarProductos, productoControlador.consultarProductos());
    }//GEN-LAST:event_cbxAgruparProductosItemStateChanged

    private void tabPaneGestionProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneGestionProductosStateChanged
        switch(tabPaneGestionProductos.getSelectedIndex()){
            case 0 -> {
            }
            case 1 -> {
                llenarTablaProductosConsulta(tblConsultarProductosActualizar, productoControlador.consultarProductos());
            }
            case 2 -> {
                llenarTablaProductosConsulta(tblConsultarProductos, productoControlador.consultarProductos());
            }
        }       
    }//GEN-LAST:event_tabPaneGestionProductosStateChanged

    private void txtNitProveedorRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitProveedorRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitProveedorRegActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        if (!verificarCamposProveedor()) {
            return;
        }

        String nombre = txtNombreProveedorReg.getText();
        String nit = txtNitProveedorReg.getText();
        String correo = txtContactoProveedor.getText();
        String direccion = txtAreaDireccionProveedorReg.getText();
        String telefonoEmpresa = txtTelefonoEmpresarialReg.getText();
        String telefonoContacto = txtTelefonoContactoReg.getText();

        boolean registroExitoso = proveedorControlador.registrarProveedor(nit, telefonoContacto, nombre, telefonoEmpresa, direccion, correo);

        if (registroExitoso) {
            lblMensajeProveedor.setText("Proveedor registrado correctamente.");
            limpiarCamposProveedor();
        } else {
            lblMensajeProveedor.setText("Error al registrar el proveedor.");
        }

    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void limpiarCamposProveedor() {
    txtNombreProveedorReg.setText("");
    txtNitProveedorReg.setText("");
    txtContactoProveedor.setText("");
    txtAreaDireccionProveedorReg.setText("");
    txtTelefonoEmpresarialReg.setText("");
    txtTelefonoContactoReg.setText("");
    lblMensajeProveedor.setText("");
    }
    
    private boolean verificarCamposProveedor(){
    lblMensajeProveedor.setText("");

    if ("".equals(txtNombreProveedorReg.getText())) {
        lblMensajeProveedor.setText("El nombre es obligatorio.");
        return false;
    }
    if ("".equals(txtNitProveedorReg.getText())) {
        lblMensajeProveedor.setText("El NIT es obligatorio.");
        return false;
    }
    if ("".equals(txtContactoProveedor.getText())) {
        lblMensajeProveedor.setText("El correo es obligatorio.");
        return false;
    }
    if ("".equals(txtAreaDireccionProveedorReg.getText())) {
        lblMensajeProveedor.setText("La dirección es obligatoria.");
        return false;
    }
    if ("".equals(txtTelefonoEmpresarialReg.getText())) {
        lblMensajeProveedor.setText("El teléfono empresarial es obligatorio.");
        return false;
    }
    if ("".equals(txtTelefonoContactoReg.getText())) {
        lblMensajeProveedor.setText("El teléfono de contacto es obligatorio.");
        return false;
    }

    return true;
}
    
    private void tblConsultarProveedoresAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarProveedoresAdmMouseClicked
        listaProveedores = proveedorControlador.consultarProveedores();
        int idSeleccionado = (int) tblConsultarProveedoresAdm.getValueAt(tblConsultarProveedoresAdm.getSelectedRow(), 0);

        for (Proveedor proveedor : listaProveedores) {
            if (proveedor.getId() == idSeleccionado) {
                txtNombreActualizarProveedor.setText(proveedor.getNombre());
                txtNitActualizarProveedor.setText(proveedor.getNit());
                txtContactoActualizarProveedor.setText(proveedor.getCorreo());
                txtTelefonoEmpresarialAct.setText(proveedor.getTelefono());
                txtTelefonoContacto.setText(proveedor.getTelefonoContacto());
                txtAreaDireccionActualizarProveedor.setText(proveedor.getDireccion());
                break;
            }
        }
    }//GEN-LAST:event_tblConsultarProveedoresAdmMouseClicked

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
        int id = (int) tblConsultarProveedoresAdm.getValueAt(tblConsultarProveedoresAdm.getSelectedRow(), 0);
        String nombre = txtNombreActualizarProveedor.getText();
        String nit = txtNitActualizarProveedor.getText();
        String contacto = txtContactoActualizarProveedor.getText();
        String direccion = txtAreaDireccionActualizarProveedor.getText();
        String telefonoEmpresarial = txtTelefonoEmpresarialAct.getText();
        String telefonoContacto = txtTelefonoContacto.getText();

        if (proveedorControlador.actualizarProveedor(id, nombre, nit, contacto, direccion, telefonoEmpresarial, telefonoContacto)) {
            lblMensajeActualizarProveedor.setText("Proveedor actualizado correctamente.");
        } else {
            lblMensajeActualizarProveedor.setText("Error al actualizar el proveedor.");
        }
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void txtTelefonoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoContactoActionPerformed

    private void tblConsultarProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarProveedoresMouseClicked
        listaProveedores = proveedorControlador.consultarProveedores();
        int idSeleccionado = (int) tblConsultarProveedores.getValueAt(tblConsultarProveedores.getSelectedRow(), 0);
        for (Proveedor proveedor : listaProveedores) {
            if (proveedor.getId() == idSeleccionado) {
                lblNombreConsultaProveedor.setText("Nombre: " + proveedor.getNombre());
                lblNitProveedor.setText("NIT: " + proveedor.getNit());
                lblContactoProveedor.setText("Correo: " + proveedor.getCorreo());
                lblTelefonoEmpresaProveedor.setText("Teléfono empresa: " + proveedor.getTelefono());
                lblTelefonoContactoProveedor.setText("Teléfono contacto: " + proveedor.getTelefonoContacto());
                txtAreaDireccionProveedor.setText(proveedor.getDireccion());
            }
        }
    }//GEN-LAST:event_tblConsultarProveedoresMouseClicked

    private void tabPaneGestionProveedoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneGestionProveedoresStateChanged
        switch(tabPaneGestionProveedores.getSelectedIndex()){
            case 0 -> {
            }
            case 1 -> {
                llenarTablaProveedoresConsulta(tblConsultarProveedoresAdm, proveedorControlador.consultarProveedores());
            }
            case 2 -> {
                llenarTablaProveedoresConsulta(tblConsultarProveedores, proveedorControlador.consultarProveedores());
            }
        }        
    }//GEN-LAST:event_tabPaneGestionProveedoresStateChanged

    private void lblGestionProveedore1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGestionProveedore1MouseClicked
        CardLayout card = (CardLayout)appAdmin.getLayout();
        card.show(appAdmin, "gestionClientes");
    }//GEN-LAST:event_lblGestionProveedore1MouseClicked

    private void txtTelefonoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoRegActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed


        String nombre = txtNombreClienteReg.getText();
        String telefono = txtTelefonoReg.getText();
        String direccion = txtAreaDireccionClienteReg.getText();
        String correo = txtCorreoClienteReg.getText();
        String clave = txtClaveClienteReg.getText();

        boolean registroExitoso = false;
        try {
            registroExitoso = clienteControlador.registrarCliente(correo, clave, nombre, telefono, direccion);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (registroExitoso) {
            lblMensajeCliente.setText("Cliente registrado correctamente.");
            limpiarCamposProveedor();
        } else {
            lblMensajeCliente.setText("Error al registrar el cliente.");
        }                                           
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void tblActualizarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActualizarClientesMouseClicked
        listaClientes = clienteControlador.consultarCliente();
        int idSeleccionado = (int) tblActualizarClientes.getValueAt(tblActualizarClientes.getSelectedRow(), 0);

        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idSeleccionado) {
                txtNombreActualizarCliente.setText(cliente.getNombre());
                txtTelefonoActualizarCliente.setText(cliente.getTelefono());
                txtNitActualizarCliente.setText(cliente.getNit());
                txtAreaDireccionActualizarCliente.setText(cliente.getDireccion());
                txtCorreoCliente.setText(cliente.getCorreo());
                break;
            }
        }
    }//GEN-LAST:event_tblActualizarClientesMouseClicked

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        int id = (int) tblActualizarClientes.getValueAt(tblActualizarClientes.getSelectedRow(), 0);
        String nombre = txtNombreActualizarCliente.getText();
        String nit = txtNitActualizarCliente.getText();
        String telefono = txtTelefonoActualizarCliente.getText();
        String direccion = txtAreaDireccionActualizarCliente.getText();
        String correo = txtCorreoCliente.getText();

        if (clienteControlador.actualizarClientes(nit, id, nombre, telefono, direccion, correo, correo)) {
            lblMensajeClientesActualizar.setText("Cliente actualizado correctamente.");
        } else {
            lblMensajeClientesActualizar.setText("Error al actualizar el cliente.");
        }
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void tblConsultarClientesAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultarClientesAdminMouseClicked
        listaClientes = clienteControlador.consultarCliente();
        int idSeleccionado = (int) tblConsultarClientesAdmin.getValueAt(tblConsultarClientesAdmin.getSelectedRow(), 0);
        for(Cliente cliente : listaClientes){
            if(cliente.getId() == idSeleccionado){
                lblNombreClienteConsulta.setText("Nombre: " + cliente.getNombre());
                lblTelefonoClienteConsulta.setText("Teléfono: " + cliente.getTelefono());
                lblNitCliente.setText("NIT: " + cliente.getNit());
                txtAreaDireccionClienteConsulta.setText(cliente.getDireccion());
                lblClienteCorreoConsultar.setText("Correo: " + cliente.getCorreo());
            }
        }
    }//GEN-LAST:event_tblConsultarClientesAdminMouseClicked

    private void tabPaneGestionClientesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPaneGestionClientesStateChanged
        switch(tabPaneGestionClientes.getSelectedIndex()){
            case 0 -> {
                break;
            }
            case 1 -> {
                llenarTablaClientesConsulta(tblActualizarClientes);
                break;
            }
            case 2 -> {
                llenarTablaClientesConsulta(tblConsultarClientesAdmin);
                break;
            }
        }
    }//GEN-LAST:event_tabPaneGestionClientesStateChanged

    
    private void llenarTablaClientesConsulta(JTable tabla){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        for (Cliente cliente : listaClientes) {
            Object[] fila = new Object[2];
            fila[0] = cliente.getId();
            fila[1] = cliente.getNombre();
            model.addRow(fila);
        }

        tabla.setModel(model);
    }
    
    private void llenarTablaProveedoresConsulta(JTable tabla, List<Proveedor> lista){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        for (Proveedor proveedor : lista) {
            Object[] fila = new Object[2];
            fila[0] = proveedor.getId();
            fila[1] = proveedor.getNombre();
            model.addRow(fila);
        }

        tabla.setModel(model);
    }
    
    private void llenarTablaProductosConsulta(JTable tabla, List<Producto> lista){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        String tipoSeleccionado = (String) cbxAgruparProductos.getSelectedItem();

        for (Producto producto : lista) {
            if (tipoSeleccionado.equals("Todos") || producto.getTipo().equals(tipoSeleccionado)) {
                Object[] fila = new Object[3];
                fila[0] = producto.getId();
                fila[1] = producto.getNombre();
                fila[2] = producto.getTipo();
                model.addRow(fila);
            }
        }

        tabla.setModel(model);
    }
    
    private boolean verificarCampos(){
        lblMensaje.setText("");
        
        if ("".equals(txtNombreEmpleado.getText())) {
            lblMensaje.setText("El nombre es obligatorio.");
            return false;
        }
        if ("".equals(txtApellidoEmpleado.getText())) {
            lblMensaje.setText("El apellido es obligatorio.");
            return false;
        }
        if ("".equals(txtCargoEmpleado.getText())) {
            lblMensaje.setText("El cargo es obligatorio.");
            return false;
        }
        if ("".equals(txtSalarioEmpleado.getText())) {
            lblMensaje.setText("El salario es obligatorio.");
            return false;
        }
        if ("".equals(txtTelefonoEmpleado.getText())) {
            lblMensaje.setText("El teléfono es obligatorio.");
            return false;
        }
        if ("".equals(txtAreaDireccionEmpleado.getText())) {
            lblMensaje.setText("La dirección es obligatoria.");
            return false;
        }
        if ("".equals(txtEmailEmpleado.getText())) {
            lblMensaje.setText("El email es obligatorio.");
            return false;
        }
        if ("".equals(txtClaveEmpleado.getText())) {
            lblMensaje.setText("La clave es obligatoria.");
            return false;
        }

    return true;
}
    
    private void limpiarCamposEmpleado(){
        txtNombreEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        txtCargoEmpleado.setText("");
        txtSalarioEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtAreaDireccionEmpleado.setText("");
        txtEmailEmpleado.setText("");
        txtClaveEmpleado.setText("");
    }
    
    private void llenarTablaConsulta(JTable tabla, List<Empleado> lista){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        
        String agrupar = (String)cbxAgruparEmpleados.getSelectedItem();
        switch(agrupar){
            case "Estado" -> lista.sort((e1, e2) -> Boolean.compare(!e1.isEstado(), !e2.isEstado()));
            case "Cargo" -> lista.sort(Comparator.comparing(Empleado::getCargo));    
        }
        
        for(Empleado empleado : lista){
            Object[] fila = new Object[5];
            fila[0] = empleado.getId();
            fila[1] = empleado.getNombre() + " " + empleado.getApellido();
            fila[2] = empleado.getCargo();
            fila[3] = empleado.isEstado();
            fila[4] = empleado.getSalario();
            model.addRow(fila);
        }
        tabla.setModel(model);
    }
    
    private void llenarTablaModificar(JTable tabla, List<Empleado> lista){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        
        for(Empleado empleado : lista){
            Object[] fila = new Object[2];
            fila[0] = empleado.getId();
            fila[1] = empleado.getNombre() + " " + empleado.getApellido();
            model.addRow(fila);
        }
        tabla.setModel(model);
    }
    
    private void actualizarDatosMesero(){
    double subTotal = 0;
    double descuento;
    double descuentoTotal = 0;
    double impuesto;
    double total;

    for (int i = 0; i < tblPedidoMesero.getRowCount(); i++) {
        if (tblPedidoMesero.getValueAt(i, 4) != null) {
            subTotal += (double) tblPedidoMesero.getValueAt(i, 4);
        }

        if (tblPedidoMesero.getValueAt(i, 3) != null) {
            float descuentoFila = (Float) tblPedidoMesero.getValueAt(i, 3);
            if (descuentoFila != 0f) {
                int cantidad = (int) tblPedidoMesero.getValueAt(i, 2); 
                double precio = (double) tblPedidoMesero.getValueAt(i, 1);
                descuento = cantidad * precio * descuentoFila;
                descuentoTotal += descuento;
            }
        }
    }

    impuesto = subTotal * 0.16;
    total = subTotal + impuesto - descuentoTotal;

    lblSubTotalMesero.setText("Q " + String.format("%.2f", subTotal));
    lblDescuentoMesero.setText("Q " + String.format("%.2f", descuentoTotal));
    lblImpuestosMesero.setText("Q " + String.format("%.2f", impuesto));
    lblTotalCompletoMesero.setText("Q " + String.format("%.2f", total));
}
    
    private void actualizarDatosPedidoPendiente(){
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblProdCompletar.getRowCount(); i++){
            if(tblProdCompletar.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblProdCompletar.getValueAt(i, 4);
            }
            
            if(tblProdCompletar.getValueAt(i, 3) != null){
                if((float)tblProdCompletar.getValueAt(i, 3) != 0){
                    descuento = (double)tblProdCompletar.getValueAt(i, 2) * (int)tblProdCompletar.getValueAt(i, 1) * (Float)tblProdCompletar.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalNoComp.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotalNoCompletados.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestosNoComp.setText("Q " + String.format("%.2f", impuesto));
        lblTotalReciboNoComp.setText("Q " + String.format("%.2f", total));        
    }
    
    private void actualizarDatosConsulta(){    
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblConsultaPedidos.getRowCount(); i++){
            if(tblConsultaPedidos.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblConsultaPedidos.getValueAt(i, 4);
            }
            
            if(tblConsultaPedidos.getValueAt(i, 3) != null){
                if((float)tblConsultaPedidos.getValueAt(i, 3) != 0){
                    descuento = (double)tblConsultaPedidos.getValueAt(i, 2) * (int)tblConsultaPedidos.getValueAt(i, 1) * (Float)tblConsultaPedidos.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalConsulta.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotalConsulta.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestosConsulta.setText("Q " + String.format("%.2f", impuesto));
        lblTotalReciboConsulta.setText("Q " + String.format("%.2f", total));
    }
    
    private void actualizarDatos(){
        double subTotal = 0;
        double descuento;
        double descuentoTotal = 0;
        double impuesto = 0;
        double total = 0;
        for(int i = 0; i<tblProdReg.getRowCount(); i++){
            if(tblProdReg.getValueAt(i, 4) != null){
                subTotal = subTotal + (double)tblProdReg.getValueAt(i, 4);
            }
            
            if(tblProdReg.getValueAt(i, 3) != null){
                if((float)tblProdReg.getValueAt(i, 3) != 0){
                    descuento = (double)tblProdReg.getValueAt(i, 2) * (int)tblProdReg.getValueAt(i, 1) * (Float)tblProdReg.getValueAt(i, 3);
                    descuentoTotal = descuentoTotal + descuento;
                }   
            }
            
            impuesto = subTotal * 0.16;
            total = subTotal + impuesto - descuentoTotal;
        }
        
        lblSubTotalMostrar.setText("Q " + String.format("%.2f", subTotal));
        lblDescuentoTotal.setText("Q " + String.format("%.2f", descuentoTotal));
        lblImpuestos.setText("Q " + String.format("%.2f", impuesto));
        lblTotalRecibo.setText("Q " + String.format("%.2f", total));
    }
    
    private void actualizarListaProductos(){
        DefaultListModel<String> model;
        model = new DefaultListModel<>();
        for(Producto productos : listaProductos){    
            if(cbxRegProductos.getSelectedItem().equals(productos.getTipo())){      
                model.addElement(productos.getNombre());
            }else if(cbxRegProductos.getSelectedItem().equals("-")){
                model.addElement(productos.getNombre());
            } 
        }
        listProductos.setModel(model);
    }
    
    private void showContra(){
        if(showPassword){
            passClave.setEchoChar('\u0000');
        }else{
            passClave.setEchoChar('\u2022');
        }
    }
    
    private boolean existeRegistro(){
        for(int f = 0; f<tblProdReg.getRowCount(); f++){
            if(listProductos.getSelectedValue() == tblProdReg.getValueAt(f, 0)){
                return true;
            } 
        }
        return false;
    }
    
    private int numPedido(){
        int numPedido;
        int ultimoIndex = listaPedidos.size() - 1;
        Pedido ultimoPedido = listaPedidos.get(ultimoIndex);
        
        numPedido = ultimoPedido.getNumPedido() + 1;
        
        return numPedido;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Registrar;
    private javax.swing.JPanel aplicacionAdmin;
    private javax.swing.JPanel aplicacionCajero;
    private javax.swing.JPanel aplicacionCliente;
    private javax.swing.JPanel aplicacionMesero;
    private javax.swing.JPanel appAdmin;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnAgregarMesero;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnDescuentoTabla;
    private javax.swing.JButton btnDescuentoTablaNoComp;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnEliminarMesero;
    private javax.swing.JButton btnEliminarMesero1;
    private javax.swing.JButton btnEliminarTabla;
    private javax.swing.JButton btnEliminarTablaNoCompletado;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JButton btnGenerarPedidoCliente;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMenosItemCliente;
    private javax.swing.JButton btnMenosItemMesero;
    private javax.swing.JButton btnPagarPedido;
    private javax.swing.JButton btnPagarPedidoNoComp;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JComboBox<String> cbxAgruparEmpleados;
    private javax.swing.JComboBox<String> cbxAgruparProductos;
    private javax.swing.JComboBox<String> cbxDescuento;
    private javax.swing.JComboBox<String> cbxDescuentoMesero;
    private javax.swing.JComboBox<String> cbxDescuentoNoComp;
    private javax.swing.JComboBox<String> cbxFiltrarPedidos;
    private javax.swing.JComboBox<String> cbxRegProductos;
    private javax.swing.JComboBox<String> cbxTipoProductosCliente;
    private javax.swing.JComboBox<String> cbxTipoProductosMesero;
    private javax.swing.JCheckBox chbxBajaEmpleado;
    private javax.swing.JCheckBox chbxBajaProducto;
    private javax.swing.JPanel compOrden;
    private javax.swing.JPanel consultarPedidos;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblAddReg;
    private javax.swing.JLabel lblCargoConsultaEmpleado;
    private javax.swing.JLabel lblCargoConsultaEmpleado1;
    private javax.swing.JLabel lblClienteCorreoConsultar;
    private javax.swing.JLabel lblCompletarOrden;
    private javax.swing.JLabel lblConsultarPedido;
    private javax.swing.JLabel lblContactoProveedor;
    private javax.swing.JLabel lblDecoracion;
    private javax.swing.JLabel lblDescuentoMesero;
    public static javax.swing.JLabel lblDescuentoTotal;
    private javax.swing.JLabel lblDescuentoTotalConsulta;
    public static javax.swing.JLabel lblDescuentoTotalNoCompletados;
    private javax.swing.JLabel lblDispReg;
    private javax.swing.JLabel lblDisponibleMesero;
    private javax.swing.JLabel lblDisponiblesCliente;
    private javax.swing.JLabel lblEmailConsultaEmpleado;
    private javax.swing.JLabel lblEmailConsultaEmpleado1;
    private javax.swing.JLabel lblEmailConsultaEmpleado2;
    private javax.swing.JLabel lblEmailConsultaEmpleado3;
    private javax.swing.JLabel lblEmailConsultaEmpleado4;
    private javax.swing.JLabel lblEstadoActualizarEmpleado;
    private javax.swing.JLabel lblEstadoActualizarProducto;
    private javax.swing.JLabel lblEstadoConsultaEmpleado;
    private javax.swing.JLabel lblEstadoConsultaProducto;
    private javax.swing.JLabel lblFechaActualizarEmpleado;
    private javax.swing.JLabel lblFechaConsultaEmpleado;
    private javax.swing.JLabel lblGestionEmpleados;
    private javax.swing.JLabel lblGestionProductos;
    private javax.swing.JLabel lblGestionProveedore;
    private javax.swing.JLabel lblGestionProveedore1;
    private javax.swing.JLabel lblIcono;
    public static javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblImpuestosCliente;
    private javax.swing.JLabel lblImpuestosConsulta;
    private javax.swing.JLabel lblImpuestosMesero;
    public static javax.swing.JLabel lblImpuestosNoComp;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblLogOut1;
    private javax.swing.JLabel lblLogOutCliente;
    private javax.swing.JLabel lblLogOutMesero;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblMensaje3;
    private javax.swing.JLabel lblMensaje5;
    private javax.swing.JLabel lblMensajeActualizarEmpleado;
    private javax.swing.JLabel lblMensajeActualizarProducto;
    private javax.swing.JLabel lblMensajeActualizarProveedor;
    private javax.swing.JLabel lblMensajeCliente;
    private javax.swing.JLabel lblMensajeClientesActualizar;
    private javax.swing.JLabel lblMensajeContra;
    private javax.swing.JLabel lblMensajeCorreo;
    private javax.swing.JLabel lblMensajeProducto;
    private javax.swing.JLabel lblMensajeProveedor;
    private javax.swing.JLabel lblNitCliente;
    private javax.swing.JLabel lblNitConsulta;
    private javax.swing.JLabel lblNitProveedor;
    private javax.swing.JLabel lblNombreClienteConsulta;
    private javax.swing.JLabel lblNombreConsulta;
    private javax.swing.JLabel lblNombreConsultaEmpleado;
    private javax.swing.JLabel lblNombreConsultaEmpleado1;
    private javax.swing.JLabel lblNombreConsultaEmpleado2;
    private javax.swing.JLabel lblNombreConsultaEmpleado3;
    private javax.swing.JLabel lblNombreConsultaEmpleado4;
    private javax.swing.JLabel lblNombreConsultaEmpleado5;
    private javax.swing.JLabel lblNombreConsultaEmpleado6;
    private javax.swing.JLabel lblNombreConsultaProducto;
    private javax.swing.JLabel lblNombreConsultaProveedor;
    private javax.swing.JLabel lblNombreProductoCliente;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblNumPedidoMesero;
    private javax.swing.JLabel lblPrecioCliente;
    private javax.swing.JLabel lblPrecioConsulta;
    private javax.swing.JLabel lblPrecioMesero;
    private javax.swing.JLabel lblPrecioReg;
    private javax.swing.JLabel lblRegBack;
    private javax.swing.JLabel lblRegMensaje;
    private javax.swing.JLabel lblRegTitulo;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblRegistrarOrden;
    private javax.swing.JLabel lblSalarioConsultaEmpleado;
    private javax.swing.JLabel lblSalarioConsultaEmpleado1;
    private javax.swing.JLabel lblSalarioConsultaEmpleado2;
    private javax.swing.JLabel lblSalarioConsultaEmpleado3;
    private javax.swing.JLabel lblShowHide;
    private javax.swing.JLabel lblStockProducto;
    public static javax.swing.JLabel lblSubTotalCliente;
    private javax.swing.JLabel lblSubTotalConsulta;
    private javax.swing.JLabel lblSubTotalMesero;
    public static javax.swing.JLabel lblSubTotalMostrar;
    public static javax.swing.JLabel lblSubTotalNoComp;
    private javax.swing.JLabel lblTelefonoClienteConsulta;
    private javax.swing.JLabel lblTelefonoConsultaEmpleado;
    private javax.swing.JLabel lblTelefonoConsultaEmpleado1;
    private javax.swing.JLabel lblTelefonoConsultaEmpleado2;
    private javax.swing.JLabel lblTelefonoConsultaEmpleado3;
    private javax.swing.JLabel lblTelefonoConsultaEmpleado4;
    private javax.swing.JLabel lblTelefonoContactoProveedor;
    private javax.swing.JLabel lblTelefonoEmpresaProveedor;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTipoProducto;
    private javax.swing.JLabel lblTotReg;
    public static javax.swing.JLabel lblTotalCompletoCliente;
    private javax.swing.JLabel lblTotalCompletoMesero;
    private javax.swing.JLabel lblTotalMesero;
    public static javax.swing.JLabel lblTotalRecibo;
    private javax.swing.JLabel lblTotalReciboConsulta;
    public static javax.swing.JLabel lblTotalReciboNoComp;
    private javax.swing.JList<String> listPedidos;
    private javax.swing.JList<String> listProductos;
    private javax.swing.JList<String> listaProductosCliente;
    private javax.swing.JList<String> listaProductosMesero;
    private javax.swing.JList<String> listaProductosPendientes;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuBarCajero;
    private javax.swing.JPanel menuBarCliente;
    private javax.swing.JPanel menuBarMesero;
    private javax.swing.JPanel menuBarProveedor;
    private javax.swing.JPanel menuCajero;
    private javax.swing.JPanel panelAppCliente;
    private javax.swing.JPanel panelAppMesero;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JPasswordField passRegClave;
    private javax.swing.JPasswordField passRegClaveConf;
    private javax.swing.JPanel pnlActualizarCliente;
    private javax.swing.JPanel pnlActualizarEmpleado;
    private javax.swing.JPanel pnlActualizarProd;
    private javax.swing.JPanel pnlActualizarProducto;
    private javax.swing.JPanel pnlActualizarProveedor;
    private javax.swing.JPanel pnlConsultarCliente;
    private javax.swing.JPanel pnlConsultarEmpleadoAdmin;
    private javax.swing.JPanel pnlConsultarEmpleadoAdmin1;
    private javax.swing.JPanel pnlConsultarProducto;
    private javax.swing.JPanel pnlConsultarProveedor;
    private javax.swing.JPanel pnlGestionClientes;
    private javax.swing.JPanel pnlGestionClientesMain;
    private javax.swing.JPanel pnlGestionEmpleados;
    private javax.swing.JPanel pnlGestionProductos;
    private javax.swing.JPanel pnlGestionProveedores;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlRegistrarCliente;
    private javax.swing.JPanel pnlRegistrarEmpleado;
    private javax.swing.JPanel pnlRegistrarProducto;
    private javax.swing.JPanel pnlRegistrarProveedor;
    private javax.swing.JPanel regOrden;
    private javax.swing.JSpinner spnCantReg;
    private javax.swing.JSpinner spnCantidadMesero;
    private javax.swing.JSpinner spnMenosCantidad;
    private javax.swing.JSpinner spnMenosCantidadCliente;
    private javax.swing.JSpinner spnMenosCantidadMesero;
    private javax.swing.JSpinner spnMenosCantidadNoComp;
    private javax.swing.JTabbedPane tabPaneGestionClientes;
    private javax.swing.JTabbedPane tabPaneGestionEmpleados;
    private javax.swing.JTabbedPane tabPaneGestionProductos;
    private javax.swing.JTabbedPane tabPaneGestionProveedores;
    private javax.swing.JTable tblActualizarClientes;
    private javax.swing.JTable tblConsultaPedidos;
    private javax.swing.JTable tblConsultarClientesAdmin;
    private javax.swing.JTable tblConsultarEmpleados;
    private javax.swing.JTable tblConsultarEmpleadosActualizar;
    private javax.swing.JTable tblConsultarProductos;
    private javax.swing.JTable tblConsultarProductosActualizar;
    private javax.swing.JTable tblConsultarProveedores;
    private javax.swing.JTable tblConsultarProveedoresAdm;
    public static javax.swing.JTable tblPedidoCliente;
    private javax.swing.JTable tblPedidoMesero;
    public static javax.swing.JTable tblProdCompletar;
    public static javax.swing.JTable tblProdReg;
    private javax.swing.JTextField txtApellidoActualizarEmpleado;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextArea txtAreaDescripProdActualizar;
    private javax.swing.JTextArea txtAreaDescripcionProdReg;
    private javax.swing.JTextArea txtAreaDescripcionProducto;
    private javax.swing.JTextArea txtAreaDescripcionProductoCliente;
    private javax.swing.JTextArea txtAreaDireccionActualizarCliente;
    private javax.swing.JTextArea txtAreaDireccionActualizarEmpleado;
    private javax.swing.JTextArea txtAreaDireccionActualizarProveedor;
    private javax.swing.JTextArea txtAreaDireccionClienteConsulta;
    private javax.swing.JTextArea txtAreaDireccionClienteReg;
    private javax.swing.JTextArea txtAreaDireccionConsultaEmpleado;
    private javax.swing.JTextArea txtAreaDireccionEmpleado;
    private javax.swing.JTextArea txtAreaDireccionProveedor;
    private javax.swing.JTextArea txtAreaDireccionProveedorReg;
    private javax.swing.JTextField txtCargoActualizarEmpleado;
    private javax.swing.JTextField txtCargoEmpleado;
    private javax.swing.JTextField txtClaveActualizarEmpleado;
    private javax.swing.JTextField txtClaveClienteReg;
    private javax.swing.JTextField txtClaveEmpleado;
    private javax.swing.JTextField txtContactoActualizarProveedor;
    private javax.swing.JTextField txtContactoProveedor;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoActualizarEmpleado;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtCorreoClienteReg;
    private javax.swing.JTextField txtEmailEmpleado;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNITNoComp;
    private javax.swing.JTextField txtNitActualizarCliente;
    private javax.swing.JTextField txtNitActualizarProveedor;
    private javax.swing.JTextField txtNitCliente;
    private javax.swing.JTextField txtNitMesero;
    private javax.swing.JTextField txtNitProveedorReg;
    private javax.swing.JTextField txtNombreActualizarCliente;
    private javax.swing.JTextField txtNombreActualizarEmpleado;
    private javax.swing.JTextField txtNombreActualizarProveedor;
    private javax.swing.JTextField txtNombreClienteReg;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProductoReg;
    private javax.swing.JTextField txtNombreProveedorReg;
    private javax.swing.JTextField txtPrecioProdReg;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtRegCorreo;
    private javax.swing.JTextField txtRegDireccion;
    private javax.swing.JTextField txtRegNombre;
    private javax.swing.JTextField txtRegTelefono;
    private javax.swing.JTextField txtSalarioActualizarEmpleado;
    private javax.swing.JTextField txtSalarioEmpleado;
    private javax.swing.JTextField txtStockProducto;
    private javax.swing.JTextField txtStockProductoReg;
    private javax.swing.JTextField txtTelefonoActualizarCliente;
    private javax.swing.JTextField txtTelefonoActualizarEmpleado;
    private javax.swing.JTextField txtTelefonoContacto;
    private javax.swing.JTextField txtTelefonoContactoReg;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTelefonoEmpresarialAct;
    private javax.swing.JTextField txtTelefonoEmpresarialReg;
    private javax.swing.JTextField txtTelefonoReg;
    private javax.swing.JTextField txtTipoProducto;
    private javax.swing.JTextField txtTipoProductoReg;
    // End of variables declaration//GEN-END:variables

    private void actualizarDatosCliente() {
        double subTotal = 0;
        double impuesto = 0;
        double total = 0;

        for (int i = 0; i < tblPedidoCliente.getRowCount(); i++){
            if (tblPedidoCliente.getValueAt(i, 3) != null){ 
                subTotal += (double) tblPedidoCliente.getValueAt(i, 3);
            }
        }

        impuesto = subTotal * 0.16;
        total = subTotal + impuesto;

        lblSubTotalCliente.setText("Q " + String.format("%.2f", subTotal));
        lblImpuestosCliente.setText("Q " + String.format("%.2f", impuesto));
        lblTotalCompletoCliente.setText("Q " + String.format("%.2f", total));
    }

    private boolean verificarCamposProducto() {
        lblMensajeProducto.setText("");
        if ("".equals(txtNombreProductoReg.getText())) {
            lblMensajeProducto.setText("El nombre es obligatorio.");
            return false;
        }
        if ("".equals(txtTipoProductoReg.getText())) {
            lblMensajeProducto.setText("El tipo es obligatorio.");
            return false;
        }
        if ("".equals(txtPrecioProdReg.getText())) {
            lblMensajeProducto.setText("El precio es obligatorio.");
            return false;
        }
        if ("".equals(txtStockProductoReg.getText())) {
            lblMensajeProducto.setText("El stock es obligatorio.");
            return false;
        }
        if ("".equals(txtAreaDescripcionProdReg.getText())) {
            lblMensajeProducto.setText("La descripción es obligatoria.");
            return false;
        }
        return true;

    }

    private void limpiarCamposProducto() {
        txtNombreProductoReg.setText("");
        txtStockProductoReg.setText("");
        txtPrecioProdReg.setText("");
        txtTipoProductoReg.setText("");
        txtAreaDescripcionProdReg.setText("");
    }
}
