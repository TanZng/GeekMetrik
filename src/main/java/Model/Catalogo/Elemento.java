package Model.Catalogo;


public class Elemento {

    private String titulo;
    private Double estrellas;
    private String descripcion;
    private int imagen_perfil;
    private String id_admin_asociado;
    private boolean destacado;

    /**
     * Constructor por defecto
     */
    public Elemento() {

        // Constructor por defecto

    }

    /**
     * Contructor que define
     * @param titulo
     * @param descripcion
     * @param imagen_perfil
     * @param id_admin_asociado
     */

    public Elemento(String titulo, String descripcion, int imagen_perfil, String id_admin_asociado, double estrellas) {
        this.titulo = titulo;
        this.estrellas = estrellas;
        this.descripcion = descripcion;
        this.imagen_perfil = imagen_perfil;
        this.id_admin_asociado = id_admin_asociado;
        this.destacado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Double estrellas) {
        this.estrellas = estrellas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen_perfil() {
        return imagen_perfil;
    }

    public void setImagen_perfil(int imagen_perfil) {
        this.imagen_perfil = imagen_perfil;
    }

    public String getId_admin_asociado() {
        return id_admin_asociado;
    }

    public void setId_admin_asociado(String id_admin_asociado) {
        this.id_admin_asociado = id_admin_asociado;
    }

    public boolean isDestacado() {
        return destacado;
    }

    public void setDestacado(boolean destacado) {
        this.destacado = destacado;
    }

    public boolean actualizar_estrellas(double estrellas){
        boolean condicion = estrellas >= 0 && estrellas <= 5;
        if (condicion) {
            this.estrellas = estrellas;
        }
        return condicion;
    }

}
