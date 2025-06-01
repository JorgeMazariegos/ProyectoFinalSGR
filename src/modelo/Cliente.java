package modelo;

public class Cliente extends Persona{
    String nit;
    
    public Cliente(String correo, String password, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion, correo, password);
    }

    public Cliente(String nit, int id, String nombre, String telefono, String direccion, String correo, String password) {
        super(id, nombre, telefono, direccion, correo);
        this.nit = nit;
        this.password = password;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
}