/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.Clases;

/**
 *
 * @author usuario
 */
public class Inmueble {
  private String direccion;
    private int cantidad_de_ambiente;
    private double precio;
    private boolean disponible;
    private int id_inmueble;
    private Persona persona;
    

    public Inmueble(String direccion, int cantidad_de_ambiente, double costo, boolean disponible, int id_inmueble, Persona persona) {
        this.direccion = direccion;
        this.cantidad_de_ambiente = cantidad_de_ambiente;
        this.precio = costo;
        this.disponible = disponible;
        this.id_inmueble = id_inmueble;
        this.persona =  persona;
    }

    public Inmueble(String direccion, int cantidad_de_ambiente, double costo, boolean disponible ) {
        this.direccion = direccion;
        this.cantidad_de_ambiente = cantidad_de_ambiente;
        this.precio = costo;
        this.disponible = disponible;
        
    }

    Inmueble() {
        
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public Persona getPersona() {
        return persona;
    }
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad_de_ambiente() {
        return cantidad_de_ambiente;
    }

    public void setCantidad_de_ambiente(int cantDeAmb) {
        this.cantidad_de_ambiente = cantDeAmb;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
