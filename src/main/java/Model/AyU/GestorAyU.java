package Model.AyU;

import Model.Catalogo.Videojuego;
import Model.Utilerias.Conexion;
import Model.Utilerias.hash;
import View.GUIS_AyU.GUILogin;
import java.sql.Connection;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Usuario> listarUsuarios(){
        List<Usuario> datos = new ArrayList<>();
        try {
            
            Conexion conectar = new Conexion();
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            
            
            con = conectar.getConexion();
            ps = con.prepareStatement("SELECT * FROM Usuario");
            rs = ps.executeQuery();
            
            while (rs.next()) {

                String nombre = (rs.getString(1));
                String correo = (rs.getString(4));
                String usr = (rs.getString(7));
                
                Usuario user = new Usuario();
                user.setNombre(nombre);
                user.setCorreo(correo);
                user.setUsername(usr);
                
                datos.add(user);
            }
        } catch (Exception e) {
        }
        return datos;

    }
    
    public int eliminarUsuario( String username ) {
        
        Conexion conectar = new Conexion();
        Connection con;
        PreparedStatement ps;
        
        int r = 0;
        String sql = String.format("DELETE FROM Usuario where Username = '%s' ", username);
        
        try {
            
            con=conectar.getConexion();
            ps=con.prepareStatement(sql);
            r = ps.executeUpdate();
            
        } catch (Exception e) {
            
        }
        
        return r;
        
    }

}
