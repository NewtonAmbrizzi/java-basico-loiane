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
public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        String conceito = "";
        
        System.out.println("Digite a nota 1:");        
        nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 1:");        
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        
        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media < 9 && media >= 7.5) {
            conceito = "B";
        } else if (media < 7.5 && media >= 6) {
            conceito = "C";
        } else if (media < 6 && media >= 4) {
            conceito = "D";
        } else if (media < 4 && media >= 0) {
            conceito = "E";
        }
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        
        switch(conceito){
            case "A":
            case "B":
            case "C": System.out.println("APROVADO"); break;
            case "D":
            case "E": System.out.println("REPROVADO"); break;
            default: System.out.println("Entrada inválida");
        }
        
    }
    
}
