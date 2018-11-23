/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.Global.setDate;

/**
 *
 * @author tobia
 */
public class AlquilerData {
     private Connection conect;
     

    public AlquilerData(Conexion conectar) {
        conect = conectar.getCon();
    }
    public void guardarAlquiler(Alquiler Alquiler){
        try {
            String sql = "INSERT INTO alquiler (precio,fecha_inicio,fechafin) VALUES (?, ?, ?);";
            PreparedStatement ps = conect.prepareStatement(sql);
            
            ps.setDouble(1, Alquiler.getPrecio());
            ps.setDate(2, Date.valueOf(Alquiler.getFechaDeInicio()));
            ps.setDate(3, Date.valueOf(Alquiler.getFinDeContrato()));
            
            int filas = ps.executeUpdate();
            
            System.out.println("alquiler guardado: "+filas);
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarAlquiler(int id) {
      try {
        String sql = "DELETE FROM alquiler WHERE id_alquiler = ?;";
        PreparedStatement ps = conect.prepareStatement(sql);
        ps.setInt(1, id);
        int filas = ps.executeUpdate();
        System.out.println("Filas Afectadas: "+filas);
            
            ps.close();
         } catch (SQLException ex) {
             Logger.getLogger(AlquilerData.class.getName()).log(Level.SEVERE, null, ex);
         }}
     public void actualizarAlquiler(Alquiler alquiler){
        try {
            String sql = "UPDATE alquiler SET precio = ?, fecha_inicio = ?, fechaFin = ?;";
            PreparedStatement ps = conect.prepareStatement(sql);
            ps.setDouble(1, alquiler.getPrecio());
            ps.setDate(2, Date.valueOf(alquiler.getFechaDeInicio()));
            ps.setDate(3, Date.valueOf(alquiler.getFinDeContrato()));
            
            
           int filas =  ps.executeUpdate();
            System.out.print("Filas Actualizadas: "+filas);
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    
       public List<Alquiler> obtenerAlquiler(){
        List<Alquiler> alquileres = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement statement = conect.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_persona(resultSet.getInt("id_perosna"));
                alquiler.setId_Alquiler(resultSet.getInt("id_alquiler"));
               alquiler.setId_inmueble(resultSet.getInt("id_inmueble"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFechaDeInicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setFinDeContrato(resultSet.getDate("fechaFin").toLocalDate());

                alquileres.add(alquiler);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Erroe al obtener la lista " + ex.getMessage());
}
         
        return alquileres;
     
     }
}
