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
public class Exercicio32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para o cálculo de sua tabuada.");
            vetorA[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nTabuada do " + vetorA[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(vetorA[i] + " X " + j + " = " + (vetorA[i] * j));
            }
        }

    }
    
}
