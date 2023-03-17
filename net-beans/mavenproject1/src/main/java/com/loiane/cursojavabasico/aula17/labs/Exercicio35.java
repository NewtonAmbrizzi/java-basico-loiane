/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio35 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int n;
        double soma = 0;
        
        System.out.println("Digite o valor de n:");
        n = scanner.nextInt();
        
        for (int i = 1, j = 1; i <= n; i++, j+=2) {
            System.out.print(i + "/" + j + " + ");
            soma += i/j;
        }
        
        System.out.println("\nSoma = " + soma);

    }
    
}
