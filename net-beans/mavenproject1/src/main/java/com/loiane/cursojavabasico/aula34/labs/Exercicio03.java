/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula34.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        
        do{
            System.out.println("Digite um número positivo");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("Número inválido, tente novamente");
            }
        } while (num < 0);
        
        System.out.println(Calculadora.fatorial(num));
        
    }
    
}
