/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula36.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso:");
        String nome = scan.nextLine();

        System.out.println("Entre com o horário do curso:");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor:");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o departamento do professor:");
        String departamento = scan.nextLine();

        System.out.println("Entre com o e-mail do professor:");
        String email = scan.nextLine();

        Curso curso = new Curso();

        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamento);
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("\n----Alunos----");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Entre com o nome do aluno: " + (i + 1));
            String nomeAluno = scan.nextLine();
            
            System.out.println("Entre com a matricula do aluno: " + (i + 1));
            String matAluno = scan.nextLine();
            
            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Entre com a nota " + (j + 1) + " do aluno " + (i + 1));
                notas[j] = scan.nextDouble();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
            
            scan.nextLine();

        }
        
        curso.setAlunos(alunos);
        
    
        System.out.println(curso.obterInfo());
       

    }

}
