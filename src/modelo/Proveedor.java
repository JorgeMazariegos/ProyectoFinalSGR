package modelo;

public class Proveedor extends Persona{
      private String nit;
      private String telefonoContacto;

    public Proveedor(int id, String nombre, String nit,  String correo, String direccion, String telefono, String telefonoContacto) {
        super(id, nombre, telefono, direccion, correo);
        this.nit = nit;
        this.telefonoContacto = telefonoContacto;
    }

    public Proveedor(String nit, String telefonoContacto, String nombre, String telefono, String direccion, String correo) {
        super(nombre, telefono, direccion, correo);
        this.nit = nit;
        this.telefonoContacto = telefonoContacto;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}