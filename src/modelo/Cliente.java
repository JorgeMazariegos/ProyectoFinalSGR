package modelo;

public class Cliente extends Persona{
    private String correo;
    private String password;

    public Cliente(String correo, String password, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
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