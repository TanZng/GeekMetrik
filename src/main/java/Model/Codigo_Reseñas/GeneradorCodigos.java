/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Codigo_Reseñas;

import java.util.ArrayList;
import Model.Codigo_Reseñas.Codigo;
import java.util.Random;

/**
 *
 * @author Delttoria
 */
public class GeneradorCodigos {
    //Atributos
    private String steam_url;
    private ArrayList<Codigo> codigosValidados;
    private boolean status;
    
    //Constructor (Vácio)
    //Se utiliza cuando comience el sistema GeekMetrik sin ningún código
    public GeneradorCodigos(){
        steam_url = "https://store.steampowered.com/; //Url de steam";
        ArrayList<Codigo> codigosValidados = new ArrayList<Codigo>(); //Codigos válidos
        status = true; //Online
    }

    public String getSteam_url() {
        return steam_url;
    }

    public void setSteam_url(String steam_url) {
        this.steam_url = steam_url;
    }

    public ArrayList<Codigo> getCodigosValidados() {
        return codigosValidados;
    }

    public void setCodigosValidados(ArrayList<Codigo> codigosValidados) {
        this.codigosValidados = codigosValidados;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean generar_codigo(String admin_username,String admin_password,String geek_username, int id_videojuego){
        boolean creacion_codigo = false;
        if(admin_username.equals("Emmy") && admin_password.equals("123")){
            creacion_codigo = true;
            char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
            StringBuilder generacion = new StringBuilder(20);
            Random random = new Random();
            for (int i = 1; i <= 20; i++) {
            char construccion = chars[random.nextInt(chars.length)];
            generacion.append(construccion);
            if(i%5==0 && i != 20){
                generacion.append("-");
            }
        }
        String codigo = generacion.toString();
            
        }
        return creacion_codigo;
    }
}
