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
public class Comision1Grupo5Inmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona1 = new Persona("juan", 74415, 5454);
       Conexion conexion= new Conexion();
       Inmueble inmueble1 = new Inmueble("BARRIO 130", 5, 3.550, true);
       
       InmuebleData inmuebledata = new InmuebleData(conexion);
       inmuebledata.guardarInmueble(inmueble1);
      
       
    }
    
}
