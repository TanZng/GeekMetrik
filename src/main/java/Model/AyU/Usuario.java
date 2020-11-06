package Model.AyU;

/**
 * Clase que define objetos que representan a un usuario
 * @author feth
 * @version 1.0
 */
public class Usuario {
    
    // Atributos
    private String nombre;
    private String correo;
    private int imagen_perfil;
    private String contrasena;
    private String username;
    private boolean acces;
    
    // Metodos
    /**
     * Metodo que regresa el nombre del usuario
     * @return El nombre del usuario
     */
    public String getNombre() { 
        return this.nombre; 
    }
    
    /**
     * Metodo que guarda el nombre del usuario
     * @param nombre 
     */
    public void setNomnre( String nombre ) {    
        this.nombre = nombre;   
    }

    /**
     * Metodo que regresa el correo del usuario
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo que guarda el correo del usuario
     * @param correo 
     */
    public void setCorreo( String correo ) {
        this.correo = correo;
    }

    /**
     * Metodo que regresa la imagen de perfil del usuario
     * @return imagen_perfil
     */
    public int getImagen_perfil() {
        return imagen_perfil;
    }
    
    /**
     * Metodo que guarda la imagen del perfil del usuario
     * @param imagen_perfil 
     */
    public void setImagen_perfil( int imagen_perfil ) {
        this.imagen_perfil = imagen_perfil;
    }

    /**
     * Metodo que regresa la contraseña del usuario
     * @return contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo que guarda la contraseña del usuario
     * @param contrasena 
     */
    public void setContrasena( String contrasena ) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo que regresa el username del usuario
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que guarda el username del usuario
     * @param username 
     */
    public void setUsername( String username ) {
        this.username = username;
    }
    
    /**
     * Metodo que regresa el ID del usuario
     * @return ID_User
     * @version 0
     */
    public int getID_User() {
        
       // Código
       return 0;
        
    }
    
    /**
     * Metodo que guarda el ID del usuario
     * @param id 
     * @version 0
     */
    public void setID_User( int id ) {
        
        // Código
        
    }

    /**
     * Metodo que verifica si el usuario tiene acceso
     * @return acces
     */
    public boolean isAcces() {
        return acces;
    }

    /**
     * Metodo que guarda el acceso del usuario
     * @param acces 
     */
    public void setAcces( boolean acces ) {
        this.acces = acces;
    }
      
}