/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Samuel David Ortiz
 */
public class arbolAVL {
    private int dato;
    private int fe;
    
    private arbolAVL hijoIz;
    private arbolAVL hijoDer;
    
    public arbolAVL(int d){
        this.setDato(d);
        this.setFe(0);
        this.setHijoDer(null);
        this.setHijoIz(null);
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the fe
     */
    public int getFe() {
        return fe;
    }

    /**
     * @param fe the fe to set
     */
    public void setFe(int fe) {
        this.fe = fe;
    }

    /**
     * @return the hijoIz
     */
    public arbolAVL getHijoIz() {
        return hijoIz;
    }

    /**
     * @param hijoIz the hijoIz to set
     */
    public void setHijoIz(arbolAVL hijoIz) {
        this.hijoIz = hijoIz;
    }

    /**
     * @return the hijoDer
     */
    public arbolAVL getHijoDer() {
        return hijoDer;
    }

    /**
     * @param hijoDer the hijoDer to set
     */
    public void setHijoDer(arbolAVL hijoDer) {
        this.hijoDer = hijoDer;
    }
}
