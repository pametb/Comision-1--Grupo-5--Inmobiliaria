/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision1.grupo5.inmobiliaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author usuario
 */
public class Conexion { 
  private Connection con;
    private String url = "jdbc:mariadb://localhost/inmobiliaria";
    private String usuario = "root";
    private String contraseña = "";
    private String driver = "org.mariadb.jdbc.Driver";
    
    
   public Conexion(){
        try {
            con = null;
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, contraseña);
            if(con != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion Fallida");
            }} catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    public Connection getCon() {
        return con;
    }
    
    
}

