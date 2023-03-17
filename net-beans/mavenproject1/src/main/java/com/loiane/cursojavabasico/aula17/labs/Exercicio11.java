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
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, soma = 0;
        
        System.out.println("Digite o 1º número");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o 2º número");
        num2 = scanner.nextInt();
            
        if (num2 > num1){
            for (int i = num1; i <= num2; i++){
                soma += i;
            }
        } else {
            for (int i = num2; i <= num1; i++){
                soma += i;
            }
        }    
    System.out.println(soma);
    }
    
}
