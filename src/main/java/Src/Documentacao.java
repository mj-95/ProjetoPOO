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
public class Documentacao extends Tarefa implements Serializable{
    /**
     * Aqui tratamos da Tarefa Documentacao que extende da Classe Tarefa
     */
    /**
     * @param dataInic
     * @param duracaoEstimada
     * @param nome
     */
    public Documentacao(Data dataInic, int duracaoEstimada, String nome) {
        super(dataInic, duracaoEstimada, nome);
    }
    public String getTipo(){
        return "Documentacao";
    }
    
    public double getEsforco(){
        return 0.25;
    }
}
