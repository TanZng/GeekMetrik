package Model.Catalogo;

import java.util.ArrayList;

/**
 * @author thann
 */

public class Videojuego extends Elemento {

    public Videojuego() {

    }

    /**
     * Contructor que define
     *
     * @param titulo
     * @param descripcion
     * @param imagen_perfil
     * @param id_admin_asociado
     * @param estrellas
     */
    public Videojuego(String titulo, String descripcion, int imagen_perfil, String id_admin_asociado,
                      double estrellas, String genero, int id_videojuego, ArrayList<Integer> id_reseñas_asociadas) {
        super(titulo, descripcion, imagen_perfil, id_admin_asociado, estrellas);
        this.genero = Videojuego.Generos.valueOf(genero);
        this.id_videojuego = id_videojuego;
        this.id_reseñas_asociadas = id_reseñas_asociadas;
    }

    public enum Generos { MOBA, Terror, RPG, Acción }
    private Generos genero;
    private int id_videojuego;
    private ArrayList<Integer> id_reseñas_asociadas;

    /**
     *  @param titulo
     * @param descripcion
     * @param imagen_perfil
     * @param id_admin_asociado
     * @param genero
     * @param id_videojuego
     * @param id_reseñas_asociadas
     */


    public String getGenero() {
        String name = genero.name();
        return name;
    }

    public void setGenero(String genero) {
        this.genero = Videojuego.Generos.valueOf(genero);
    }

    public int getId_videojuego() {
        return id_videojuego;
    }

    public void setId_videojuego(int id_videojuego) {
        this.id_videojuego = id_videojuego;
    }

    public ArrayList<Integer> getId_reseñas_asociadas() {
        return id_reseñas_asociadas;
    }

    public void setId_reseñas_asociadas(ArrayList<Integer> id_reseñas_asociadas) {
        this.id_reseñas_asociadas = id_reseñas_asociadas;
    }




}
