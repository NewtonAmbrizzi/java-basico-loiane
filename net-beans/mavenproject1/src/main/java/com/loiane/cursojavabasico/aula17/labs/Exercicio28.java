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
public class Exercicio28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean primo = true;
        
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();
                
        for (int i = 2; i < numero; i ++) {
            if (numero % i == 0){
                System.out.println("Não é número primo");
                primo = false;
                break;
            } 
                
        }
        if (primo){
            System.out.println("Número primo");
        }
    }
    
}
