package controlador;

import modelo.ClienteModelo;
import dao.ClienteDAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ClienteControlador {
    private final ClienteDAO dao = new ClienteDAO();
    
    public int loginCliente(String user, String pass)throws NoSuchAlgorithmException{
        return dao.loginCliente(user,hashMD5(pass));
    }
    public boolean registrarCliente(String correo, String password, int id, String nombre, String telefono, String direccion) throws NoSuchAlgorithmException{
        ClienteModelo cliente = new ClienteModelo(correo, hashMD5(password), id, nombre, telefono, direccion);
        return dao.registrarCliente(cliente);
    }    
    
    public String hashMD5(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
}
