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
public class Exercicio02 {

    public static void main(String[] args) {

        int[][] valoresAleatorios = new int[10][10];
        Random valorAleatorio = new Random();
        int[][] minMaxLinhas = {{Integer.MAX_VALUE, Integer.MIN_VALUE},{Integer.MAX_VALUE, Integer.MIN_VALUE}};
      
        
        for (int i = 0; i < valoresAleatorios.length; i++) {
            System.out.print("Linha " + i + ": ");    
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = valorAleatorio.nextInt(100);
                System.out.print(valoresAleatorios[i][j] + " | ");
            }
            System.out.println();           
                
        }
        
        for (int i = 0; i < valoresAleatorios[5].length; i++) {
            if (valoresAleatorios[5][i] < minMaxLinhas[0][0]){
                minMaxLinhas[0][0] = valoresAleatorios[5][i];
            }
            if (valoresAleatorios[5][i] > minMaxLinhas[0][1]){
                minMaxLinhas[0][1] = valoresAleatorios[5][i];
            }
        }
        
        for (int i = 0; i < valoresAleatorios.length; i++) {
            if (valoresAleatorios[i][7] < minMaxLinhas[1][0]){
                minMaxLinhas[1][0] = valoresAleatorios[i][7];
            }
            if (valoresAleatorios[i][7] > minMaxLinhas[1][1]){
                minMaxLinhas[1][1] = valoresAleatorios[i][7];
            }
        }
 
        System.out.println("\nLinha 5");
        System.out.println("Menor: " + minMaxLinhas[0][0]);
        System.out.println("Maior: " + minMaxLinhas[0][1]);
        
        System.out.println("\nColuna 7");
        System.out.println("Menor: " + minMaxLinhas[1][0]);
        System.out.println("Maior: " + minMaxLinhas[1][1]);

    }
    
}
