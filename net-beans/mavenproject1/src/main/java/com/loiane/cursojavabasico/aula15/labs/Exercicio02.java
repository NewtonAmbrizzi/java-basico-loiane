/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Didite um número inteiro:");
        numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if ( numero == 0) {
            System.out.println("O número digitado é igual a 0");
        } else {
            System.out.println("O número digitado é negativo");
        }

    }
    
}
