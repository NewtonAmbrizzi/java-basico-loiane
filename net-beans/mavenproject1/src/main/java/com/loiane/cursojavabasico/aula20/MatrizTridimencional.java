/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20;

/**
 *
 * @author Administrator
 */
public class MatrizTridimencional {

    public static void main(String[] args) {

        int[][][] matrizTridimencional = new int[3][3][3];
        
        for (int i = 0; i < matrizTridimencional.length; i++){
            
            for (int j = 0; j < matrizTridimencional[i].length; j++) {
                
                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    
                    matrizTridimencional[i][j][k] = i + j + k;
                    
                }
            }
        }
        
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimencional.length; i++){
            
            for (int j = 0; j < matrizTridimencional[i].length; j++) {
                
                for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
                    
                    soma += matrizTridimencional[i][j][k];
                    
                    if (matrizTridimencional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimencional[i][j][k];
                    } else {
                        somaImpares += matrizTridimencional[i][j][k];
                        System.out.println("(i = " + i + " + j = " + j + " + k = " + k + "} = " + matrizTridimencional[i][j][k]);
                    }
                    
                }
            }
        }
        
        System.out.println("soma total = " + soma);
        System.out.println("soma pares = " + somaPares);
        System.out.println("soma impares = " + somaImpares);

    }
    
}
