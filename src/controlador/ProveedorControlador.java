package controlador;

import modelo.Proveedor;
import dao.ProveedorDAO;
import java.util.List;

public class ProveedorControlador {
    ProveedorDAO dao = new ProveedorDAO();
    
     public List<Proveedor> consultarProveedores(){
        return dao.consultarProveedores();
    }
     
    public boolean registrarProveedor(String nit, String telefonoContacto, String nombre, String telefono, String direccion, String correo){
        Proveedor proveedor = new Proveedor(nit, telefonoContacto, nombre, telefono, direccion, correo);
        return dao.registrarProveedor(proveedor);
    }
}
