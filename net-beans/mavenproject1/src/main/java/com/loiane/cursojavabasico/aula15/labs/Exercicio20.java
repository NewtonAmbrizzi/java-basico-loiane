/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[5];
        int contador = 0;
        
        System.out.println("Responda somente com S para sim e N para não:");
        System.out.println("Telefonou para a vítima?");
        respostas[0] = scanner.next();
        System.out.println("Esteve no local do crime?");
        respostas[1] = scanner.next();
        System.out.println("Mora perto da vítima?");
        respostas[2] = scanner.next();
        System.out.println("Devia para a vítima?");
        respostas[3] = scanner.next();
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = scanner.next();
        
        for (String resposta : respostas) {
            if (resposta.equalsIgnoreCase("s")) {
                contador++;
            }
        }
        
        if (contador == 5) {
            System.out.println("Assassino");
        } else if (contador == 4 || contador == 3) {
            System.out.println("Cúmplice");
        } else if (contador == 2) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }
    
}
