/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula27.labs;

/**
 *
 * @author Administrator
 */
public class Aluno {

    String nome, matricula, curso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNomeDisciplinas(int i, String disciplina) {
        this.nomeDisciplinas[i] = disciplina;
    }

    public void setNotasDisciplinas(int i, int j, double nota) {
        this.notasDisciplinas[i][j] = nota;
    }

    public String getNomeDisciplinas(int i) {
        return nomeDisciplinas[i];
    }

    public double getNotasDisciplinas(int i, int j) {
        return notasDisciplinas[i][j];
    }

    void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome do Curso: " + curso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + getNomeDisciplinas(i));
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(getNotasDisciplinas(i, j) + "; ");
            }
            System.out.println();
        }
    }
    
    boolean verificaAprovado(int index) {
        
        double soma = 0;
        double media = 0;
        
        for (int i = 0; i < notasDisciplinas[index].length; i++) {
            soma += getNotasDisciplinas(index, i);
        }
        
        media = soma / notasDisciplinas[index].length;
        
        if (media >= 7) {
            return true;
        }
        
        return false;
    }

}
