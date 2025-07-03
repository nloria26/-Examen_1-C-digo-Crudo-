/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Daniel
 */
public class Guardia {
    private String cedula;
    private String nombre;
    private String turno;
    private String zona_asignada;

    public Guardia(String cedula, String nombre, String turno, String zonas_asignada, String Día, String Tarde, String Noche, String Ingreso_Principal, String Sotano, String Torre, String Torre_Norte) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.turno = Día;
        this.turno = Tarde;
        this.turno = Noche;
        this.zona_asignada = Ingreso_Principal;
        this.zona_asignada = Sotano;
        this.zona_asignada = Torre_Norte;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setZona_asignada(String zona_asignada) {
        this.zona_asignada = zona_asignada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTurno() {
        return turno;
    }

    public String getZona_asignada() {
        return zona_asignada;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", turno=" + turno + ", zona_asignada=" + zona_asignada +'}';
    }

   //en esta clase esta listo todo?
    // no se que mas hacer D:

}
