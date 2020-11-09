package Model.Catalogo;

import java.util.ArrayList;

public class Catalogo {
    private  ArrayList<Elemento> elementos;
    private ListaVideojuegos videojuegos;


    public Catalogo() {
    }

    public Catalogo(ArrayList<Elemento> destacadas, ListaVideojuegos videojuegos) {
        this.elementos = destacadas;
        this.videojuegos = videojuegos;
    }

    public ArrayList<Elemento> getDestacadas() {
        return elementos;
    }

    public void setDestacadas(ArrayList<Elemento> destacadas) {
        this.elementos = destacadas;
    }

    public ListaVideojuegos getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(ListaVideojuegos videojuegos) {
        this.videojuegos = videojuegos;
    }

}
