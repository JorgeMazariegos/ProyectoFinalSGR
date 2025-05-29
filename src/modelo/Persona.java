package modelo;

public class Persona {
    public int id;
    public String nombre;
    public String apellido;
    public String telefono;
    public String direccion;
    public String correo;
    public String password;
     
    public Persona(String nombre, String apellido,String telefono, String direccion, String correo, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion; 
        this.correo = correo;
        this.password = password;
    }
    
    public Persona(int id, String nombre, String apellido,String telefono, String direccion, String correo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion; 
        this.correo = correo;
    }

    public Persona( String nombre,String telefono, String direccion, String correo, String password){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion; 
        this.correo = correo;
        this.password = password;
    }
    
    public Persona(int id, String nombre,String telefono, String direccion, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion; 
        this.correo = correo;
        this.id = id;
    }

    public Persona(String nombre, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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


