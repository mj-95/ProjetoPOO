/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.io.Serializable;

/**
 *
 * @author maria
 */
public class Desenvolvimento extends Tarefa implements Serializable{

    public Desenvolvimento(Data dataInic, int duracaoEstimada, String nome) {
        super(dataInic, duracaoEstimada, nome);
    }
    
    public String getTipo(){
        return "Desenvolvimento";
    }
    
    public double getEsforco(){
        return 1;
    }
}
