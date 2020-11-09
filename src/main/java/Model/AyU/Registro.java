package Model.AyU;

import Model.Utilerias.Conexion;
import Model.Utilerias.hash;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que define objetos que representan el registro de un usuario
 * @author Feth
 * @version 1.0
 */
public class Registro {
    
    // Atributos
    private String nombre;
    private String correo;
    private int imagen_perfil;
    private String contrasena;
    private String username;
    private int tipo;
    
    /**
     * Constructor por defecto
     */
    public Registro() {
        
        // Constructor por defecto
        
    }
    
     /**
     * Constructor que define los parámetros del usuario en registro
     * @param nombre
     * @param correo
     * @param imagen_perfil
     * @param contrasena
     * @param username 
     * @param tipo
     */
    public Registro( String nombre, String correo, int imagen_perfil, String contrasena, String username, int tipo ) {
        
        this.nombre = nombre;
        this.correo = correo;
        this.imagen_perfil = imagen_perfil;
        this.contrasena = contrasena;
        this.username = username;
        this.tipo = tipo;
        
    }
    
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Función que registra un Geek en la base de datos de Geek Metrik
     * @param nombre
     * @param correo
     * @param archivoImagen
     * @param imagen
     * @param contraseña
     * @param username
     * @return True si se registró el Geek o False en caso contrario
     */
    public boolean efectuarRegistroGeek( Geek geek, FileInputStream imagen ) {
        
        // Encriptamos contrasena
        String contra = hash.hash1( geek.getContrasena() );
        
        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();
        
        // Declaramos la instruccion de SQL
        String sql = "INSERT INTO Usuario(Nombre, Correo, ImagenPerfil, Contra, Username, TipoUsuario) VALUES(?, ?, ?, ?, ?, ?)";
        
        // Declaramos instruccion para tabla Geek
        String sqlGeek = "INSERT INTO Geek(Username) VALUES ( ? )";
        
        PreparedStatement ps;
        
        try {
            
            // Preparamos la inserción
            ps = con.prepareStatement(sql);
            
            // Asignamos valores
            ps.setString(1, geek.getNombre());
            ps.setString(2, geek.getCorreo());
            ps.setBinaryStream(3, imagen, geek.getImagen_perfil());
            ps.setString(4, contra);
            ps.setString(5, geek.getUsername());
            ps.setInt(6, geek.getTipo());
            
            // Ejecutamos la instrucción ya con sus valores
            ps.execute();
            
            // Preparamos la instrucción para tabla geek
            ps = con.prepareStatement(sqlGeek);
            
            ps.setString(1, geek.getUsername());
            
            // Ejecutamos la instrucción ya con sus valores
            ps.execute();
            
            // Si se tuvo éxito
            return true;
            
        } catch ( SQLException ex) {
            
            // Si no se tuvo éxito
            Logger.getLogger(GestorAyU.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
        }
        
    }
      
}

