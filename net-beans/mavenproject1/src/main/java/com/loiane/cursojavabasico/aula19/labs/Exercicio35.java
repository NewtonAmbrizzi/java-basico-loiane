/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição " + i);
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            
            System.out.println("\nNumero - " + vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++) {
                
                if (vetorA[i] % j == 0 ) {
                    System.out.print(j + " | ");   
                }
            }
            
        }

    }
    
}
