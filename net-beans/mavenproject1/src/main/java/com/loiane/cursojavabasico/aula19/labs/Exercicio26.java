/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author 13283
 */
public class Exercicio26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        System.out.println("Digite os valores do vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }
        
        System.out.println("\nDigite os valores do vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorB[i] = scanner.nextInt();
            
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }
        
        System.out.print("\nVetor A = ");
        for (int item : vetorA){
            System.out.print(item + " | ");
        }
        
        System.out.print("\nVetor B = ");
        for (int item : vetorB){
            System.out.print(item + " | ");
        }
        
        System.out.print("\nVetor C = ");
        for (int item : vetorC){
            System.out.print(item + " | ");
        }

    }
    
}
