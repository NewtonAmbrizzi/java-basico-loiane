/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MatrizIrregular {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numEntrevistados;
        
        System.out.println("Entre com o número de pessoas que serão entrevistadas:");
        numEntrevistados = scanner.nextInt();
        
        String[][] nomesFilhos = new String[numEntrevistados][];
        
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            int quantidadeFilhos = scanner.nextInt();
            
            nomesFilhos[i] = new String[quantidadeFilhos];
            
                for (int j = 0; j < nomesFilhos[i].length; j++) {
                    System.out.println("Entre com o nome do filho " + (j + 1) );
                    nomesFilhos[i][j] = scanner.next();
                }
        }
        
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " Filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Filho " + (j + 1) + ": " + nomesFilhos[i][j]);
            }
        }
    }
    
}
