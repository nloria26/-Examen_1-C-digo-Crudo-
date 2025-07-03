/*  //La clase persona le hereda los atributos y get a Residente.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public class Residente extends Persona{
    
    public String fechanacimiento;
    protected String correo;
    protected String telefono;

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    


    public Residente(String fechanacimiento, String correo, String telefono, String nombre, String cedula) {
        super(nombre, cedula);
        this.fechanacimiento = fechanacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Residente{" + "fechanacimiento=" + fechanacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
//----

}
