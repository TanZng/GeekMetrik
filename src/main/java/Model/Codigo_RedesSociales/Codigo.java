/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Codigo_RedesSociales;

import java.util.Calendar;

/**
 *
 * @author Delttoria
 */
public class Codigo {
    
    //Atributos
    private String codigo;
    private int id_geek_asociado;
    private Calendar fecha_expiracion;
    private int codigo_videojuego_asociado;
    private boolean uso;
    
    //Constructor
    public Codigo(String codigo,int id_geek,Calendar expiracion,int videojuego_id){
    this.codigo = codigo;
    id_geek_asociado = id_geek;
    fecha_expiracion = expiracion;
    codigo_videojuego_asociado = videojuego_id;
    uso = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId_geek_asociado() {
        return id_geek_asociado;
    }

    public void setId_geek_asociado(int id_geek_asociado) {
        this.id_geek_asociado = id_geek_asociado;
    }

    public Calendar getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(Calendar fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public int getCodigo_videojuego_asociado() {
        return codigo_videojuego_asociado;
    }

    public void setCodigo_videojuego_asociado(int codigo_videojuego_asociado) {
        this.codigo_videojuego_asociado = codigo_videojuego_asociado;
    }

    public boolean isUso() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }
    
    public void usarCodigo(){
        uso = true;
    }
    
}
