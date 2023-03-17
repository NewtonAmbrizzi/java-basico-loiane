/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20.labs;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Exercicio01 {

    public static void main(String[] args) {

        int[][] valoresAleatorios = new int[4][4];
        
        Random numeroAleatorio = new Random();
        
        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = numeroAleatorio.nextInt(0, 101);
            }
        }
        
        int maior = valoresAleatorios[0][0];
        int linha = 0;
        int coluna = 0;
        
        for (int i = 0; i < valoresAleatorios.length; i++) {
            System.out.print("\nLinha " + i + ": ");
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                System.out.print(valoresAleatorios[i][j] + " - ");
                if (valoresAleatorios[i][j] > maior) {
                    maior = valoresAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        System.out.println("\nO maior número gerado foi " + maior + " na linha " + linha + " coluna " + coluna);

    }
    
}
