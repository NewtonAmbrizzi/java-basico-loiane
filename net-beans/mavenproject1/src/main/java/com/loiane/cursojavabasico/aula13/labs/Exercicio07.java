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
public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double lado, area;
        
        System.out.println("Digite o valor do lado de um quadrado:");
        lado = scanner.nextDouble();
        area = Math.pow(lado, 2);
        System.out.println("O valor da área do quadrado é " + area + " e de seu dobro é " + (2 * area));

    }
    
}
