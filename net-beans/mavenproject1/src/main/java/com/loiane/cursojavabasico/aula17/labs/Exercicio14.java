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
public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, par = 0, impar = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);

    }
    
}
