/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.clases;

/**
 *
 * @author usuario
 */
public class Inmueble {
  private String direccion;
    private int Cantidad_de_ambiente;
    private double precio;
    private boolean disponible;
     private int id_inmueble;
    private Persona persona;

    @Override
    public String toString() {
        return id_inmueble+" "+direccion+" "+precio; //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

  public Inmueble(){}
   
    

    public Inmueble(String direccion, int cantDeAmb, double precio, boolean disponible,int id_inmueble,Persona persona ) {
        this.persona=persona;
        this.direccion = direccion;
        this.Cantidad_de_ambiente = cantDeAmb;
        this.precio = precio;
        this.disponible = disponible;
        this.id_inmueble = id_inmueble;
    }

    public Inmueble(String direccion, int cantDeAmb, double precio, boolean disponible,Persona persona) {
       this.persona=persona;
        this.id_inmueble = -1;
        this.direccion = direccion;
        this.Cantidad_de_ambiente = cantDeAmb;
        this.precio = precio;
        this.disponible = disponible;
        
        
    }

    public int getCantidad_de_ambiente() {
        return Cantidad_de_ambiente;
    }

    public void setCantidad_de_ambiente(int Cantidad_de_ambiente) {
        this.Cantidad_de_ambiente = Cantidad_de_ambiente;
    }
    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
   
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    

    public double getPrecio() {
        return precio;
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
