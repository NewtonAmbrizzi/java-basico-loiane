/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula18;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BreakEContinue {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int numero, limite;
//        
//        System.out.println("Entre com um número");
//        numero = scanner.nextInt();
//        
//        System.out.println("Entre com um limite");
//        limite = scanner.nextInt();
//        
//        for (int i = numero; i <= limite; i++) {
//            
//            if (i % 7 == 0){
//                System.out.println("O valor de i é: " + i);
//                break;
//            }
//            
//        }

        Scanner scanner = new Scanner(System.in);
        int numero, limite;
        
        System.out.println("Entre com um número");
        numero = scanner.nextInt();
        
        System.out.println("Entre com um limite");
        limite = scanner.nextInt();
        
        for (int i = numero; i <= limite; i++) {
            
            if (i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
        
        

    }
    
}
