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
public class Exercicio27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        char[] letras = new char[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número para a posição " + i);
            numeros[i] = scanner.nextInt();
            if (numeros[i] < 7){
                letras[i] = 'a';
            } else if (numeros[i] == 7) {
                letras[i] = 'b';
            } else if (numeros[i] < 10) {
                letras[i] = 'c';
            } else if (numeros[i] == 10) {
                letras[i] = 'd';
            } else {
                letras[i] = 'e';
            }
        }
        
        System.out.print("\nVetor A: ");
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        
        System.out.print("\nVetor B: ");
        for (char letra : letras) {
            System.out.print(letra + " | ");
        }

    }
    
}
