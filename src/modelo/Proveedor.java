package modelo;

public class Proveedor extends Persona{
      private String apellido;
      private String cargo;
      private boolean estado;

    public Proveedor(String apellido, String cargo, boolean estado, int id, String Nombre, int Telefono, String Direccion) {
        super(id, Nombre, Telefono, Direccion);
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