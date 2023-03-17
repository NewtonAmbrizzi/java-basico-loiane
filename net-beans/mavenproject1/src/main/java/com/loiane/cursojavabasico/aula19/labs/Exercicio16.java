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
public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaMenor = 0;
        int contaIgual = 0;
        int contaMaior = 0;
        int somaMaior = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] < 15) {
                somaMenor += vetorA[i];
            } else if (vetorA[i] == 15){
                contaIgual++;
            } else {
                somaMaior += vetorA[i];
                contaMaior++;
            }
            
        }
        
            
            System.out.print("Vetor A = ");
            for (int item : vetorA){
                System.out.print(item + " | ");
            }
            
            System.out.println("\nSoma de menores que 15: " + somaMenor);
            System.out.println("Iguais a 15: " + contaIgual);
            System.out.println("Média de maiores que 15: " + (somaMaior / contaMaior));

    }
    
}
