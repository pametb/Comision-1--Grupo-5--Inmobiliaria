/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.Clases;


import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Alquiler {
    private LocalDate fechaDeInicio;
    private double precio;
    private LocalDate fechaFin;
    private int id_Alquiler;
    private Persona persona;
    private Inmueble inmueble;

    public Alquiler(LocalDate fechaDeInicio, double precio, LocalDate fechaFin, int id_Alquiler, Persona persona, Inmueble inmueble) {
        this.fechaDeInicio = fechaDeInicio;
        this.precio = precio;
        this.fechaFin = fechaFin;
        this.id_Alquiler = id_Alquiler;
        this.persona = persona;
        this.inmueble = inmueble;
    }
    
    
    public Alquiler(LocalDate fechaDeInicio, double precio, LocalDate fechaFin, Persona persona, Inmueble inmueble) {
        this.fechaDeInicio = fechaDeInicio;
        this.precio = precio;
        this.fechaFin = fechaFin;
        this.persona = persona;
        this.inmueble = inmueble;
    }

    Alquiler() {
        
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setId_Alquiler(int id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getId_Alquiler() {
        return id_Alquiler;
    }

    public Persona getPersona() {
        return persona;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }


}
