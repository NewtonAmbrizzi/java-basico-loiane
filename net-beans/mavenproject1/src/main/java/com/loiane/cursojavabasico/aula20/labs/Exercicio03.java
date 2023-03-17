/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] valores = new int[3][3];
        
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                System.out.println("Digite o valor da linha " + i + " coluna " + j);
                valores[i][j] = scanner.nextInt();
            }
        }
        
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.print("\nColuna " + i + ": ");
            for (int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] + " | ");
                if (valores[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            
        }
        
        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
    }
    
}
