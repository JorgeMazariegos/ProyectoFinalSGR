package controlador;

public class mainControlador {
    
    public int comprobarCorreo(String correo){
        if(comprobarCliente(correo))
            return 1;
        if(comprobarMesero(correo))
            return 2;
        if(comprobarCajero(correo))
            return 3;
        if(comprobarAdministrador(correo))
            return 4;
        return 5;
}
    
    public boolean comprobarCliente(String correo){
        String[] correos = {"gmail.com", "hotmail.com", "yahoo.com", "icloud.com"};
        
        String[] cSeparar =  correo.split("@");
      
        for(String c : correos){
            if(cSeparar[1].equals(c)){
                return true;
            }
        }
        return false;
    }
    
    public boolean comprobarCajero(String correo){
        String correoCorrecto = "cash.company.com";
        
        String[] cSeparar =  correo.split("@");      
       
        return cSeparar[1].equals(correoCorrecto);
    }
    
    public boolean comprobarMesero(String correo){
        String correoCorrecto = "mes.company.com";
        
        String[] cSeparar =  correo.split("@");      
       
        return cSeparar[1].equals(correoCorrecto);
    }
    
    public boolean comprobarAdministrador(String correo){
        String correoCorrecto = "admin.company.com";
        
        String[] cSeparar =  correo.split("@");      
       
        return cSeparar[1].equals(correoCorrecto);
    }
}
