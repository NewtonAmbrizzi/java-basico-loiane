/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula40;

/**
 *
 * @author Administrator
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa professor = new Professor();
        Pessoa aluno = new Aluno();
        
        pessoa.setEndereco("Rua 1, nº 1");
        aluno.setEndereco("Rua 2, nº 2");
        professor.setEndereco("Rua 3, nº 3");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

    }
    
}
