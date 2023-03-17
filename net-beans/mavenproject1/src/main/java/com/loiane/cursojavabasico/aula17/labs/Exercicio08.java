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
public class Exercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double numero;
        double soma = 0;
        double media;
           
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Digite um número");
            numero = scanner.nextDouble();
            soma += numero;
        }
        
        media = soma / 5;
        
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);
    }
    
}
