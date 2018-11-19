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
public class Persona {
   private String nombreCompleto;
   private int dni;
   private String celular;
   private int id_Persona;

    public Persona(String nombreCompleto, int dni, String celular) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
    }

    public Persona(String nombreCompleto, int dni, String celular, int id_Persona) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
        this.id_Persona = id_Persona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id_Persona;
    }

    public void setId(int id) {
        this.id_Persona = id;
    }
   
   
}
