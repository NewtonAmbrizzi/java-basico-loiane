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
public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double numero;
        double maior =Double.MIN_VALUE;
           
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Digite um número");
            numero = scanner.nextDouble();
            if (numero > maior){
                maior = numero;
            }
        }
        
        System.out.println("O maior número digitado foi: " + maior);
    }
    
}
