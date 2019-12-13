/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author maria 
 * @author anita
 */
public class Doutorado extends Bolseiro implements Serializable{
    
    public Doutorado(Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, nome, email);
    }
    
    public int getCusto(){
        return 1200;
    }
    
    public String getTipoBols(){
        return "Dou";
    }
    public void setDocentes(ArrayList<String> docentes){
        
    }
    public Doutorado(String nome, String email) {
        super(nome, email);
    }

    
    
}
