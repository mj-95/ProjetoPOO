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
public class Docente extends Pessoa implements Serializable {

    /**
     *
     */
    protected int nMecanografico;

    /**
     *
     */
    protected String areaInvestigacao;

    /**
     *
     * @return
     */
    public String getTipoBols(){
        return null;
    }

    /**
     *
     * @return
     */
    public String getTipo(){
        return "Doc";
    }

    /**
     *
     * @return
     */
    public int getnMecanografico() {
        return nMecanografico;
    }

    /**
     *
     * @param docentes
     */
    public void setDocentes(ArrayList<String> docentes){};

    /**
     *
     * @param nMecanografico
     */
    public void setnMecanografico(int nMecanografico) {
        this.nMecanografico = nMecanografico;
    }
    
    /**
     *
     * @return
     */
    public int getCusto(){
        return 0;
    }

    /**
     *
     * @param custo
     */
    public void setCusto(int custo){}

    /**
     *
     * @return
     */
    public String getAreaInvestigacao() {
        return areaInvestigacao;
    }

    /**
     *
     * @param areaInvestigacao
     */
    public void setAreaInvestigacao(String areaInvestigacao) {
        this.areaInvestigacao = areaInvestigacao;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param nMecanografico
     * @param areaInvestigacao
     * @param nome
     * @param email
     */
    public Docente(int nMecanografico, String areaInvestigacao, String nome, String email) {
        super(nome, email);
        this.nMecanografico = nMecanografico;
        this.areaInvestigacao = areaInvestigacao;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Docente{" + "nMecanografico=" + nMecanografico + ", areaInvestigacao=" + areaInvestigacao + '}';
    }
}
