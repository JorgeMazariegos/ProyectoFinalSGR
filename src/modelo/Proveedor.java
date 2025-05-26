package modelo;

public class Proveedor extends Persona{
      private String cargo;
      private boolean estado;

    public Proveedor(String apellido, String cargo, boolean estado, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.apellido = apellido;
        this.cargo = cargo;
        this.estado = estado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }  
}