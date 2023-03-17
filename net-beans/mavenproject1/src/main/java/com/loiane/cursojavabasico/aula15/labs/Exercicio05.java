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
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite a nota 1:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        
        if (nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0) {
            System.out.println("Média inválida, digite as notas novamente");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    
}
