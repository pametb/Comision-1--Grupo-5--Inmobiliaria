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
public class Persona {
   private String nombre;
    private int dni;
    private int celular;
    private int id_persona;
//prueba de agregar cambios
   
    
    public Persona(String nombre, int Dni, int celular, int id_persona) {
        this.nombre= nombre;
        this.dni = Dni;
        this.celular = celular;
        this.id_persona = id_persona;
    }
    
    public Persona(String nombre, int dni, int celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
       
    }

   public  Persona() {
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public int getdni() {
        return dni;
    }

    public int getCelular() {
        return celular;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    
    
}

