/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Codigo_Reseñas;

/**
 *
 * @author Delttoria
 */
public class RedSocial {
    
    //Atributos
    private String nombre;
    private int id;
    private String url;
    private int logo;
    
    //Constructor
    public RedSocial(String nombre,int id_red_social,String url,int logo){
        this.nombre = nombre;
        this.id = id_red_social;
        this.url = url;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
      
}
