package Src;

import java.io.Serializable;

/**
 *
 * @author maria 
 * @author anita
 */
public class Desenvolvimento extends Tarefa implements Serializable{
    /**
    * Aqui tratamos da Tarefa Desenvolvimento que extende da Classe Tarefa
    */
    /**
     * @param dataInic
     * @param duracaoEstimada
     * @param nome
     */
    public Desenvolvimento(Data dataInic, int duracaoEstimada, String nome) {
        super(dataInic, duracaoEstimada, nome);
    }
    /**
     *
     * @return
     */
    public String getTipo(){
        return "Desenvolvimento";
    }
    /**
     *
     * @return
     */
    public double getEsforco(){
        return 1;
    }
}
