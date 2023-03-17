/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52;

/**
 *
 * @author Administrator
 */
public class DivisaoNaoExata extends Exception {
    
    private int numero;
    private int denominador;

    public DivisaoNaoExata(int numero, int denominador) {
        super();
        this.numero = numero;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + numero + " / " + denominador + " não é um inteiro";
    }
    
    
    
    
}
