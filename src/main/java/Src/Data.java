package Src;

import java.io.Serializable;

/**
 *
 * @author maria 
 * @author anita
 */
public class Data implements Serializable {
    private int dia;
    private int mes;
    private int ano;
    /**
     *Esta classe dá-nos a data em formato dia,mes, ano
     */

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String getData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
