/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Resenias_Videojuego;

/**
 *
 * @author Delttoria
 */
public class Resenia {
    
    //Atributos de la clase resenia
    private int puntuacion;
    private String titulo_resenia;
    private String contenido;
    private int id_geek_asociado;
    private int id_resenia;
    private int id_videojuego_asociado;
    private int likes;
    
    
    //Constructor
    public Resenia(int puntuacion,String titulo_resenia, String contenido,int id_geek,int id_resenia,int id_videojuego){
        this.puntuacion = puntuacion;
        this.titulo_resenia = titulo_resenia;
        this.contenido = contenido;
        id_geek_asociado = id_geek;
        this.id_resenia = id_resenia;
        id_videojuego_asociado = id_videojuego;
        likes = 0;
    }
    
    //Getters y Setters

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTitulo_resenia() {
        return titulo_resenia;
    }

    public void setTitulo_resenia(String titulo_resenia) {
        this.titulo_resenia = titulo_resenia;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getId_geek_asociado() {
        return id_geek_asociado;
    }

    public void setId_geek_asociado(int id_geek_asociado) {
        this.id_geek_asociado = id_geek_asociado;
    }

    public int getId_resenia() {
        return id_resenia;
    }

    public void setId_resenia(int id_resenia) {
        this.id_resenia = id_resenia;
    }

    public int getId_videojuego_asociado() {
        return id_videojuego_asociado;
    }

    public void setId_videojuego_asociado(int id_videojuego_asociado) {
        this.id_videojuego_asociado = id_videojuego_asociado;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    //Incrementa el número de likes
    public void incLikes(int likes){
        this.likes +=likes;
    }
    
    //Decrementa el número de likes
    public void decLikes(int likes){
        this.likes -= likes;
    }
}
