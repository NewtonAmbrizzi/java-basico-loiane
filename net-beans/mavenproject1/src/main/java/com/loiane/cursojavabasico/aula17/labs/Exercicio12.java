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
public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean validaNum = false;
        
        do {
            System.out.println("Digite um número entre 1 e 10");
            numero = scanner.nextInt();
            if (numero > 0 && numero <= 10){
                validaNum = true;
            } else {
                System.out.println("O número deverá ser entre 1 e 10");
            }
        } while (!validaNum);
        
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        
    }
    
}
