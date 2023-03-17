/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double altura, pesoIdeal;
        
        System.out.println("Informe sua altura para que seu peso ideal seja calculado:");
        altura = scanner.nextDouble();
        pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("O seu peso ideal é: " + pesoIdeal);

    }
    
}
