/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Empleado extends Persona{
    private String cargo;
    private String estado;

    public Empleado(String cargo, String estado, int id, String Nombre, int Telefono, String Direccion) {
        super(id, Nombre, Telefono, Direccion);
        this.cargo = cargo;
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
}