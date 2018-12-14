/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria.clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
     private Conexion conectar;

    public AlquilerData(Conexion conectar) {
        conect = conectar.getCon();
        this.conectar= conectar;
    }
    public void guardarAlquiler(Alquiler Alquiler){
        try {
            String sql = "INSERT INTO alquiler (precio,fecha_inicio,fechafin,id_persona,id_inmueble) VALUES (?, ?, ?,?,?);";
            PreparedStatement ps = conect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, Alquiler.getPrecio());
            ps.setDate(2, Date.valueOf(Alquiler.getFechaDeInicio()));
            ps.setDate(3, Date.valueOf(Alquiler.getFinDeContrato()));
             ps.setInt(4, Alquiler.getPersona().getId_persona() );
             ps.setInt(5, Alquiler.getInmueble().getId_inmueble());
           
            
            int filas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                Alquiler.setId_Alquiler(rs.getInt(1));}
           
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
       
    
       public List<Alquiler> obtenerAlquileres(){
        List<Alquiler> alquileres = new ArrayList<>();
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
        try {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement statement = conect.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_Alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFechaDeInicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setFinDeContrato(resultSet.getDate("fechaFin").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
                alquileres.add(alquiler);
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Erroe al obtener la lista " + ex.getMessage());
}
         
        return alquileres;
     
     
       }
       public Alquiler obtenerAlquiler(int id)throws SQLException{
        
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
       
            String sql = "SELECT * FROM alquiler WHERE id_alquiler=?;";
            PreparedStatement statement = conect.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler=null;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_Alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFechaDeInicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setFinDeContrato(resultSet.getDate("fechaFin").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
               
                
            }      
            statement.close();
 
         
        return alquiler;
     
     }
        public Alquiler obtenerAlquilerXFechaInicio(LocalDate id)throws SQLException{
        
            InmuebleData InD= new InmuebleData(conectar);
PersonaData pd = new PersonaData(conectar);
       
            String sql = "SELECT * FROM alquiler WHERE fecha_inicio=?;";
            PreparedStatement statement = conect.prepareStatement(sql);
            statement.setDate(1, Date.valueOf(id));
            ResultSet resultSet = statement.executeQuery();
            Alquiler alquiler=null;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setId_Alquiler(resultSet.getInt("id_alquiler"));
                alquiler.setPrecio(resultSet.getDouble("precio"));
                alquiler.setFechaDeInicio(resultSet.getDate("fecha_inicio").toLocalDate());
                alquiler.setFinDeContrato(resultSet.getDate("fechaFin").toLocalDate());
                int idBuscar=resultSet.getInt("id_persona");
                 Persona p = pd.obtenerPersona(idBuscar);
                alquiler.setPersona(p);
                int idBuscarIn=resultSet.getInt("id_inmueble");
                Inmueble in= InD.obtenerInmueble(idBuscarIn);
                alquiler.setInmueble(in);
                
               
                
            }      
            statement.close();
 
         
        return alquiler;
     
     }
}
