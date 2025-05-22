package controlador;

import modelo.Producto;
import dao.ProductoDAO;
import java.util.List;


public class ProductoControlador {
    ProductoDAO dao = new ProductoDAO();
    
    public List<Producto> consultarProductos(){
        return dao.consultarProductos();
    }
}
