/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

/**
 *
 * @author usuario
 */
public class Inmueble {
   private int id_Inmueble;
   private String direccion;
   private int cantAmbientes;
   private double precio;
   private boolean disponibilidad;
   private Persona id_PersonaDueño;

    public Inmueble(int id_Inmueble, String direccion, int cantAmbientes, double precio, boolean disponibilidad, Persona id_PersonaDueño) {
        this.id_Inmueble = id_Inmueble;
        this.direccion = direccion;
        this.cantAmbientes = cantAmbientes;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.id_PersonaDueño = id_PersonaDueño;
    }

    public Inmueble(String direccion, int cantAmbientes, double precio, boolean disponibilidad, Persona id_PersonaDueño) {
        this.direccion = direccion;
        this.cantAmbientes = cantAmbientes;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.id_PersonaDueño = id_PersonaDueño;
    }

    public int getId_Inmueble() {
        return id_Inmueble;
    }

    public void setId_Inmueble(int id_Inmueble) {
        this.id_Inmueble = id_Inmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Persona getId_PersonaDueño() {
        return id_PersonaDueño;
    }

    public void setId_PersonaDueño(Persona id_PersonaDueño) {
        this.id_PersonaDueño = id_PersonaDueño;
    }
   
   
   
}
