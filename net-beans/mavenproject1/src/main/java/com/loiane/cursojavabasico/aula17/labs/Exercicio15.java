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
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int n;
        int aux;
        
        System.out.println("Digite o n-ésimo termo da serie de fibonacci:");
        n = scanner.nextInt();
        
        System.out.print(num1 + ", " + num2);
        for (int i = 2; i < n; i++) {
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
            System.out.print(", " + aux);
        }
        

    }
    
}
