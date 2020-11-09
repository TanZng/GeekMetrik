package Model.AyU;

/**
 * Clase que define objetos del tipo Admin
 * Hereda de la superclase Usuario
 * @author Feth
 * @version 1.0
 */
public class Admin extends Usuario {
    
    // Atributos
    private String alias;
    private enum rol { Editor, Moderador, CommunityManager, SuperAdmin }
    private rol valor;
    
    /**
     * Constructor por defecto
     */
    public Admin() {
        
        // Constructor de la super clase
        super();
        
    }
    
    /**
     * Constructor que define los atributos del Admin
     * @param nombre
     * @param correo
     * @param imagen_perfil
     * @param contrasena
     * @param username
     * @param alias
     * @param valorEnum 
     */
    public Admin( String nombre, String correo, int imagen_perfil, String contrasena, String username, String alias, String valorEnum ) {
        
        // Constructor de la super clase
        super( nombre, correo, imagen_perfil, contrasena, username, 0 );
        
        this.alias = alias;
        this.valor = rol.valueOf(valorEnum);
        
    }

    /**
     * Metodo que regresa el alias del Admin
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Metodo que guarda el alias del Admin
     * @param alias 
     */
    public void setAlias( String alias ) {
        this.alias = alias;
    }
    
    /**
     * Funcion que regresa el rol del Admin
     * @return rol
     */
    public String getRol() {
        return this.valor.name();
    }
    
    /**
     * Funcion que guarda el rol del Admin
     * @param valorEnum 
     */
    public void setRol( String valorEnum ) {
        this.valor = rol.valueOf(valorEnum);
    }
    
}
