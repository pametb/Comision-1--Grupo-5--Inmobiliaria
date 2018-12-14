/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.clases;


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
    private Inmueble inmueble;
    private Persona persona;
 
    public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato, int id_Alquiler) {
        this.fechaDeInicio = fechaDeInicio;
        this.precio = costo;
        this.finDeContrato = finDeContrato;
        this.id_Alquiler = id_Alquiler;
    }

     public Alquiler(LocalDate fechaDeInicio, double costo, LocalDate finDeContrato, Inmueble inmueble, Persona persona) {
       this.inmueble= inmueble;
       this.persona=persona;
         this.fechaDeInicio = fechaDeInicio;
        this.precio = costo;
        this.finDeContrato = finDeContrato;
        
    }

    public Alquiler(){
        
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

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return  fechaDeInicio+" "+precio+" "+finDeContrato+" "+id_Alquiler+" "+persona+" "+inmueble;//To change body of generated methods, choose Tools | Templates.
    }

  
    
}
   // realice un cambio en Alquiler, soy tobias.

