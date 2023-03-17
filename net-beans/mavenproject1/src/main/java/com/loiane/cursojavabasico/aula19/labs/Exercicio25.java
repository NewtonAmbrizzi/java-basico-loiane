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
public class Exercicio25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int item : vetorA) {
            System.out.print(item + " | ");
        }
        
        System.out.print("\nVetor B = ");
        for (int item : vetorB) {
            System.out.print(item + " | ");
        }

    }
    
}
