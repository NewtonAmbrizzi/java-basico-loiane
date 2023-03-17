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
public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double farenheit, celsius;
        
        System.out.println("Digite a temperatura em graus celsius:");
        celsius = scanner.nextDouble();
        farenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " equivalem a " + farenheit + " graus farenheit");

    }
    
}
