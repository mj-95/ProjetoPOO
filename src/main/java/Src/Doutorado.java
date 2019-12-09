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
public class Doutorado extends Bolseiro implements Serializable{
    
    public Doutorado(Data dataInicBolsa, Data dataFinBolsa, int custoProjeto, String nome, String email) {
        super(dataInicBolsa, dataFinBolsa, custoProjeto, nome, email);
    }
    public Doutorado(String nome, String email) {
        super(nome, email);
    }
    
    
}
