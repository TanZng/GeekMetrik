/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Resenias_Videojuego;

import Model.Utilerias.Conexion;
import Model.Resenias_Videojuego.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Delttoria
 */
public class Gestor_ReseniaVideojuego {
    
    //Atributos de la clase gestor_reseñas
    private ListaResenias resenias;
    private Conexion conectar;
    private Connection signal;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //Constructor del gestor reseñas
    public Gestor_ReseniaVideojuego(){
        resenias = new ListaResenias(); 
        conectar = new Conexion();
    }
    
    //Getters y setter

    public ListaResenias getResenias() {
        return resenias;
    }

    public void setReseñas(ListaResenias reseñas) {
        this.resenias = reseñas;
    }
    
    //Escribir reseña (Añadir resenia) (Construcción)
    public boolean aniadir_resenia(int estrellas,String titulo_resenia, String contenido,int geek_id,int videojuego_id){
        Resenia nueva_resenia = new Resenia(estrellas,titulo_resenia,contenido,geek_id,0,videojuego_id);
        String sql ="INSERT INTO Reseñas(ID_Vid,IDGeek,Titulo,Reseña,Calificacion,)VALUES(?,?,?,?,?)";

        boolean exito = false;
        try {
            signal = conectar.getConexion();
            ps = signal.prepareStatement(sql);
            ps.setInt(1, nueva_resenia.getId_videojuego_asociado());
            ps.setInt(2, nueva_resenia.getId_geek_asociado());
            ps.setString(3, nueva_resenia.getTitulo_resenia());
            ps.setString(4, nueva_resenia.getContenido());
            ps.setInt(5, nueva_resenia.getPuntuacion());
            if(ps.executeUpdate() == 1 ){
                exito = true;
            }
        } catch (Exception e) {
        }
        
        return exito;
    }
    //Eliminar resenia
    public boolean eliminar_resenia(int id_resenia){
        boolean eliminacion = false;
        String sql = String.format("DELETE FROM Reseñas WHERE ID_Reseña = '%d' ", id_resenia);
        try {
            signal = conectar.getConexion();
            ps = signal.prepareStatement(sql);
            if(ps.executeUpdate() == 1){
                eliminacion = true;
            }
            
        }catch (Exception e) {
        }
        return eliminacion;
    }
    
    public ListaResenias listar_resenias(){
        try {
            signal = conectar.getConexion();
            ps = signal.prepareStatement("SELECT * FROM Reseñas");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_reseña = (rs.getInt(1));         //Obtiene el id de la reseña
                int id_videojuego = (rs.getInt(2));     // Obtiene el id del videojuego asociado
                int id_geek = (rs.getInt(3));        // Obtiene el id del geek asociado
                String titulo = (rs.getString(4));      // Obtiene el titulo de la reseña
                String contenido = (rs.getString(5));   // Obtiene el contenido de la reseña
                int calificación = (rs.getInt(6));      // Obtiene la cantidad de estrellas

                Resenia resenia = new Resenia(calificación,titulo,contenido,id_geek,id_reseña,id_videojuego);
                resenias.aniadir_resenia(resenia);
            }
        } catch (Exception e) {
        }
        return resenias;
    }
    
    
    public ListaResenias listar_misresenias(int id_geek_resenias){
        ListaResenias mis_resenias = new ListaResenias();
        try {
            signal = conectar.getConexion();
            ps = signal.prepareStatement("SELECT * FROM Reseñas WHERE IDGeek = '%d' ", id_geek_resenias);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_resenia = (rs.getInt(1));         //Obtiene el id de la reseña
                int id_videojuego = (rs.getInt(2));     // Obtiene el id del videojuego asociado
                int id_geek = (rs.getInt(3));           // Obtiene el id del geek asociado
                String titulo = (rs.getString(4));      // Obtiene el titulo de la reseña
                String contenido = (rs.getString(5));   // Obtiene el contenido de la reseña
                int calificación = (rs.getInt(6));      // Obtiene la cantidad de estrellas

                Resenia resenia = new Resenia(calificación,titulo,contenido,id_geek,id_resenia,id_videojuego);
                mis_resenias.aniadir_resenia(resenia);
            }
        } catch (Exception e) {
        }
        return mis_resenias;
    }
    
}
