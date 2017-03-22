/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

/**
 *
 * @author ricky_000
 */
public class Correo {
    private String mensaxe;
    private boolean lido=false;//false=non lido

    public String getMensaxe() {
        return mensaxe;
    }

    public void setMensaxe(String mensaxe) {
        this.mensaxe = mensaxe;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
        
    }

    public Correo() {
    }

    public Correo(String mensaxe, boolean lido) {
        this.mensaxe = mensaxe;
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Correo{" + "mensaje=" + mensaxe + ", leido=" + lido + '}';
    }
    
    
    
}