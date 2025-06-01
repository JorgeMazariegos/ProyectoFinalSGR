package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Proveedor;

public class ProveedorDAO {
    private final Conexion conexion = new Conexion();
    Connection cn;
    ResultSet r;
    PreparedStatement ps;
    String query = "";
    
    
    public List<Proveedor> consultarProveedores(){
        List<Proveedor> listaProductos = new ArrayList<>();
        Proveedor proveedor;
        query = "SELECT * FROM proveedores";
  
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            r = ps.executeQuery();
               
            while(r.next()) {
                proveedor = new Proveedor(r.getInt("id"), r.getString("nombre"), r.getString("nit"), r.getString("contacto"), r.getString("direccion"), r.getString("telefono_empresa"), r.getString("telefono_contacto"));
                listaProductos.add(proveedor);
            }
        
            r.close();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
                
        }
        return listaProductos;
    }
    
    public boolean registrarProveedor(Proveedor proveedor) {
    query = "INSERT INTO proveedores (nombre, nit, contacto, direccion, telefono_empresa, telefono_contacto) VALUES (?, ?, ?, ?, ?, ?)";
    boolean seAgregoRegistro = false;

    try {
        cn = conexion.getConnection();
        ps = cn.prepareStatement(query);

        ps.setString(1, proveedor.getNombre());
        ps.setString(2, proveedor.getNit());
        ps.setString(3, proveedor.getCorreo());
        ps.setString(4, proveedor.getDireccion());
        ps.setString(5, proveedor.getTelefono());
        ps.setString(6, proveedor.getTelefonoContacto());

        int contador = ps.executeUpdate();
        
        if(contador==1){
            seAgregoRegistro = true;
        }
        
        ps.close();
        cn.close();

    } catch (SQLException e) {
        System.out.println("Error al registrar proveedor: " + e.getMessage());
    }
    return seAgregoRegistro;
}
    public boolean actualizarProveedor(Proveedor proveedor) {
    query = "UPDATE proveedores SET nombre = ?, nit = ?, contacto = ?, direccion = ?, telefono_empresa = ?, telefono_contacto = ? WHERE id = ?";
    int update = 0;

    try {
        cn = conexion.getConnection();
        ps = cn.prepareStatement(query);

        ps.setString(1, proveedor.getNombre());
        ps.setString(2, proveedor.getNit());
        ps.setString(3, proveedor.getCorreo());
        ps.setString(4, proveedor.getDireccion());
        ps.setString(5, proveedor.getTelefono());
        ps.setString(6, proveedor.getTelefonoContacto());
        ps.setInt(7, proveedor.getId());

        update = ps.executeUpdate();

        ps.close();
        cn.close();

    } catch (SQLException e) {
        System.out.println("Error al actualizar proveedor: " + e.getMessage());
    }

    return update == 1;
}
}
