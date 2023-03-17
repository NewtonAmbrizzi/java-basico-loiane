/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio22 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int zero = 0;
        int um = 0;
        
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random() * 1);
            if (numeros[i] == 0) {
                zero++;
            } else {
                um++;
            }
        }
        
        System.out.print("Vetor A: ");
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        
        System.out.println("\nPercentual 0: " + (zero * 100 / numeros.length) + "%");
        System.out.println("Percentual 1: " + (um * 100 / numeros.length) + "%");
        
    }
    
}
