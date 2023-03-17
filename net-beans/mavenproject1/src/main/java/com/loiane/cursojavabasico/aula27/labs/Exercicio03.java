/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula27.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno.setNome(scan.next());
        System.out.println("Digite a matrícula do aluno:");
        aluno.setMatricula(scan.next());
        System.out.println("Digite o nome do curso:");
        aluno.setCurso(scan.next());

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Digite o nome da disciplina " + (i + 1));
            aluno.setNomeDisciplinas(i, scan.next());
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Disciplina de " + aluno.getNomeDisciplinas(i));
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Digite a nota do " + (j + 1) + "º bimestre");
                aluno.setNotasDisciplinas(i, j, scan.nextDouble());
            }
        }
        
        aluno.mostraInfo();
        
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println(aluno.getNomeDisciplinas(i) + ": " + (aluno.verificaAprovado(i) ? "Aprovado" : "Reprovado"));
        }

    }

}
