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
public class Docente extends Pessoa implements Serializable {
    protected int nMecanografico;
    protected String areaInvestigacao;
    
    public String getTipo(){
        return "Doc";
    }
    public int getnMecanografico() {
        return nMecanografico;
    }

    public void setnMecanografico(int nMecanografico) {
        this.nMecanografico = nMecanografico;
    }

    public String getAreaInvestigacao() {
        return areaInvestigacao;
    }

    public void setAreaInvestigacao(String areaInvestigacao) {
        this.areaInvestigacao = areaInvestigacao;
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

    public Docente(int nMecanografico, String areaInvestigacao, String nome, String email) {
        super(nome, email);
        this.nMecanografico = nMecanografico;
        this.areaInvestigacao = areaInvestigacao;
    }

    @Override
    public String toString() {
        return "Docente{" + "nMecanografico=" + nMecanografico + ", areaInvestigacao=" + areaInvestigacao + '}';
    }
}
