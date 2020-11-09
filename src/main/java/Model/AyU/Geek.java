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
public class Geek extends Usuario{
    
    //Atributos
    private ArrayList<ListaUsuarios> mis_reseñas; //Cuando exista ListaReseñas, será: ArrayList<ListaReseñas> mis_reseñas
    private int estrellas_totales;
    private String biografia;
    
    /**
     * Constructor vacío
     */
    public Geek() {
        super();
    }
    
    
    /**
     * Constructor de Geek
     * @param nombre
     * @param correo
     * @param imagen_perfil
     * @param contrasena
     * @param username
     */
    public Geek(String nombre, String correo, int imagen_perfil, String contrasena, String username){
        super( nombre, correo, imagen_perfil, contrasena, username, 1);
        
    }
    
    /**
     * Metodo que regresa las reseñas del Geek
     * @return mis_reseñas
     */
    public ArrayList<ListaUsuarios> getMis_reseñas() {
        return mis_reseñas;
    }

    /**
     * Metodo que guarda las reseñas del Geek
     * @param mis_reseñas
     */
    public void setMis_reseñas(ArrayList<ListaUsuarios> mis_reseñas) {
        this.mis_reseñas = mis_reseñas;
    }

    /**
     * Metodo que regresa las estrellas del Geek
     * @return estrellas_totales
     */
    public int getEstrellas_totales() {
        return estrellas_totales;
    }

    /**
     * Metodo que guarda las estrellas del Geek
     * @param estrellas_totales
     */
    public void setEstrellas_totales(int estrellas_totales) {
        this.estrellas_totales = estrellas_totales;
    }

    /**
     * Metodo que regresa la biografia del Geek
     * @return biografia
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Metodo que guarda la biografia del Geek
     * @param biografia
     */
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    /**
     * Metodo que aumenta el numero de estrellas utilizadas por el Geek
     * @param estrellas_totales
     */
    public void aumentar_estrellas(int estrellas_totales){
        this.estrellas_totales += estrellas_totales;
    }
    
}
