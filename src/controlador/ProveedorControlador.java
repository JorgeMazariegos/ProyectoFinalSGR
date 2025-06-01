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
    
    public boolean actualizarProveedor(int id, String nombre, String nit,  String correo, String direccion, String telefono, String telefonoContacto){
        Proveedor proveedor = new Proveedor(id, nombre, nit, correo, direccion, telefono, telefonoContacto);
        return dao.actualizarProveedor(proveedor);
    }
}
