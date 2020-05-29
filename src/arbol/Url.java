/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.LinkedList;

/**
 *
 * @author Juan Pablo Castro
 */
public class Url implements Comparable<Url> {
    private String url;
    private LinkedList<String> palabrasClaves = new LinkedList<>();

    
    /**
     * Metodo Contructor de la clase Url
     * @param url   hace referencia al url 
     * @param pClaves Hace referencia a la lista de palabras claves de la Url 
     */
    public Url (String url, LinkedList<String> pClaves){
        this.url = url;
        this.palabrasClaves=pClaves;
    }
    
    
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the palabrasClaves
     */
    public LinkedList<String> getpalabrasClaves() {
        return palabrasClaves;
    }

    /**
     * @param pClaves
     */
    public void setpalabrasClaves(LinkedList<String> pClaves) {
        this.palabrasClaves = pClaves;
    }
    
    @Override
    public int compareTo(Url o) {
        return url.compareTo(o.getUrl());
    }
    
  
      @Override
    public String toString() {
        return url + " ";
    }
            
    
    
}


