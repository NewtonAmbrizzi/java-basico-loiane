/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio03;

/**
 *
 * @author Administrator
 */
public class Mamifero extends Animal {
    
     private String alimento;

    public Mamifero() {
        super();
        super.setAmbiente("Terra");
    }
     
     

    /**
     * @return the alimento
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nAlimento: " + getAlimento();
    }
    
}
