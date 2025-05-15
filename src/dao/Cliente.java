package dao;
import conexion.Conexion;
import modelo.ClienteModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Cliente {
        private final Conexion conexion = new Conexion();
        Connection cn;
        ResultSet r;
        PreparedStatement ps;
        String query = "";
        
        private boolean compronbarCorreo(String correo){
            query = "SELECT * FROM Usuario WHERE correo = ?";
            boolean exisCorreo = false;

            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setString(1, correo);
                r = ps.executeQuery();
                
                if (r.next()) {
                    exisCorreo = true;
                }
        
                r.close();
                ps.close();
                cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return exisCorreo;
        }

        private boolean comprobarClave(String correo, String Clave){
            query = "SELECT * FROM Usuario WHERE username = ? AND password = ?";
            boolean exisClave = false;
            try {
                cn = conexion.getConnection();
                ps = cn.prepareStatement(query);
                ps.setString(1, correo);
                ps.setString(2, Clave);
                r = ps.executeQuery();
                
                if (r.next()) {
                    exisClave = true;
                }
        
                r.close();
                ps.close();
                cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());
                
            }
            return exisClave;
        }
        
        public int login(String correo, String contra){
            if(compronbarCorreo(correo)==false){
                return 1;
            }
            if(comprobarClave(correo,contra)==false){
                return 2;
            }
            return 3;
            
        }
        
        public boolean SaveClien(ClienteModelo Clien) {
        query = "INSERT INTO PUBLIC.Usuario (NOMBRE,TELEFONO,CORREO,DIRRECION,PASSWORD) "+
                "VALUES (?,?,?,?,?)";
        boolean resp=false;
        try{
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, Clien.getNombre());
            ps.setInt(2, Clien.getTelefono());
            ps.setString(3, Clien.getCorreo());
            ps.setString(4, Clien.getDireccion());
            ps.setString(5, Clien.getPassword());
            int contador = ps.executeUpdate();
            if(contador==1){
                resp = true;
            }
        cn.close();
        ps.close();   
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return resp;
        }
        
        public boolean UpdateClien(ClienteModelo Clien) {
        query = "UPDATE Usuario SET nombre=?, TELEFONO=?, salario=?,fecha_ingreso=? WHERE id_emp=?";

        try (Connection conn = conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, Clien.getNombre());
            stmt.setInt(2, Clien.getTelefono());
            stmt.setString(3, Clien.getCorreo());
            stmt.setString(4, Clien.getDireccion());
            stmt.setString(4, Clien.getPassword());
            stmt.setInt(5, Clien.getId());
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
