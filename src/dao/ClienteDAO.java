package dao;
import conexion.Conexion;
import modelo.ClienteModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ClienteDAO {
        private final Conexion conexion = new Conexion();
        Connection cn;
        ResultSet r;
        PreparedStatement ps;
        String query = "";
        
        private boolean comprobarCorreo(String correo){
            query = "SELECT * FROM Usuario WHERE correo = ?";
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

        private boolean comprobarClave(String correo, String Clave){
            query = "SELECT * FROM Usuario WHERE correo = ? AND password = ?";
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
        
        public int loginCliente(String correo, String contra){
            if(comprobarCorreo(correo)==false){
                return 1;
            }
            if(comprobarClave(correo,contra)==false){
                return 2;
            }
            return 3;
            
        }
        
        public boolean registrarCliente(ClienteModelo cliente) {
        query = "INSERT INTO Usuarios (NOMBRE,TELEFONO,CORREO,DIRRECION,PASSWORD) "+
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
        
        public boolean actualizarCliente(ClienteModelo cliente) {
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
 /**       public boolean DeleteCliet(ClienteModelo Clien){
            
        }*/
}
