/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Resenias_Videojuego;

import java.util.ArrayList;
import Model.Resenias_Videojuego.Resenia;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Delttoria
 */
public class ListaResenias {
    
    //Atributos de la clase Lista Resenias
    private ArrayList<Resenia> resenias_totales;
    private int id_resenia_actual;
    
    //Constructor de la clase lista resenias
    public ListaResenias(){
        resenias_totales = new ArrayList<Resenia>();
        id_resenia_actual = 0;
    }
    
    //getters y setters

    public ArrayList<Resenia> getResenias_totales() {
        return resenias_totales;
    }

    public void setResenias_totales(ArrayList<Resenia> resenias_totales) {
        this.resenias_totales = resenias_totales;
    }

    public int getId_resenia_actual() {
        return id_resenia_actual;
    }

    public void setId_resenia_actual(int id_resenia_actual) {
        this.id_resenia_actual = id_resenia_actual;
    }
    
    
    //Aniadir resenia
    public boolean aniadir_resenia(Resenia nueva_resenia){
        resenias_totales.add(nueva_resenia);
        return true;
    }
    
    //eliminar resenia de la lista
    public boolean eliminar_resenia(int id_resenia){
        boolean eliminado = false;
        for(int i = 0;i < resenias_totales.size() && !eliminado;i++){
            if(resenias_totales.get(i).getId_resenia() == id_resenia){
                resenias_totales.remove(i);//Al encontrar el id de la resenia, la elimina de la lista.
                eliminado = true;
            }
        }
        return eliminado;
    }
    
    
    //Visualizar resenia de la lista
    public Resenia visualizar_resenia(int id_resenia){
        boolean encontrar = false;
        Resenia resenia = null;
        for(int i = 0;i < resenias_totales.size() && !encontrar;i++){
            if(resenias_totales.get(i).getId_resenia() == id_resenia){
                resenia = resenias_totales.get(i);
                encontrar = true;
            }
        }
        return resenia;
    }
    
    //Editar una resenia
    public boolean editar_resenia(int id_resenia,int puntuacion,String titulo, String contenido){
        boolean encontrar = false;
        Resenia resenia = null;
        for(int i = 0;i < resenias_totales.size() && !encontrar;i++){
            if(resenias_totales.get(i).getId_resenia() == id_resenia){
                resenia = resenias_totales.get(i);
                resenia.setTitulo_resenia(titulo);
                resenia.setContenido(contenido);
                resenia.setPuntuacion(puntuacion);
                encontrar = true;
            }
        }
        return encontrar;
    }
}
