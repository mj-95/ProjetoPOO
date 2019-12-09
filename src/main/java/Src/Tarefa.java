/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

/**
 *
 * @author maria
 */
public class Tarefa {
    protected Data dataInic;
    protected int duracaoEstimada;
    protected int taxaExecucao;
    protected Data dataFim;
    protected Pessoa pessoa;

    public Tarefa(Data dataInic, int duracaoEstimada, int taxaExecucao, Pessoa pessoa) {
        this.dataInic = dataInic;
        this.duracaoEstimada = duracaoEstimada;
        this.taxaExecucao = taxaExecucao;
        this.pessoa = pessoa;
    }

    public Data getDataInic() {
        return dataInic;
    }

    public void setDataInic(Data dataInic) {
        this.dataInic = dataInic;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public int getTaxaExecucao() {
        return taxaExecucao;
    }

    public void setTaxaExecucao(int taxaExecucao) {
        this.taxaExecucao = taxaExecucao;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
