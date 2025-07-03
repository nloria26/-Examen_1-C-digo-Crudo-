/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public abstract class Persona {
    
    protected String nombre; 
    protected String cedula;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }
    
    
    
    
    
}
