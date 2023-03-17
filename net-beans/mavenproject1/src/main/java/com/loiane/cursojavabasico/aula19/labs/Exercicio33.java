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
public class Exercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um número para a posição " + i);
            vetorA[i] = scanner.nextInt();
        }
        
        boolean primo;
        for (int i = 0; i < vetorA.length; i++) {
            
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;   
                }
            }
            if (!primo) {
                System.out.println(vetorA[i] + " não é um número primo");
            } else {
                System.out.println(vetorA[i] + " é um número primo");
            }
        }
    }
    
}
