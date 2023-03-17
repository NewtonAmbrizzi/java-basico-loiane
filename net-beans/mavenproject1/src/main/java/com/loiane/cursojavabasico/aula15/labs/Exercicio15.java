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
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double lado1, lado2, lado3;
       
        System.out.println("Digite o lado 1 de um triângulo:");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o lado 2 de um triângulo:");
        lado2 = scanner.nextDouble();
        System.out.println("Digite o lado 3 de um triângulo:");
        lado3 = scanner.nextDouble();
        
        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado2 != lado3) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
    
}
