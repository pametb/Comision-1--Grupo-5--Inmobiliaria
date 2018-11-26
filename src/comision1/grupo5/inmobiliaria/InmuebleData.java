/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 
 * @author juan0
 */
public class InmuebleData {
    private Connection conect;

    public InmuebleData(Conexion conect) {
       this.conect = conect.getCon();
    }
    
    public void guardarInmueble(Inmueble inmueble){
        
        try {
            String sql = "INSERT INTO inmueble (direccion, cantidad_de_ambiente, precio, disponible) VALUES (?, ?, ?, ?);";
            
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getCantidad_de_ambiente());
            ps.setDouble(3, inmueble.getPrecio());
            ps.setBoolean(4, inmueble.isDisponible());
           
            int filas = ps.executeUpdate();
            System.out.println("Filas Agregadas: "+filas);
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
public void borrarInmueble(int id){
        try {
            String sql = "DELETE FROM inmueble WHERE id_inmueble = ?:";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setInt(1, id);
            int filas =ps.executeUpdate();
            System.out.println("Filas Afectadas: "+filas);
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarInmueble(Inmueble inmueble){
        try {
            String sql = "UPDATE inmueble SET direccion = ?, cantidad_de_ambientes = ?, precio = ?, disponible = ?;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setString(1, inmueble.getDireccion());
            ps.setInt(2, inmueble.getCantidad_de_ambiente());
            ps.setDouble(3, inmueble.getPrecio());
            ps.setBoolean(4, inmueble.isDisponible());
            int filas = ps.executeUpdate();
            System.out.println("Fila Actualizada: "+filas);
            ps.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Inmueble buscarInmueble(Double costo, int cantidad_ambiente){
       Inmueble inmueble = null;
        try {
            String sql = "SELECT * FROM inmueble WHERE precio = ? AND cantidad_de_ambiente = ? ";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setDouble(1, costo);
            ResultSet resultset = ps.executeQuery();
            while(resultset.next()){
             inmueble = new Inmueble();
             inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
             inmueble.setCantidad_de_ambiente(resultset.getInt("cantidad_de_ambiente"));
             inmueble.setDireccion(resultset.getString("direccion"));
             inmueble.setPrecio(resultset.getDouble("precio"));
             inmueble.setDisponible(resultset.getBoolean("disponible"));
             inmueble.setId_persona_dueña(resultset.getInt("id_persona_dueña"));
             
             
            
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return inmueble;
    }


  public List<Inmueble> obtenerInmueble(){
        List<Inmueble> inmuebles= new ArrayList<>();
      try {
            
            String sql = "SELECT * FROM inmueble;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ResultSet resultset = ps.executeQuery();
            Inmueble inmueble;
            while(resultset.next()){
              inmueble = new Inmueble();
              inmueble.setId_inmueble(resultset.getInt("id_inmueble"));
              inmueble.setDireccion(resultset.getString("direccion"));
              inmueble.setCantidad_de_ambiente(resultset.getInt("cantidad_de_ambiente"));
              inmueble.setPrecio(resultset.getInt("precio"));
              inmueble.setDisponible(resultset.getBoolean("disponible"));
              inmueble.setId_persona_dueña(resultset.getInt("id_persona_dueña"));
              inmuebles.add(inmueble);
            }
           ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
   return inmuebles;
  }
}
