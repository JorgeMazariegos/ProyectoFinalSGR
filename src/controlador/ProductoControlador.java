package controlador;

import modelo.Producto;
import dao.ProductoDAO;
import java.util.List;


public class ProductoControlador {
    ProductoDAO dao = new ProductoDAO();
    
    public List<Producto> consultarProductos(){
        return dao.consultarProductos();
    }
    
    public boolean actualizarProducto(int id, String nombre, double precio, String descripcion, int stock, boolean disponible, String tipo){
        Producto producto = new Producto(id, nombre, precio, descripcion, stock, disponible, tipo);
        return dao.actualizarProducto(producto);
    }
    
    public boolean registrarProducto(String nombre, double precio, String descripcion, int stock, boolean disponible, String tipo){
        Producto producto = new Producto(nombre, precio, descripcion, stock, disponible, tipo);
        return dao.registrarProducto(producto);
    }
}
