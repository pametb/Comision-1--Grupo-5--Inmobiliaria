/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Alquiler {
   private int id_Alquiler;
   private Date fechaInicio;
   private Date fechaFin;
   private double costo;
   private Persona inquilina;   
   private Inmueble propiedad;

    public Alquiler(Date fechaInicio, Date fechaFin, double costo, Persona inquilina, Inmueble propiedad) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.inquilina = inquilina;
        this.propiedad = propiedad;
    }

    public Alquiler(int id_Alquiler, Date fechaInicio, Date fechaFin, double costo, Persona inquilina, Inmueble propiedad) {
        this.id_Alquiler = id_Alquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.inquilina = inquilina;
        this.propiedad = propiedad;
    }

    public int getId_Alquiler() {
        return id_Alquiler;
    }

    public void setId_Alquiler(int id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Persona getInquilina() {
        return inquilina;
    }

    public void setInquilina(Persona inquilina) {
        this.inquilina = inquilina;
    }

    public Inmueble getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Inmueble propiedad) {
        this.propiedad = propiedad;
    }
   
   
   
}
