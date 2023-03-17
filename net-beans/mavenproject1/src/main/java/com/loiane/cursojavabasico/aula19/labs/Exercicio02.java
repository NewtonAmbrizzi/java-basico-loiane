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
public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor para a posição " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        
        
    }
    
}
