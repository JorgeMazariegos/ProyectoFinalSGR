package controlador;

import modelo.Empleado;
import dao.EmpleadoDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

public class EmpleadoControlador {
     private final EmpleadoDAO dao = new EmpleadoDAO();
    
        public int loginEmpleado(String user, String pass)throws NoSuchAlgorithmException{
        if(dao.comprobarCorreo(user)==false){
            return 1;
        } 
        if(dao.comprobarClave(user, hashMD5(pass))==false){
            return 2;
            }
        return 3;
    }
        
        public List<Empleado> consultarEmpleados(){
            return dao.consultarEmpleados();
        }
        
        public String hashMD5(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
        
        public boolean registrarEmpleado(String cargo, boolean estado, Date fechaIngreso, double salario, String nombre, String apellido, String telefono, String direccion, String correo, String password) throws NoSuchAlgorithmException{
            Empleado empleado = new Empleado(cargo, estado, fechaIngreso, salario, nombre, apellido, telefono, direccion, correo, hashMD5(password));
            return dao.registrarEmpleado(empleado);
        }
        
        public boolean actualizarEmpleado(String cargo, boolean estado, double salario, int id, String nombre, String apellido, String telefono, String direccion, String correo, String password) throws NoSuchAlgorithmException{
            Empleado empleado = new Empleado(cargo, estado, salario, id, nombre, apellido, telefono, direccion, correo, hashMD5(password));
            return dao.actualizarEmpleado(empleado);
        }
}
