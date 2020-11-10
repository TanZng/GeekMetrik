package Model.AyU;

import Model.Utilerias.Conexion;
import Model.Utilerias.hash;
import View.GUIS_AyU.GUILogin;
import java.sql.Connection;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public boolean modificarUsuario( Usuario geek, String bio ) {
       
        // Conectamos con la base de datos
        Conexion SQL = new Conexion();
        Connection con = SQL.getConexion();
        
        // Declaramos la instruccion de SQL
        String sql = "UPDATE Usuario SET Nombre=?, ApellidoP=?, ApellidoM=?, Correo=? WHERE Username=?";
        
        // Declaramos instruccion para tabla Geek
        String sqlGeek = "UPDATE Geek SET Biografia=? WHERE Username=?";
        
        PreparedStatement ps;
        
        try {
            
            // Preparamos la inserción
            ps = con.prepareStatement(sql);
            
            // Asignamos valores
            ps.setString(1, geek.getNombre());
            ps.setString(2, geek.getaPaterno());
            ps.setString(3, geek.getaMaterno());
            ps.setString(4, geek.getCorreo());
            ps.setString(5, geek.getUsername());

            // Ejecutamos la instrucción ya con sus valores
            ps.execute();
            
            // Preparamos la instrucción para tabla geek
            ps = con.prepareStatement(sqlGeek);
            
            ps.setString(1, bio);
            ps.setString(2, geek.getUsername());
            
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
