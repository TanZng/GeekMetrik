package Model.Catalogo;

import java.util.ArrayList;

public class ListaVideojuegos {

    private ArrayList<Videojuego> videojuegos;
    private int id_videojuego_actual;

    /**
     * Constructor default
     */
    public ListaVideojuegos() {
    }

    /**
     * @param videojuegos
     */
    public ListaVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
        this.id_videojuego_actual = 0;
    }

    /**
     * @return la lista de videojuegos
     */
    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    /**
     * @param videojuegos
     */
    public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    /**
     * @return id videojuego actual
     */
    public int getId_videojuego_actual() {
        return id_videojuego_actual;
    }

    /**
     *
     * @param id_videojuego_actual
     */
    public void setId_videojuego_actual(int id_videojuego_actual) {
        this.id_videojuego_actual = id_videojuego_actual;
    }

    public boolean añadir_videojuego(Videojuego videojuego){
        videojuegos.add(videojuego);
        return true;
    }

    /**
     *
     * @param id videojuego a eliminar
     * @return true si se elimina
     */
    public boolean eliminar_videojuego(int id){
        for (int i=0;i<videojuegos.size();i++) {
            Videojuego v = videojuegos.get(i);
            if (v.getId_videojuego() == id){
                videojuegos.remove(v);
                return true;
            }
        }
        return false;
    }


}
