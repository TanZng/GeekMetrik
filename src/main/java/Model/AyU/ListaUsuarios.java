package Model.AyU;

import java.util.ArrayList;

/**
 * Clase que representa uma lista de usuarios
 * @author Feth
 * @version 1.0
 */
public class ListaUsuarios {
    
    // Atributos
    private ArrayList<Usuario> usuarios;
    private int ID_Actual;
    
    /**
     * Constructor que inicializa el ID Actual
     * Si se desea inicializar la lista, debe usarse el método set o
     * el segundo constructor
     */
    public ListaUsuarios() {
        
        this.ID_Actual = 0;
        
    }
    
    /**
     * Constructor que inicializa el ID actual y 
     * asigna una lista de usuarios
     * @param usuarios 
     */
    public ListaUsuarios( ArrayList usuarios ) {
        
        this.ID_Actual = 0;
        this.usuarios = usuarios;
        
    }
    
    /**
     * Funcion que regresa una lista de usuarios
     * @return usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Funcion que guarda una lista de usuarios
     * @param usuarios 
     */
    public void setUsuarios( ArrayList<Usuario> usuarios ) {
        this.usuarios = usuarios;
    }

    /**
     * Función que regresa el ID actual
     * @return ID_Actual
     */
    public int getID_Actual() {
        return ID_Actual;
    }

    /**
     * Función que guarda el ID actual 
     * @param ID_Actual 
     */
    public void setID_Actual( int ID_Actual ) {
        this.ID_Actual = ID_Actual;
    }
    
    // Falta por implementar
    public boolean añadirUsuario() {
        
        return true;
        
    }
    
    /**
     * Función que elimina un usuario de la lista
     * Si el indice no existe, regresa falso
     * @param ID
     * @return True en caso de éxito o False en caso de fallo
     */
    public boolean eliminarUsuario( int ID ) {
        
        // Si el indice no existe
        if( ID >= this.usuarios.size() ) {
            
            return false;
            
        }
        
        this.usuarios.remove(ID);
        this.ID_Actual--;
        
        return true;
        
    }
    
    /**
     * Función que busca un usuario en la lista
     * Si el indice no existe regresa un valor nulo
     * @param ID
     * @return Usuarios[ID] en caso de éxito o null en caso de fallar
     */
    public Usuario buscarUsuario( int ID ) {
        
        // Si el indice no existe
        if( ID >= this.usuarios.size() ) {
            
            return null;
            
        }
        
        return this.usuarios.get(ID);
        
    }
    
}
