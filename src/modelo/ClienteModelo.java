package modelo;

public class ClienteModelo extends Persona{
    private String correo;
    private String password;

    public ClienteModelo(String correo, String password, int id, String Nombre, int Telefono, String Direccion) {
        super(id, Nombre, Telefono, Direccion);
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
}