/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, resultado;
        
        System.out.println("Digite dois números inteiros separados por espaço:");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        resultado = numero1 + numero2;
        System.out.println("A soma dos números digitados é: " + resultado);
        
        // Alternativa
        
        System.out.println("Digite o primeiro número inteiro:");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        numero2 = scanner.nextInt();
        resultado = numero1 + numero2;
        System.out.println("A soma dos números digitados é: " + resultado);
    }
    
}
