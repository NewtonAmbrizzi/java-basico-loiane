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
public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        String operacao;
        double resultado = 0;
        
        System.out.println("Digite o 1º número");
        numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número");
        numero2 = scanner.nextInt();
        System.out.println("Digite a operação que deseja realizar: +(soma), -(subtração), *(multiplicação), /(divisão)");
        operacao = scanner.next();
        
        switch(operacao){
            case "+": resultado = numero1 + numero2; break;
            case "-": resultado = numero1 - numero2; break;
            case "*": resultado = numero1 * numero2; break;
            case "/": resultado = numero1 / numero2; break;
            default: System.out.println("Operação inválida");
        }
        
        System.out.println("O resultado é: " + resultado);
        if (resultado % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        if (resultado < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
    
}
