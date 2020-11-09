/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AyU;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Autenticacion {
    
    //Atriburos
    
    private String username;
    private String contrasena;
    
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
    public Autenticacion(String username, String contrasena) {
        this.username = username;
        this.contrasena = contrasena;
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
    
    /**
     *
     * @param ListadeUsuarios
     * @return
     */
    public boolean autenticar(ListaUsuarios usuarios){
        for(int i = 0; i < usuarios.getID_Actual(); i++){
            if(this.username == usuarios.buscarUsuario(i).getNombre() && this.contrasena == usuarios.buscarUsuario(i).getContrasena()){
                return true;
            }
        }
        return false;
    } 
    
}
