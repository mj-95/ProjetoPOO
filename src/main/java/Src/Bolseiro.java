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
public class Bolseiro extends Pessoa implements Serializable{
    protected Data dataInicBolsa;
    protected Data dataFinBolsa;
    protected int custoProjeto;

    public Bolseiro(Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(nome, email);
        this.dataInicBolsa = dataInicBolsa;
        this.dataFinBolsa = dataFinBolsa;
        this.custoProjeto = custoProjeto;
    }
    public Bolseiro(String nome, String email) {
        super(nome, email);
    }
    
    public String getTipo(){
        return "B";
    }

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

    public void setCustoProjeto(int custoProjeto) {
        this.custoProjeto = custoProjeto;
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
