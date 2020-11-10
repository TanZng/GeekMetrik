package Model.Catalogo;

import Model.Utilerias.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//par a eliminar DELETE FROM Videojuego WHERE ID_Videojuego = x;

public class Gestor_Catalogo {
    private Catalogo catalogo;
    private Conexion conectar = new Conexion();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public Gestor_Catalogo() {

    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public Gestor_Catalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public List<Videojuego> listar_Videojuegos(){
        List<Videojuego> datos = new ArrayList<>();
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement("select * from Videojuego");
            rs = ps.executeQuery();
            while (rs.next()) {

                int id = (rs.getInt(1)); //id videojuego
                String titulo = (rs.getString(2)); // titulo
                String desc = (rs.getString(4)); // Descrip
                String gen = (rs.getString(5)); // Categoria / genero
                Double star = (rs.getDouble(3)); // estrellas

                // se salta la imagen
                String admin = ((rs.getString(6))); //Obtiene ID ADMIN
                Videojuego v = new Videojuego(titulo, desc, 0, admin, star, gen, id, null);
                datos.add(v);
            }
        } catch (Exception e) {
        }
        return datos;

    }

    public int aniadir_Videojuego(String titulo, String desc, String genero, String id_admin){
        Videojuego v = new Videojuego(titulo, desc, 0, id_admin, 0, genero, 0, null);
        String sql="insert into Videojuego(Titulo, Descripción, Alias_Admin, Estrellas, Genero)values(?,?,?,0,?)";
        int r=0;
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getTitulo());
            ps.setString(2, v.getDescripcion());
            ps.setString(3, v.getId_admin_asociado());
            ps.setString(4, v.getGenero());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }
        return r;

    }

    public int actualizar(Videojuego vid) {
        int r=0;
        String sql="update Videojuego set Titulo=?, Descripción=?, Genero=? where ID_Videojuego=?";
        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,vid.getTitulo());
            ps.setString(2,vid.getDescripcion());
            ps.setString(3,vid.getGenero());
            ps.setInt(4,vid.getId_videojuego());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }

        }catch (Exception e) {
        }
        return r;
    }

    public int eliminar(int id){
        int r=0;
        String sql = String.format("delete from Videojuego where ID_Videojuego= '%d' ", id);
        try {
            con=conectar.getConexion();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

}
