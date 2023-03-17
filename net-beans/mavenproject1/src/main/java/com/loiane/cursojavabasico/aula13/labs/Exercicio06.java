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
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double raio, diametro, area, perimetro;
        
        System.out.println("Informe o raio de um círculo:");
        raio = scanner.nextDouble();
        diametro = raio * 2;
        area = Math.PI * Math.pow(raio, 2);
        perimetro = (2 * Math.PI) * raio;
        
        System.out.println("Os valores referentes ao círculo de raio " + raio + " são:");
        System.out.println("Diametro: " + diametro);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
    
}
