package controlador;

import java.security.NoSuchAlgorithmException;
import modelo.Empleado;
import dao.EmpleadoDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
        
        public String hashMD5(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
}
