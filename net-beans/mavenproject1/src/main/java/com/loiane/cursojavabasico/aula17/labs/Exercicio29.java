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
public class Exercicio29 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        boolean primo;
        
        for (int i = 1; i <= numero; i++){
            
            primo = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    primo = false;
                } 

            }
            if (primo){
                System.out.println(i);
            }
        }

    }
    
}
