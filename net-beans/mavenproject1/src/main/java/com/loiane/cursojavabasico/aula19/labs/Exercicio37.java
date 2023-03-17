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
public class Exercicio37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição " + i);
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
           
            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
            
        }
        
        System.out.print("\nVetor A: ");
        for (int numero : vetorA) {
            System.out.print(numero + " | ");
        }
        
        System.out.print("\nVetor B: ");
        for (int numero : vetorB) {
            System.out.print(numero + " | ");
        }

    }
    
}
