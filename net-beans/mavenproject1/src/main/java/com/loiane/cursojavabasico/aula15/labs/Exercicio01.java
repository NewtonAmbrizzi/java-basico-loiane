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
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        
        System.out.println("Digite um número:");
        numero1 = scanner.nextDouble();
        System.out.println("Digite outro número:");
        numero2 = scanner.nextDouble();
        
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (numero1 == numero2) {
            System.out.println("Os dois números são iguais");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
    
}
