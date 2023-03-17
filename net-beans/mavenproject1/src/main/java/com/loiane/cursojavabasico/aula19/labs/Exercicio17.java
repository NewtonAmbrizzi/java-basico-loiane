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
public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int contador = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Ditie o valor da posição " + (i+1));
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] > 35){
                contador++;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int item : vetorA){
            System.out.print(item + " | ");
        }
        
        System.out.println("\nMaiores de 35 anos: " + contador);

    }
    
}
