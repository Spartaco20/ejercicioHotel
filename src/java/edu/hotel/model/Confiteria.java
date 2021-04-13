/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hotel.model;

/**
 *
 * @author HP
 */
public class Confiteria {
    
    private String desayuno = "";
    private String bebida = "";

    public Confiteria() {
    }

    public Confiteria(String desayuno, String bebida) {
        this.desayuno = desayuno;
        this.bebida = bebida;
    }

    public void registrarConfiteria() {
        
    }
    
    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    
}
