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
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    
        int[] vetorA = new int[10];
        int soma = 0;
        int contador = 0;
        double media;
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                contador++;
            }
        }
        
        media = soma / contador;
        
        System.out.print("Vetor A = ");
        
        for (int item : vetorA){
            System.out.print(item + " | ");
        }
        
        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        
    }
    
}
