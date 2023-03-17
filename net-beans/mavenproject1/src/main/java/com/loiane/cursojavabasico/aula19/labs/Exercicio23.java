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
public class Exercicio23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("O número " + numeros[i] + " na posição " + i + " do vetor não é par");
                break;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        
    }
    
}
