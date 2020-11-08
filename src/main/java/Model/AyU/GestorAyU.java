package Model.AyU;

import Model.Utilerias.Conexion;
import Model.Utilerias.hash;
import java.sql.Connection;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase gestora de Autenticación y Usuarios
 * @author Feth
 * @Version 1.0
 */
public class GestorAyU {
    
    // Atributos
    private ListaUsuarios usuarios;

    /**
     * Método que regresa la lista de usuarios
     * @return usuarios
     */
    public ListaUsuarios getUsuarios() {
        return usuarios;
    }

    /**
     * Método que guarda una lista de usuarios
     * @param usuarios 
     */
    public void setUsuarios( ListaUsuarios usuarios ) {
        this.usuarios = usuarios;
    }
    
    // Falta implementación
    public boolean efectuarAutenticación() {
        
        return false;
        
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
    public boolean efectuarRegistroGeek( String nombre, String correo, FileInputStream archivoImagen, int imagen, String contrasena, String username ) {
        
        // Encriptamos contrasena
        String contra = hash.hash1( contrasena );
        
        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();
        
        // Declaramos la instruccion de SQL
        String sql = "INSERT INTO Usuario(Nombre, Correo, ImagenPerfil, Contra, Username) VALUES(?, ?, ?, ?, ?)";
        
        PreparedStatement ps;
        
        try {
            
            // Preparamos la inserción
            ps = con.prepareStatement(sql);
            
            // Asignamos valores
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setBinaryStream(3, archivoImagen, imagen);
            ps.setString(4, contra);
            ps.setString(5, username);
            
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
