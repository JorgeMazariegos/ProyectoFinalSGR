package modelo;

public class Persona {
    private int id;
    private String Nombre;
    private int Telefono;
    private String Direccion;
     
    public Persona(int id, String Nombre, int Telefono, String Direccion){
    this.id = id;
    this.Nombre = Nombre;
    this.Telefono = Telefono;
    this.Direccion = Direccion; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    } 
    }
