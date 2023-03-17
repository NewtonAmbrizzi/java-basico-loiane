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
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double metros, centimetros;
        
        System.out.println("Digite quantos metros deseja converter em centímetros:");
        metros = scanner.nextDouble();
        centimetros = metros * 100;
        System.out.println(metros + "m corresponde a " + centimetros + "cm");
                

    }
    
}
