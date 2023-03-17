/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula35;

/**
 *
 * @author Administrator
 */
public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialNR);
        
        int fatorialR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialR);

    }
    
}
