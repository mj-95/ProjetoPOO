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
public class Licenciado extends Bolseiro implements Serializable{
    private ArrayList<String> docentes;
    /**
     * Aqui tratamos das Pessoas que estao na Licenciatura e que extende da Classe Bolseiro
     */
    public Licenciado(ArrayList<String> docentes, Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, nome, email);
        this.docentes = docentes;
    }
    public Licenciado(Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, nome, email);
        docentes = new ArrayList<>();
    }
    public Licenciado(String nome, String email) {
        super(nome, email);
    }
    
    public void insereDocente(String docente){
        docentes.add(docente);
    }

    public ArrayList<String> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<String> docentes) {
        this.docentes = docentes;
    }
    public String getTipoBols(){
        return "L";
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
    
    public int getCusto(){
        return 800;
    }
    
}
