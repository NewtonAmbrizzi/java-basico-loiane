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
public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double delta, x1, x2;
        int a, b, c;
        
        System.out.println("Informe o valor de A:");
        a = scanner.nextInt();
        System.out.println("Informe o valor de B:");
        b = scanner.nextInt();
        System.out.println("Informe o valor de C:");
        c = scanner.nextInt();
        
        if (a == 0){
            System.out.println("Não é uma equação de 2º grau.");
        } else {
            delta = Math.pow(b, 2) - 4*a*c;
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("A equação não possui raizes reais");
            } else if (delta == 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui apenas uma raiz real: " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
    
}
