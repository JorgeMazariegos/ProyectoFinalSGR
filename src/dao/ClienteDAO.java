package dao;
import conexion.Conexion;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClienteDAO {
        private final Conexion conexion = new Conexion();
        Connection cn;
        ResultSet r;
        PreparedStatement ps;
        String query = "";
        
        public boolean comprobarCorreo(String correo){
            query = "SELECT correo FROM Usuarios WHERE correo = ?";
            boolean existe = false;

            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setString(1, correo);
                r = ps.executeQuery();
                
                if (r.next()) {
                    existe = true;
                }
        
                r.close();
                ps.close();
                cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return existe;
        }

        public boolean comprobarClave(String correo, String Clave){
            query = "SELECT correo, password FROM Usuarios WHERE correo = ? AND password = ?";
            boolean existe = false;
            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setString(1, correo);
                ps.setString(2, Clave);
                r = ps.executeQuery();
                
                if (r.next()) {
                    existe = true;
                }
        
                r.close();
                ps.close();
                cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return existe;
        }
        
        public boolean registrarCliente(Cliente cliente) {
        query = "INSERT INTO Usuarios (NOMBRE,TELEFONO,CORREO,DIRECCION,PASSWORD)"+
                "VALUES (?,?,?,?,?)";
        boolean registro = false;
        try{
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getPassword());
            int contador = ps.executeUpdate();
            if(contador==1){
                registro = true;
            }
        cn.close();
        ps.close();   
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return registro;
        }
        
        public boolean actualizarCliente(Cliente cliente) {
        query = "UPDATE Usuarios SET nombre = ?, telefono = ?, correo = ?, direccion = ?, password = ? WHERE id_emp=?";

        try (Connection conn = conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getTelefono());
            stmt.setString(3, cliente.getCorreo());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(4, cliente.getPassword());
            stmt.setInt(5, cliente.getId());
            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
        }
        
        public String nombreCliente(String nit){
            query = "SELECT nombre FROM usuarios WHERE nit = ?";
            String nombre = "";
            try{
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setString(1, nit);
                r = ps.executeQuery();
                
                while(r.next()){
                    nombre = r.getString("nombre");
                }
            
                r.close();
                ps.close();
                cn.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return nombre;
        }
 /**       public boolean DeleteCliet(ClienteModelo Clien){
            
        }*/
}
