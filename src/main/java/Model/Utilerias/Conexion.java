package Model.Utilerias;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thann
 */
public class Conexion {
    // si tienen problema usen en MySQL Command Line => SET GLOBAL time_zone = '-3:00'; 
    String url = "jdbc:mysql://localhost:3306/GeekMetrik"; // GeekMetrik DB
    String user = "root";
    String password = "123"; //aqui va la contrasenia de mysql
    
    Connection conexion;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // si tienen problemas usen este
            //Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(url,user,password);
        } catch (Exception e) {            
        }
        return conexion;
    }

}
