/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio03;

/**
 *
 * @author Administrator
 */
public class Peixe extends Animal {
    
    private String carcteristicas;

    public Peixe() {
        super();
        super.setPatas(0);
        super.setAmbiente("Mar");
        super.setCor("Cinzenta");
        this.carcteristicas = "Barbatanas e cauda";
    }
    
    

    /**
     * @return the carcteristicas
     */
    public String getCarcteristicas() {
        return carcteristicas;
    }

    /**
     * @param carcteristicas the carcteristicas to set
     */
    public void setCarcteristicas(String carcteristicas) {
        this.carcteristicas = carcteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCaracterística: " + getCarcteristicas();
    }
    
    
    
}
