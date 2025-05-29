package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;



public class EmpleadoDAO {
    private final Conexion conexion = new Conexion();
    Connection cn;
    ResultSet r;
    PreparedStatement ps;
    String query = "";
        
    public boolean comprobarCorreo(String correo){
        query = "SELECT email FROM empleados WHERE email = ?";
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
        query = "SELECT email, password FROM empleados WHERE email = ? AND password = ?";
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
    
    public List<Empleado> consultarEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList<>();
        Empleado empleado;
        query = "SELECT * FROM empleados";
  
        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            r = ps.executeQuery();
               
            while(r.next()) {
                empleado = new Empleado(r.getInt("id") ,r.getString("cargo"), r.getBoolean("estado"), r.getDate("fechaingreso"), r.getDouble("salario"), r.getString("nombre"), r.getString("apellido"),  r.getString("telefono"), r.getString("direccion"), r.getString("email"));
                listaEmpleados.add(empleado);
            }
        
            r.close();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
                
        }
        return listaEmpleados;
    }
    
    public boolean registrarEmpleado(Empleado empleado) {
        query = "INSERT INTO empleados (NOMBRE, APELLIDO, CARGO, ESTADO, FECHAINGRESO, SALARIO, TELEFONO, DIRECCION, EMAIL, PASSWORD) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean registro = false;

        try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getCargo());
            ps.setBoolean(4, empleado.isEstado());
            ps.setDate(5, new java.sql.Date(empleado.getFechaIngreso().getTime()));
            ps.setDouble(6, empleado.getSalario());
            ps.setString(7, empleado.getTelefono());
            ps.setString(8, empleado.getDireccion());
            ps.setString(9, empleado.getCorreo());
            ps.setString(10, empleado.getPassword());

            int contador = ps.executeUpdate();
            if (contador == 1) {
                registro = true;
            }

            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return registro;
    }
    
    public boolean actualizarEmpleado(Empleado empleado) {
        query = "UPDATE empleados SET NOMBRE = ?, APELLIDO = ?, CARGO = ?, ESTADO = ?, " +
                "SALARIO = ?, TELEFONO = ?, DIRECCION = ?, EMAIL = ?, PASSWORD = ? WHERE ID = ?";
        boolean actualizado = false;

        try {
            Connection cn = conexion.getConnection();
            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido());
            ps.setString(3, empleado.getCargo());
            ps.setBoolean(4, empleado.isEstado());
            ps.setDouble(5, empleado.getSalario());
            ps.setString(6, empleado.getTelefono());
            ps.setString(7, empleado.getDireccion());
            ps.setString(8, empleado.getCorreo());
            ps.setString(9, empleado.getPassword());
            ps.setInt(10, empleado.getId());

            int contador = ps.executeUpdate();
            if (contador == 1) {
                actualizado = true;
            }

            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar empleado: " + e.getMessage());
        }

        return actualizado;
    }
}
