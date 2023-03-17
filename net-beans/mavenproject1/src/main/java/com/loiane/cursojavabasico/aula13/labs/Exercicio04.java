/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1 ,nota2, nota3, nota4, mediaFinal;
        
        System.out.println("Digite as quatro notas bimestrais:");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        nota4 = scanner.nextDouble();
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas bimestrais é: " + mediaFinal);
        
        // Alternativa
        
        System.out.println("Digite as 1º nota bimestral:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite as 2º nota bimestral:");
        nota2 = scanner.nextDouble();
        System.out.println("Digite as 3º nota bimestral:");
        nota3 = scanner.nextDouble();
        System.out.println("Digite as 4º nota bimestral:");
        nota4 = scanner.nextDouble();
        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas bimestrais é: " + mediaFinal);
        
    }
    
}
