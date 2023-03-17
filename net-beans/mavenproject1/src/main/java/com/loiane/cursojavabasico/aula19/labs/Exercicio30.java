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
public class Exercicio30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[20];
        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        
        int[] vetorB = new int[par];
        int[] vetorC = new int[impar];
        par = 0;
        impar = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0){
                vetorB[par] = vetorA[i];
                par++;
            } else {
                vetorC[impar] = vetorA[i];
                impar++;
            }
        }
        
        System.out.print("\nVetor A = ");
        for (int item : vetorA) {
            System.out.print(item + " | ");
        }
        
        System.out.print("\nVetor B = ");
        for (int item : vetorB) {
            System.out.print(item + " | ");
        }
        
        System.out.print("\nVetor C = ");
        for (int item : vetorC) {
            System.out.print(item + " | ");
        }

    }
    
}
