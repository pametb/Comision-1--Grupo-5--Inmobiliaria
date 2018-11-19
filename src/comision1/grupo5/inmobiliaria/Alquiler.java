/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Alquiler {
        private LocalDate fechaDeInicio;
    private double costo;
    private LocalDate finDeContrato;
    private int id_Alquiler;

    public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato, int id_Alquiler) {
        this.fechaDeInicio = fechaDeInicio;
        this.costo = costo;
        this.finDeContrato = finDeContrato;
        this.id_Alquiler = id_Alquiler;
    }

     public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato) {
        this.fechaDeInicio = fechaDeInicio;
        this.costo = costo;
        this.finDeContrato = finDeContrato;
        
    }
    
    
    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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
}
   // realice un cambio en Alquiler, soy tobias.

