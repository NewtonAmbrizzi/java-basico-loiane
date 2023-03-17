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
public class Exercicio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, resultado;
         System.out.println("Digite o 1º número");
         numero1 = scanner.nextInt();
         System.out.println("Digite o 2º número");
         numero2 = scanner.nextInt();
         
        resultado = numero1;
        for (int i = 1; i < numero2; i++){
            resultado *= numero1; 
        } 
        
        System.out.println(numero1 + " ^ " + numero2 + " = " + resultado);
    }
    
}
