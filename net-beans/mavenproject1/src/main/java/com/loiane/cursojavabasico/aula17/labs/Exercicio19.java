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
public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeNotas;
        double totalNotas = 0;
        
        System.out.println("Quantas notas serão inseridas?");
        quantidadeNotas = scanner.nextInt();
        
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Digite a " + i + "ª nota:");
            totalNotas += scanner.nextDouble();
        }
        
        System.out.println("Soma: " + totalNotas);
        System.out.println("Média: " + totalNotas/quantidadeNotas);

    }
    
}
