/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AyU;

import Model.Utilerias.Conexion;
import View.GUIS_AyU.GUILogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Autenticacion {
    
    //Atriburos
    
    private String username;
    private String contrasena;
    private int tipo;
    public static Usuario autenticado;
    
    /**
     * Constructor vacío
     */
    public Autenticacion(){}

    /**
     * Constructor autenticación
     * @param username
     * @param contrasena
     * 
     */
    public Autenticacion(String username, String contrasena, int tipo) {
        this.username = username;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }
   
    
    /**
     * Metodo que regresa el username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que guarda el username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

     /**
     * Metodo que regresa la contrasena
     * @return contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo que guarda la contrasena
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    // Falta implementación
    public Usuario autenticar() {

        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();
        
        // Declaramos instruccion para tabla Geek
        String sql = "SELECT * FROM Usuario WHERE Username = ?";
        String sqlBio = "SELECT Biografia, IDGeek FROM Geek WHERE Username = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        Usuario usr = null;
        String bio = "";
        
        try {
            
            con = SQL.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, this.username);
            rs = ps.executeQuery();
            
            if( rs.next() ) {
                
                if( this.contrasena.equals(rs.getString(6))) {
                    
                    String nombre = (rs.getString(1)); 
                    String aPaterno = (rs.getString(2));
                    String aMaterno = (rs.getString(3));
                    String correo = (rs.getString(4));
                    String contra = (rs.getString(6));
                    String user = (rs.getString(7)); 
                    int tipo = (rs.getInt(8));

                    usr = new Usuario( nombre, correo, 0, contra, user, tipo );
                    usr.setaPaterno(aPaterno);
                    usr.setaMaterno(aMaterno);
                    
                    System.out.println("Bien!");
                    this.autenticado = usr;
                    
                }
                
            }
            
            con = SQL.getConexion();
            ps = con.prepareStatement(sqlBio);
            ps.setString(1, this.username);
            rs = ps.executeQuery();
            
            if ( rs.next() ) {
                
                bio = (rs.getString(1));
                int id = (rs.getInt(4));
                GUILogin.bio = bio;
                this.autenticado.setID_User(id);
                
            }
            
        } catch (Exception e) {
            
        }
        
        return usr;
        
    }
    
}
