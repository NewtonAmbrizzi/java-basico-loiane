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
public class Exercicio29 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];
        
        for (int i = 0; i < vetorC.length; i++){
            if (i < 10) {
                System.out.println("Entre com o valor a ser incluído no vetor A na posição " + i);
                vetorA[i] = scanner.nextInt();
                vetorC[i] = vetorA[i];
            } else {
                System.out.println("Entre com o valor a ser incluído no vetor B na posição " + (i - 10));
                vetorB[i - 10] = scanner.nextInt();
                vetorC[i] = vetorB[i - 10];
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
