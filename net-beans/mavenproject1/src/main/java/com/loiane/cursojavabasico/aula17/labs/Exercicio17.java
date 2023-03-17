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
public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, fatorial;
        
        System.out.println("Digite um número:");
        numero = scanner.nextInt();
        fatorial = 1;
        
        System.out.print(numero + "! = ");
        for (; numero > 0; numero--){
            System.out.print(numero + " x ");
            fatorial *= numero; 
        }
        System.out.print("= " + fatorial);
    }
    
}
