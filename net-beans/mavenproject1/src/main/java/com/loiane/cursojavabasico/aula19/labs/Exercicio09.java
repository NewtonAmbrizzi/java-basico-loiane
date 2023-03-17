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
public class Exercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor para a posição " + i +" do vetor A");
            vetorA[i] = scanner.nextInt();
            System.out.println("Digite o " + (i + 1) + " valor para a posição " + i +" do vetor B");
            vetorB[i] = scanner.nextInt();
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        
        System.out.print("Vetor A = ");
        for (int item : vetorA){
            System.out.print(item + " ");
        }
        
        System.out.print("\nVetor B = ");
        for (int item : vetorB){
            System.out.print(item + " ");
        }
        
        DecimalFormat decimal = new DecimalFormat("###,###.##");
        
        System.out.print("\nVetor C = ");
        for (double item : vetorC){
            System.out.print(item + " ");
        }
    }
    
}
