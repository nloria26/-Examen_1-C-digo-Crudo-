
package Accesos;

import java.time.LocalDate;
import java.time.LocalTime;


public class Acceso extends Residente{
    private int id;
    private Residente residentes;
    private LocalDate Fecha;
    private LocalTime Hora;
    
    private Boolean Acceso;
    private String TipoAcceso;
    private Boolean Autorizacion;

    public int getId() {
        return id;
    }

    public Residente getResidentes() {
        return residentes;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public LocalTime getHora() {
        return Hora;
    }

    public String getTipoAcceso() {
       
        return TipoAcceso;
    }

    public Boolean getAcceso() {
        return Acceso;
    }
    
    public String getAutorizacion(Acceso Boolean) {
        if (this.Acceso == true )
             return "Acceso autorizado" ;
        else  
            return "Acceso denegado";
    }

    public Acceso(int id, Residente residentes, LocalDate Fecha, LocalTime Hora, String TipoAcceso, Boolean Autorizacion) {
        this.id = id;
        this.residentes = residentes;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.TipoAcceso = TipoAcceso;
        this.Autorizacion = Autorizacion;
    }
    
    

 
}
