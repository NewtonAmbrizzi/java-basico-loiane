/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula43;

/**
 *
 * @author Administrator
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        
        aluno.setCurso("Ciências da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);
        
        System.out.println(aluno);

    }
    
}
