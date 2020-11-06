package Model.AyU;

/**
 * Clase que define objetos que representan el registro de un usuario
 * @author feth
 * @version 1.0
 */
public class Registro {
    
    // Atributos
    private String nombre;
    private String correo;
    private int imagen_perfil;
    private String contrasena;
    private String username;
    
    // Metodos
    /**
     * Metodo que regresa el nombre del usuario en registro
     * @return El nombre del usuario
     */
    public String getNombre() { 
        return this.nombre; 
    }
    
    /**
     * Metodo que guarda el nombre del usuario en registro
     * @param nombre 
     */
    public void setNomnre( String nombre ) {    
        this.nombre = nombre;   
    }

    /**
     * Metodo que regresa el correo del usuario en registro
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo que guarda el correo del usuario en registro
     * @param correo 
     */
    public void setCorreo( String correo ) {
        this.correo = correo;
    }

    /**
     * Metodo que regresa la imagen de perfil del usuario en registro
     * @return imagen_perfil
     */
    public int getImagen_perfil() {
        return imagen_perfil;
    }
    
    /**
     * Metodo que guarda la imagen del perfil del usuario en registro
     * @param imagen_perfil 
     */
    public void setImagen_perfil( int imagen_perfil ) {
        this.imagen_perfil = imagen_perfil;
    }

    /**
     * Metodo que regresa la contraseña del usuario en registro
     * @return contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Metodo que guarda la contraseña del usuario en registro
     * @param contrasena 
     */
    public void setContrasena( String contrasena ) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo que regresa el username del usuario en registro
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que guarda el username del usuario en registro
     * @param username 
     */
    public void setUsername( String username ) {
        this.username = username;
    }
      
}

