/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

public class Empleado extends Persona{
    private String cargo;
    private boolean estado;
    private Date fechaIngreso;
    private double salario;

    public Empleado(int id, String cargo, boolean estado, Date fechaIngreso, double salario, String nombre, String apellido, String telefono, String direccion, String correo) {
        super(id, nombre, apellido, telefono, direccion, correo);
        this.cargo = cargo;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public Empleado(String cargo, boolean estado, Date fechaIngreso, double salario, String nombre, String apellido, String telefono, String direccion, String correo, String password) {
        super(nombre, apellido, telefono, direccion, correo, password);
        this.cargo = cargo;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public Empleado(String cargo, boolean estado, double salario, int id, String nombre, String apellido, String telefono, String direccion, String correo, String password) {
        super(id, nombre, apellido, telefono, direccion, correo);
        this.cargo = cargo;
        this.estado = estado;
        this.salario = salario;
        this.password = password;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}