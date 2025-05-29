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
                producto = new Producto(r.getInt("id"), r.getString("nombre"), r.getDouble("precio"), r.getString("descripcion"), r.getInt("stock"), r.getBoolean("disponible"), r.getString("tipo"));
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
    
    public boolean actualizarProducto(Producto producto){
        query = "UPDATE productos SET NOMBRE = ?, TIPO = ?, PRECIO = ?, STOCK = ?, DESCRIPCION = ?, DISPONIBLE = ? WHERE ID = ?";
        boolean actualizado = false;

        try {
            Connection cn = conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getTipo());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setString(5, producto.getDescripcion());
            ps.setBoolean(6, producto.isDisponible());
            ps.setInt(7, producto.getId());

            int contador = ps.executeUpdate();
            if (contador == 1) {
                actualizado = true;
            }

            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
        }

        return actualizado;
    }
    
    public boolean registrarProducto(Producto producto) {
        query = "INSERT INTO productos (NOMBRE, TIPO, PRECIO, STOCK, DESCRIPCION, DISPONIBLE) VALUES (?, ?, ?, ?, ?, ?)";
        boolean registro = false;
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getTipo());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setString(5, producto.getDescripcion());
            ps.setBoolean(6, producto.isDisponible());

            int contador = ps.executeUpdate();
            if (contador == 1) {
                registro = true;
            }

            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar producto: " + e.getMessage());
        }
        return registro;
    }
}
