/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Comision1Grupo5Inmobiliaria {

       
    public static void main(String[] args) throws SQLException {
       Conexion conexion = new Conexion();
       
  
       
            
            InmuebleData inmuebledata;
            inmuebledata = new InmuebleData(conexion);
            Persona p;
            PersonaData pd= new PersonaData(conexion);
                        Persona persona = new Persona("tobias 2", 16161,266473772);
            pd.guardarPersona(persona);
            
           ArrayList<Persona> Lista= (ArrayList<Persona>) pd.obtenerPersona();
            p=Lista.get(0);
            
            
           
            
            Inmueble In = new Inmueble("manza g casa 20", 3,2.000, true,p);
            inmuebledata.guardarInmueble(In);
   
     
            AlquilerData alquilerData;
     alquilerData = new AlquilerData(conexion);
     ArrayList<Inmueble> lista= (ArrayList<Inmueble>) inmuebledata.obtenerInmuebles();
     In=lista.get(0);
     Alquiler alquiler;
     LocalDate fechainicio= LocalDate.of(2018,12,10);
      LocalDate fechafin= LocalDate.of(2018,12,10);
        alquiler = new Alquiler(fechainicio , 3.0000, fechafin, In, p);
        alquilerData.guardarAlquiler(alquiler);
    
        
        
    }
    
    
    
}
