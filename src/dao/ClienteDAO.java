package dao;
import conexion.Conexion;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        query = "UPDATE usuarios SET nombre = ?, telefono = ?, correo = ?, direccion = ?, password = ?  nit = ? WHERE id=?";

        int actualizar = 0;
        try  {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getDireccion());
            ps.setString(4, cliente.getPassword());
            ps.setString(5, cliente.getNit());
            ps.setInt(6, cliente.getId());
            actualizar = ps.executeUpdate();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return actualizar == 1;
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
        
        public List<Cliente> consultarClientes(){
            List<Cliente> listaClientes = new ArrayList<>();
            Cliente cliente;
            query = "SELECT * FROM usuarios";
  
            try {
            cn = conexion.getConnection();
            ps = cn.prepareStatement(query);
            r = ps.executeQuery();
               
            while(r.next()) {
                String nit = r.getString("nit");
                int id = r.getInt("id");
                String nombre = r.getString("nombre");
                String telefono = r.getString("telefono");
                String direccion = r.getString("direccion");
                String correo = r.getString("correo");
                String password = r.getString("password");
                cliente = new Cliente(nit, id, nombre, telefono, direccion, correo, password);
                listaClientes.add(cliente);
            }
        
            r.close();
            ps.close();
            cn.close();

            } catch (SQLException e) {
                System.out.println("Error al leer datos: " + e.getMessage());            
            }
            return listaClientes;
        }
}
