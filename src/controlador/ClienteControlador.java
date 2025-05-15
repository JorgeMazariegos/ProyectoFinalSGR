package controlador;

import modelo.ClienteModelo;
import dao.Cliente;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ClienteControlador {
    private final Cliente dao = new Cliente();
    
    public int login(String user, String pass)throws NoSuchAlgorithmException{
        return dao.login(user,hashMD5(pass));
    }
    public boolean SaveClien(String correo, String password, int id, String Nombre, int Telefono, String Direccion)throws NoSuchAlgorithmException{
        ClienteModelo cliente = new ClienteModelo(correo,hashMD5(password),id,Nombre,Telefono,Direccion);
        return dao.SaveClien(cliente);
    }    
    
    public String hashMD5(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] message = md.digest(input.getBytes());
        
        BigInteger bigInt = new BigInteger(1, message);
        
        return bigInt.toString(16);
    }
}
