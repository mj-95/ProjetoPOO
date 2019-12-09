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
 */
public class Mestrado extends Bolseiro implements Serializable{
    private ArrayList<String> docentes;
    
     public void insereDocente(String docente){
        docentes.add(docente);
    }

    public Mestrado(ArrayList<String> docentes, Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, custoProjeto, nome, email);
        this.docentes = docentes;
    }
    public Mestrado(Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, custoProjeto, nome, email);
    }
    public Mestrado(String nome, String email) {
        super(nome, email);
    }

}
