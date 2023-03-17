/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int turmas, alunos, soma = 0;
        double media;
        boolean valida = false;

        System.out.println("Digite o número de turmas:");
        turmas = scanner.nextInt();
        
        for (int i = 1; i <= turmas; i++) {
            valida = false;
            do {
                System.out.println("Digite o número de alunos da turma " + i);
                alunos = scanner.nextInt();
                if (alunos >= 0 && alunos <= 40){
                    valida = true;
                } else {
                    System.out.println("A turma deve ter menos de 40 alunos");
                }
            } while (!valida);
            soma += alunos;
        }
        
        media = soma/turmas;
        
        System.out.println("Media de alunos por turma é: " + media);
        
    }
    
}
