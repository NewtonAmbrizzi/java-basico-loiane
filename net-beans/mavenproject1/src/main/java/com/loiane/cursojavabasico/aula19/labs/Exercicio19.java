/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[10];
        double[] notas1 = new double[alunos.length];
        double[] notas2 = new double[alunos.length];
        double[] results = new double[alunos.length];
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno:");
            alunos[i] = scanner.nextLine();
            System.out.println("Digite a nota do 1º bimestre");
            notas1[i] = scanner.nextDouble();
            System.out.println("Digite a nota do 2º bimestre");
            notas2[i] = scanner.nextDouble();
            scanner.nextLine();
            results[i] = (notas1[i] + notas2[i]) / 2;
            
        }
        
        System.out.println("/nResultado final:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i]);
            System.out.println("Nota 1º bimestre: " + notas1[i]);
            System.out.println("Nota 2º bimestre: " + notas2[i]);
            System.out.println("Média: " + results[i]);
            if (results[i] >= 7) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
            System.out.println("-----------------------------------");
        }
        
    }
    
}
