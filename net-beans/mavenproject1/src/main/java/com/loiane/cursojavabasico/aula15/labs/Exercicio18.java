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
public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número");
        numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");    
        }

    }
    
}
