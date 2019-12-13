/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;
import java.io.*;

/**
 *
 * @author maria 
 * @author anita
 */
public class FicheirosDeObjetos implements Serializable{
    private ObjectInputStream iS;
    private ObjectOutputStream oS;

    /**
     * Esta classe contem os metodos necessarios para abrir e ler e escrever no ficheiro de objetos
     * @return
     */    
    
    public boolean abreLeitura(String nomeDoFicheiro) {
        try {
            iS = new ObjectInputStream(new FileInputStream (nomeDoFicheiro));
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public void abreEscrita(String nomeDoFicheiro) throws IOException {
        oS = new ObjectOutputStream(new FileOutputStream (nomeDoFicheiro));
    }
    
    public Object leObjeto() throws IOException, ClassNotFoundException {
        return iS.readObject();
    }
    
    public void escreveObjeto(Object o) throws IOException {
        oS.writeObject(o);
    }
    
    public void fechaLeitura() throws IOException {
        iS.close();
    }
    public void fechaEscrita() throws IOException {
        oS.close();
    }
}

