/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tobia
 */
public class PersonaData {
    private Connection conect;

    public PersonaData(Conexion conectar) {
        conect = conectar.getCon();
    }
    
    public void guardarPersona(Persona persona){
        try {
            String sql = "INSERT INTO persona (nombre, dni, celular) VALUES (?, ?, ?);";
            PreparedStatement ps = conect.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getdni());
            ps.setInt(3, persona.getCelular());
            int filas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                persona.setId_persona(rs.getInt(1));}
            System.out.println("Filas Agregadas: "+filas);
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void borrarPersona(int id){
        try {
            String sql = "DELETE FROM persona WHERE id_persona = ?;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            
            System.out.println("Filas Borradas: "+ filas);
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void actualizarPersona(Persona persona){
        try {
            String sql = "UPDATE persona SET nombre = ?, dni = ?, celular = ? ;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getdni());
            ps.setInt(3, persona.getCelular());
            
            ps.executeUpdate();
             
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public Persona buscarPersona(String nombre){
       Persona persona= null; 
       try {
            String sql = "SELECT * FROM persona WHERE nombre LIKE ?;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultset = ps.executeQuery();
             while(resultset.next()){
                persona = new Persona();
                persona.setId_persona(resultset.getInt("id_persona"));
                persona.setNombre(resultset.getString("nombre"));
                persona.setDni(resultset.getInt("dni"));
                persona.setCelular(resultset.getInt("celular"));
                
             }
             ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return persona;
   } 
     public List<Persona> obtenerPersona(){
        List<Persona> personas = new ArrayList<Persona>();
            

        try {
            String sql = "SELECT * FROM persona;";
            PreparedStatement statement = conect.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Persona persona;
            while(resultSet.next()){
                persona = new Persona();
                persona.setId_persona(resultSet.getInt("id_persona"));
                persona.setNombre(resultSet.getString("nombre"));
                persona.setDni(resultSet.getInt("dni"));
                persona.setCelular(resultSet.getInt("celular"));

                personas.add(persona);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la perona: " + ex.getMessage());
}
        return personas;
     
     } 
     public Persona obtenerPersona(int id) throws SQLException{
          Persona persona=null;
          String sql = "SELECT * FROM persona WHERE id_persona =?;";

            PreparedStatement statement = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           statement.setInt(1, id);
            ResultSet resultset= statement.executeQuery();
           
           while (resultset.next()){
           persona = new Persona ();
          
                persona.setId_persona(resultset.getInt("id_persona"));
                persona.setNombre(resultset.getString("nombre"));
                persona.setDni(resultset.getInt("dni"));
                persona.setCelular(resultset.getInt("celular"));


           }
            statement.close();
            return persona;
        }
        
     }
     

