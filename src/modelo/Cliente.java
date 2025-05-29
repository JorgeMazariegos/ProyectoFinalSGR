package modelo;

public class Cliente extends Persona{

    public Cliente(String correo, String password, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion, correo, password);
    }
}