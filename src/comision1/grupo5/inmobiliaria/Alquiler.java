/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;


import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Alquiler {
    private LocalDate fechaDeInicio;
    private double precio;
    private LocalDate finDeContrato;
    private int id_Alquiler;
    private int id_persona;
    private int id_inmueble;
 Alquiler (){}
    public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato, int id_Alquiler) {
        this.fechaDeInicio = fechaDeInicio;
        this.precio = costo;
        this.finDeContrato = finDeContrato;
        this.id_Alquiler = id_Alquiler;
    }

     public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato) {
        this.fechaDeInicio = fechaDeInicio;
        this.precio = costo;
        this.finDeContrato = finDeContrato;
        
    }
    
     public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
     }
     
    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFinDeContrato() {
        return finDeContrato;
    }

    public void setFinDeContrato(LocalDate finDeContrato) {
        this.finDeContrato = finDeContrato;
    }

    public int getId_Alquiler() {
        return id_Alquiler;
    }

    public void setId_Alquiler(int id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }
    
}
   // realice un cambio en Alquiler, soy tobias.

