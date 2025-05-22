package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class EmpleadoDAO {
    private final Conexion conexion = new Conexion();
        Connection cn;
        ResultSet r;
        PreparedStatement ps;
        String query = "";
        
        public boolean comprobarCorreo(String correo){
            query = "SELECT correo FROM PUBLIC.Empleados WHERE correo = ?";
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
            query = "SELECT correo, password FROM PUBLIC.Empleados WHERE correo = ? AND password = ?";
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
}
