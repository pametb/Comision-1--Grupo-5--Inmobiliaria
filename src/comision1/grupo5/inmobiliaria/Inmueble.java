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
  private String direccion;
    private int cantDeAmb;
    private double costo;
    private boolean disponible;
    private int id_inmueble;
    private int id_Persona_dueña;

    public Inmueble(String direccion, int cantDeAmb, double costo, boolean disponible, int id_inmueble) {
        this.direccion = direccion;
        this.cantDeAmb = cantDeAmb;
        this.costo = costo;
        this.disponible = disponible;
        this.id_inmueble = id_inmueble;
    }

    public Inmueble(String direccion, int cantDeAmb, double costo, boolean disponible) {
        this.direccion = direccion;
        this.cantDeAmb = cantDeAmb;
        this.costo = costo;
        this.disponible = disponible;
        
    }
    
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantDeAmb() {
        return cantDeAmb;
    }

    public void setCantDeAmb(int cantDeAmb) {
        this.cantDeAmb = cantDeAmb;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
