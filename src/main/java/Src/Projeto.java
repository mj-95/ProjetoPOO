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
public class Projeto implements Serializable {
    private String nome;
    private String acronimo;
    private Data dataInic;
    private boolean estado;
    private int duracaoEstimada;
    private Data dataFim;
    private Docente invPrinc;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Tarefa> tarefas;
    /**
     * Esta classe contém a informação dos Projetos
     * @param acronimo
     * @param nome
     * @param estado
     * @param dataInic
     * @param dataFim
     * @param duracaoEstimada
     * @param invPrinc
     */
    public Projeto(String nome, String acronimo, Data dataInic, int duracaoEstimada, Docente invPrinc, ArrayList<Pessoa> pessoas) {
        this.nome = nome;
        this.acronimo = acronimo;
        this.dataInic = dataInic;
        this.duracaoEstimada = duracaoEstimada;
        this.invPrinc = invPrinc;
        this.pessoas = pessoas;
        this.estado = false;
        this.tarefas = new ArrayList();
    }
    
    public int custo(){
        int c  = 0;
        for(int i =0;i<pessoas.size();i++){
            if(pessoas.get(i).getTipo().equals("B")){
                c+= pessoas.get(i).getCusto()*duracaoEstimada;
            }
            
        }
        return c;
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
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
    
    public void setTarefa(Tarefa t){
        this.tarefas.add(t);
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    
}
