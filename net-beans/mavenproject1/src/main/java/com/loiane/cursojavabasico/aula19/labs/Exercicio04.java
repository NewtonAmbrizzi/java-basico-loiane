/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor para a posição " + i);
            vetorA[i] = scanner.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        DecimalFormat decimal = new DecimalFormat("###,###.###");
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(decimal.format(vetorB[i]) + " ");
        }
        
    }
    
}
