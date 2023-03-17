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
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        System.out.println("Digite o primeiro número");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        numero3 = scanner.nextInt();
        
        if (numero1 == numero2 && numero1 == numero3){
            System.out.println("Todos os números são iguais");
        } else if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O número 1 é o maior dos 3 números digitados.");

        } else if (numero1 < numero2 && numero2 > numero3){
            System.out.println("O número 2 é o maior dos 3 números digitados.");
        } else {
            System.out.println("O número 3 é o maior dos 3 números digitados.");
        }
        
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Número 3: " + numero3);
    }
    
}
