/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Resenias_Videojuego;

import Model.Utilerias.Conexion;
import Model.Resenias_Videojuego.ListaResenias;
import Model.Resenias_Videojuego.Resenia;

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
    private ListaResenias reseñas;
    private Conexion conectar;
    private Connection signal;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //Constructor del gestor reseñas
    public Gestor_ReseniaVideojuego(){
        reseñas = new ListaResenias(); 
        conectar = new Conexion();
    }
    
    //Getters y setter

    public ListaResenias getReseñas() {
        return reseñas;
    }

    public void setReseñas(ListaResenias reseñas) {
        this.reseñas = reseñas;
    }
    
    //Escribir reseña (Añadir resenia) (Construcción)
    public boolean añadir_resenia(int estrellas,String titulo_resenia, String contenido,int geek_id,int videojuego_id){
        Resenia nueva_resenia = new Resenia(estrellas,titulo_resenia,contenido,geek_id,0,0);
        //String sql ="INSERT INTO Videojuego(ID_Vid,ID_Geek,Titulo,Reseña,Calificacion,)VALUES(?,?,?,?,?)";
        int wire = 0;
        boolean exito = false;
        /*
        
    UsernameGeek CHAR(50) NOT NULL, //Error de emmy deberia ser id_geek TT.TT

        
        
        try {
            signal = conectar.getConexion();
            ps = signal.prepareStatement(sql);
            ps.setString(1, nueva_resenia.getId_videojuego_asociado());
            ps.setString(2, nueva_resenia.getId_geek_asociado());
            ps.setString(3, nueva_resenia.getTitulo_resenia());
            ps.setString(4, nueva_resenia.getContenido());
            ps.setString(5, nueva_resenia.getPuntuacion());
            wire = ps.executeUpdate();
            if(wire ==1 ){
                exito = true;
            }
        } catch (Exception e) {
        }
        */
        return exito;
    }
}
