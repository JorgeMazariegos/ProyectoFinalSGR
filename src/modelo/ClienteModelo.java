package modelo;

public class ClienteModelo extends Persona{
    private String correo;
    private String password;

    public ClienteModelo(String correo, String password, int id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono, direccion);
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