package controlador;

import modelo.Cliente;
import dao.ClienteDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ClienteControlador {
    private final ClienteDAO dao = new ClienteDAO();
    
    public int loginCliente(String user, String pass)throws NoSuchAlgorithmException{
        if(dao.comprobarCorreo(user)==false){
            return 1;
        } 
        if(dao.comprobarClave(user, hashMD5(pass))==false){
            return 2;
            }
        return 3;
    }
    
    public boolean registrarCliente(String correo, String password, String nombre, String telefono, String direccion) throws NoSuchAlgorithmException{
        Cliente cliente = new Cliente(correo, hashMD5(password), nombre, telefono, direccion);
        return dao.registrarCliente(cliente);
    }    
    
    public boolean comprobarCorreo(String correo){
        return dao.comprobarCorreo(correo);
    }
    
    public String hashMD5(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
}
