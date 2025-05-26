package modelo;

public class Persona {
    public int id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String direccion;
     
    public Persona(String nombre, String telefono, String direccion){
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    } 
    }
