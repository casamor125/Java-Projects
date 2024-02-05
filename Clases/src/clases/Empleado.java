/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author bielc
 */
public class Empleado {
    int id;
    int Salario;
    String Nombre;
    String apellido;

    public Empleado() {
    }

    public Empleado(int id, int Salario, String Nombre, String apellido) {
        this.id = id;
        this.Salario = Salario;
        this.Nombre = Nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public int getSalario() {
        return Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int IncrementarSalario(int porcentaje){
        int nuevoSalario = Salario*(porcentaje/100);
        this.Salario = nuevoSalario;
        return this.Salario;
    
    }
}
