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
 * @author anita
 */
public class Design extends Tarefa implements Serializable{
    /**
     * Aqui tratamos da Tarefa Design que extende da Classe Tarefa
     */
    /**
     * @param dataInic
     * @param duracaoEstimada
     * @param nome
     */
    public Design(Data dataInic, int duracaoEstimada, String nome) {
        super(dataInic, duracaoEstimada,nome);
    }
    
    public String getTipo(){
        return "Design";
    }
    
    public double getEsforco(){
        return 0.5;
    }
}
