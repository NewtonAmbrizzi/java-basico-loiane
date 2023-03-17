/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20;

/**
 *
 * @author Administrator
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] alunosNotas = new double[3][4];
        
        alunosNotas[0][0] = 10;
        alunosNotas[0][1] = 7;
        alunosNotas[0][2] = 9;
        alunosNotas[0][3] = 9.5;
        
        alunosNotas[1][0] = 9;
        alunosNotas[1][1] = 8;
        alunosNotas[1][2] = 7;
        alunosNotas[1][3] = 9;
        
        alunosNotas[2][0] = 8;
        alunosNotas[2][1] = 9;
        alunosNotas[2][2] = 10;
        alunosNotas[2][3] = 7;
        
        for (int i = 0; i < alunosNotas.length; i++) {
            for (int j = 0; j < alunosNotas[i].length; j++) {
                System.out.print(alunosNotas[i][j] + " | ");
            }
            System.out.println();
        }
                
        alunosNotas[1][3] = 8;
        
        System.out.println();
        for (int i = 0; i < alunosNotas.length; i++) {
            for (double nota : alunosNotas[i]) {
                System.out.print(nota + " | ");
            }
            System.out.println();
        }
        
        System.out.println("Calculando a média de cada aluno");
        
        double soma;
        for (int i = 0; i < alunosNotas.length; i++) {
            System.out.println("Notas do aluno " + (i+1));
            System.out.print("Notas: ");
            soma = 0;
            for (int j = 0; j < alunosNotas[i].length; j++) {
                System.out.print(alunosNotas[i][j] + " | ");
                soma += alunosNotas[i][j];
            }
            System.out.println("\nMédia: " + (soma / alunosNotas[i].length));
        }
        
        double[] notasAluno1 = {7, 8, 9 ,10};
        
        double[][] notasAlunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};
        
        for (int i = 0; i < notasAlunos2.length; i++) {
            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " | ");
            }
            System.out.println();
        }
        
    }
    
}
