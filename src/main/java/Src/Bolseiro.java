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
public abstract class Bolseiro extends Pessoa implements Serializable{
    protected Data dataInicBolsa;
    protected Data dataFinBolsa;
    protected int custoProjeto;
    
    /**
     *Classe filha da classe Pessoa
     *Esta classe tem todos os valores quanto às Pessoas que são Bolseiros
     */

    public Bolseiro(Data dataInicBolsa, Data dataFinBolsa, String nome, String email) {
        super(nome, email);
        this.dataInicBolsa = dataInicBolsa;
        this.dataFinBolsa = dataFinBolsa;
        this.custoProjeto = 0;
    }
    /**
     * @param dataInicBolsa
     * @param dataFinBolsa
     * @param nome
     * @param email
     * @return
    */
    public Bolseiro(String nome, String email) {
        super(nome, email);
    }
    public abstract void setDocentes(ArrayList<String> docentes);
    public String getTipo(){
        return "B";
    }
    public abstract String getTipoBols();

    public Data getDataInicBolsa() {
        return dataInicBolsa;
    }

    public void setDataInicBolsa(Data dataInicBolsa) {
        this.dataInicBolsa = dataInicBolsa;
    }

    public Data getDataFinBolsa() {
        return dataFinBolsa;
    }

    public void setDataFinBolsa(Data dataFinBolsa) {
        this.dataFinBolsa = dataFinBolsa;
    }

    public int getCustoProjeto() {
        return custoProjeto;
    }

    public void setCusto(int durac) {
        this.custoProjeto = durac * this.getCusto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
