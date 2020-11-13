/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Resenias_Videojuego;

import Model.Catalogo.Videojuego;
import Model.Utilerias.Conexion;
import Model.Resenias_Videojuego.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Delttoria
 */
public class Gestor_ReseniaVideojuego {
    
    //Atributos de la clase gestor_reseñas
    
    private ListaResenias resenias;
    
    //Constructor del gestor reseñas
    public Gestor_ReseniaVideojuego(){
        resenias = new ListaResenias(); 
 
    }
    
    //Getters y setter

    public ListaResenias getResenias() {
        return resenias;
    }

    public void setReseñas(ListaResenias reseñas) {
        this.resenias = reseñas;
    }
    
    //Escribir reseña (Añadir resenia)
    public boolean aniadir_resenia(int estrellas,String titulo_resenia, String contenido,String user_name,int videojuego_id){
        boolean exito = false;
        int geek_id = 0;

        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();

        // Declaramos instruccion para tabla Geek
        String consulta = "SELECT IDGeek FROM Geek WHERE Username = ?";

        PreparedStatement ps;
        ResultSet rs;

        try {
            con = SQL.getConexion();
            ps = con.prepareStatement(consulta);
            ps.setString(1, user_name);
            rs = ps.executeQuery();

            if( rs.next() ) {

                geek_id = (rs.getInt(1));

            }

        } catch (Exception e) {

        }
        
        String sql = ("INSERT INTO Reseñas(ID_Vid,IDGeek,Titulo,Reseña,Calificacion)VALUES(?,?,?,?,?)");
        Resenia nueva_resenia = new Resenia(estrellas,titulo_resenia,contenido,geek_id,0,videojuego_id);
        try {
            Conexion conectar = new Conexion();
            Connection signal;
            signal = conectar.getConexion();
            
            ps = signal.prepareStatement(sql);
            ps.setInt(1, nueva_resenia.getId_videojuego_asociado());
            ps.setInt(2, geek_id);
            ps.setString(3, nueva_resenia.getTitulo_resenia());
            ps.setString(4, nueva_resenia.getContenido());
            ps.setInt(5, nueva_resenia.getPuntuacion());
            if(ps.executeUpdate() == 1 ){
                exito = true;
            }
        } catch (Exception e) {
        }

        //Sacamos el promedio (Estrellas)
        String promedio = "UPDATE Videojuego SET Estrellas = (SELECT AVG(Calificacion) FROM Reseñas WHERE ID_Vid = ?) WHERE ID_Videojuego = ?;";
        if(exito == true){
            try {
                Conexion conectar = new Conexion();
                Connection signal;
                signal = conectar.getConexion();
                ps = signal.prepareStatement(promedio);
                ps.setInt(1, videojuego_id);
                ps.setInt(2, videojuego_id);
                ps.executeUpdate();
            } catch (Exception e) {
            }
        }
        return exito;
    }
    //Eliminar resenia
    public boolean eliminar_resenia(int id_resenia){
        boolean eliminacion = false;
        int videojuego_id = 0;
        //Obtener el id_videojuego
        String consulta = "SELECT ID_Vid FROM Reseñas WHERE ID_Reseña = ?";
        
        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;

        try {
            con = SQL.getConexion();
            ps = con.prepareStatement(consulta);
            ps.setInt(1, id_resenia);
            rs = ps.executeQuery();

            if( rs.next() ) {

                videojuego_id = (rs.getInt(1));

            }

        } catch (Exception e) {

        }
        
        //Eliminar la resenia
        String sql = String.format("DELETE FROM Reseñas WHERE ID_Reseña = '%d'", id_resenia);
        try {
            Conexion conectar = new Conexion();
            Connection signal;
            signal = conectar.getConexion();
            ps = signal.prepareStatement(sql);
            if(ps.executeUpdate() == 1){
                eliminacion = true;
            }
            
        }catch (Exception e) {
        }
        
        String promedio = "UPDATE Videojuego SET Estrellas = (SELECT AVG(Calificacion) FROM Reseñas WHERE ID_Vid = ?) WHERE ID_Videojuego = ?;";
        if(eliminacion == true){
            try {
                Conexion conectar = new Conexion();
                Connection signal;
                signal = conectar.getConexion();
                ps = signal.prepareStatement(promedio);
                ps.setInt(1, videojuego_id);
                ps.setInt(2, videojuego_id);
                ps.executeUpdate();
            } catch (Exception e) {
            }
        }
        return eliminacion;
    }
    
    public List<Resenia> listar_resenias(){
        List<Resenia> resenias_lista = new ArrayList<>();
        try {
            Conexion conectar = new Conexion();
            Connection signal;
            PreparedStatement ps;
            ResultSet rs;
            
            signal = conectar.getConexion();
            ps = signal.prepareStatement("select * from Reseñas");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_reseña = (rs.getInt(1));         //Obtiene el id de la reseña
                int id_videojuego = (rs.getInt(2));     // Obtiene el id del videojuego asociado
                int id_geek = (rs.getInt(3));        // Obtiene el id del geek asociado
                String titulo = (rs.getString(4));      // Obtiene el titulo de la reseña
                String contenido = (rs.getString(5));   // Obtiene el contenido de la reseña
                int calificación = (rs.getInt(6));      // Obtiene la cantidad de estrellas

                Resenia resenia = new Resenia(calificación,titulo,contenido,id_geek,id_reseña,id_videojuego);
                resenias_lista.add(resenia);
            }
        } catch (Exception e) {
        }
        return resenias_lista;
    }
    
    
    public ListaResenias listar_misresenias(int id_geek_resenias){
        ListaResenias mis_resenias = new ListaResenias();
        try {
            Conexion conectar = new Conexion();
            Connection signal;
            PreparedStatement ps;
            ResultSet rs;
            
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
