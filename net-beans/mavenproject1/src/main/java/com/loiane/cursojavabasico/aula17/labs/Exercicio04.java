/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio04 {

    public static void main(String[] args) {
        
        int contAno = 0;
        int popA = 80000;
        int popB = 200000;
        
        System.out.println("Usando while\n");
        
        while (popA < popB) {
            popA *= 1.03;
            popB *= 1.015;
            contAno++;
        }
        
        System.out.println("População paisA: " + popA);
        System.out.println("População paisB: " + popB);
        System.out.println("Quantidade de Anos: " + contAno);
        
        
        // Resolução com for
        
        System.out.println("\nUsando for\n");

        contAno = 0;
        for (int paisA = 80000, paisB = 200000; paisB > paisA; paisA *= 1.03, paisB *= 1.015) {
            contAno++;
        }
        
        System.out.println("População paisA: " + popA);
        System.out.println("População paisB: " + popB);
        System.out.println("Quantidade de Anos: " + contAno);

    }
    
}
