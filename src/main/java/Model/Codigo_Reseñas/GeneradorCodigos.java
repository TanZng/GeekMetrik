/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Codigo_Reseñas;

import java.util.ArrayList;
import Model.Codigo_Reseñas.Codigo;

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
    
}
