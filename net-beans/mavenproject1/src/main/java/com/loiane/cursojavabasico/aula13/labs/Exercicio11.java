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
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        double numero3;
        
        System.out.println("Digite dois números inteiro e um real separados por espaço:");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        numero3 = scanner.nextDouble();
        System.out.println("O produto do dobro do primeiro com metade do segundo número será: "
                            + ((numero1 * 2) * (numero2 / 2)));
        System.out.println("A soma do triplo do primeiro com o terceiro número será: "
                            + ((numero1 * 3) + numero3));
        System.out.println("O terceiro número elevado ao cubo será: " + (Math.pow(numero3, 3)));
        
        // Alternativa
        
        System.out.println("Digite um número inteiro:");
        numero1 = scanner.nextInt();
        System.out.println("Digite mais um número inteiro:");
        numero2 = scanner.nextInt();
        System.out.println("Digite um número real:");
        numero3 = scanner.nextDouble();
        System.out.println("O produto do dobro do primeiro com metade do segundo número será: "
                            + ((numero1 * 2) * (numero2 / 2)));
        System.out.println("A soma do triplo do primeiro com o terceiro número será: "
                            + ((numero1 * 3) + numero3));
        System.out.println("O terceiro número elevado ao cubo será: " + (Math.pow(numero3, 3)));
        
        
        
        
    }
    
}
