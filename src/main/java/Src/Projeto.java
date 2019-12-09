/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Projeto {
    private String nome;
    private String acronimo;
    private Data dataInic;
    private boolean estado;
    private int duracaoEstimada;
    private Data dataFim;
    private Docente invPrinc;
    private ArrayList<Pessoa> Pessoas;
    private ArrayList<Tarefa> Tarefas;

    public Projeto(String nome, String acronimo, Data dataInic, int duracaoEstimada, Docente invPrinc, ArrayList<Pessoa> Pessoas) {
        this.nome = nome;
        this.acronimo = acronimo;
        this.dataInic = dataInic;
        this.duracaoEstimada = duracaoEstimada;
        this.invPrinc = invPrinc;
        this.Pessoas = Pessoas;
        this.estado = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
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

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public ArrayList<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> Pessoas) {
        this.Pessoas = Pessoas;
    }

    public ArrayList<Tarefa> getTarefas() {
        return Tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> Tarefas) {
        this.Tarefas = Tarefas;
    }
    
}
