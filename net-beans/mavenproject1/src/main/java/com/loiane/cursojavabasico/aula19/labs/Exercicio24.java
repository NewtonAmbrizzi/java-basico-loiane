/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author 13283
 */
public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean palindromo = true;
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número da posição " + i);
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0, j = (numeros.length - 1); i < (numeros.length/2); i++, j--){
            if ( numeros[i] != numeros[j]){
                palindromo = false;
                System.out.println("O número na posição " + i + " é diferente do número na posição " + j);
                System.out.println("Vetor A não é um palindromo");
                break;
            }
        }
        
        if (palindromo){
            System.out.println("Vetor A é um palindromo");
        }
        
        System.out.print("Vetor A = ");
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        
        

    }
    
}
