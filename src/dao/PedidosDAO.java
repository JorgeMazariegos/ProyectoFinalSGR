package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pedido;

public class PedidosDAO {
    private final Conexion conexion = new Conexion();
        Connection cn;
        ResultSet r;
        PreparedStatement ps;
        String query = "";
        
        public List<Pedido> consultarPedido(){
            List<Pedido> listaPedido = new ArrayList<>();
            query = "SELECT * FROM pedidos";

            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                r = ps.executeQuery();
                
                while(r.next()) {
                    Pedido pedido = new Pedido(r.getInt("numeroPedido") ,r.getString("nombreCliente"), r.getString("nitCliente"), r.getDouble("totalGastado"),  r.getString("producto"), r.getInt("cantidad"), r.getFloat("descuento"), r.getBoolean("estado"), r.getDouble("precioU"));
                    listaPedido.add(pedido);
                }
        
                r.close();
                ps.close();
                cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return listaPedido;
        }
        
        public int registrarPedido(Pedido pedido){
            query = "INSERT INTO pedidos (numeroPedido, nombreCliente, nitCliente, totalGastado, producto, cantidad, descuento, estado, precioU)" +
                    "values (?,?,?,?,?,?,?,?,?)";
            int seAgregoRegistro = 0;
            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setInt(1, pedido.getNumPedido());
                ps.setString(2, pedido.getNombreCliente());
                ps.setString(3, pedido.getNitCliente());
                ps.setDouble(4, pedido.getTotalGastado());
                ps.setString(5, pedido.getProductos());
                ps.setInt(6, pedido.getCantidad());
                ps.setFloat(7, pedido.getDescuento());
                ps.setBoolean(8, true);
                ps.setDouble(9, pedido.getPrecioUnitario());
                seAgregoRegistro = ps.executeUpdate();
                
                r.close();
                ps.close();
                cn.close();
                
                
            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return seAgregoRegistro;
        }
        
        public int actualizarPedido(Pedido pedido){
        query = "UPDATE pedidos SET nombrecliente = ?, nitcliente = ?, totalgastado = ?, cantidad = ?, descuento = ?, estado = ? " +
                "WHERE producto = ? and numeroPedido = ?";
        int update = 0;
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, pedido.getNombreCliente());
            ps.setString(2, pedido.getNitCliente());
            ps.setDouble(3, pedido.getTotalGastado());
            ps.setInt(4, pedido.getCantidad());
            ps.setFloat(5, pedido.getDescuento());
            ps.setBoolean(6, true);
            ps.setString(7, pedido.getProductos());
            ps.setInt(8, pedido.getNumPedido());
            update = ps.executeUpdate();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return update;     
        }
}
