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
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor para a posição " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * i;
        }
        
        System.out.print("Vetor A = ");
        for (int item : vetorA) {
            System.out.print(item + " ");
        }
        
        System.out.print("\nVetor B = ");
        for (int item : vetorB) {
            System.out.print(item + " ");
        }
    }
    
}
