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

    public Desenvolvimento(Data dataInic, int duracaoEstimada, int taxaExecucao, Pessoa pessoa, String nome) {
        super(dataInic, duracaoEstimada, taxaExecucao, pessoa, nome);
    }
    
}
