package Model.ReseñaVideojuego;

import Model.Catalogo.Elemento;

import java.util.ArrayList;

/**
 * @author thann
 */

public class Videojuego extends Elemento {
    private enum genero { MOBA, Terror, RPG, Accion }
    private int id_videojuego;
    private ArrayList<Integer> id_reseñas_asociadas;

    /**
     * Constructor que define los atributos del videojuego
     * @param titulo
     * @param estrellas
     * @param descripcion
     * @param imagen_perfil
     * @param id_admin_asociado
     * @param destacado
     * @param id_videojuego
     * @param id_reseñas_asociadas
     */
    public Videojuego(String titulo, Double estrellas, String descripcion, int imagen_perfil, int id_admin_asociado, boolean destacado, int id_videojuego, ArrayList<Integer> id_reseñas_asociadas) {
        super(titulo, estrellas, descripcion, imagen_perfil, id_admin_asociado, destacado);
        this.id_videojuego = id_videojuego;
        this.id_reseñas_asociadas = id_reseñas_asociadas;
    }

    /**
     * Contructor por defecto
     */
    public Videojuego() {
        // Constructor por defecto
    }

}
