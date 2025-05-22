package dao;

import conexion.Conexion;
import modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private final Conexion conexion = new Conexion();
    Connection cn;
    ResultSet r;
    PreparedStatement ps;
    String query = "";
    
    public List<Producto> consultarProductos(){
        List<Producto> listaProductos = new ArrayList<>();
        Producto producto;
        query = "SELECT * FROM productos";
  
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            r = ps.executeQuery();
               
            while(r.next()) {
                producto = new Producto(r.getString("nombre"), r.getDouble("precio"), r.getString("descripcion"), r.getInt("stock"), r.getBoolean("disponible"));
                listaProductos.add(producto);
            }
        
            r.close();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
                
        }
        return listaProductos;
    }
}
