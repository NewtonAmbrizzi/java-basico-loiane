/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

/**
 *
 * @author Administrator
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }
        
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @return the nomeDisciplinas
     */
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the notasDisciplinas
     */
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    /**
     * @param notasDisciplinas the notasDisciplinas to set
     */
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNomeDisciplinas(int i, String disciplina) {
        this.getNomeDisciplinas()[i] = disciplina;
    }

    public void setNotasDisciplinas(int i, int j, double nota) {
        this.getNotasDisciplinas()[i][j] = nota;
    }

    public String getNomeDisciplinas(int i) {
        return getNomeDisciplinas()[i];
    }

    public double getNotasDisciplinas(int i, int j) {
        return getNotasDisciplinas()[i][j];
    }

    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome do Curso: " + getCurso());

        for (int i = 0; i < getNotasDisciplinas().length; i++) {
            System.out.println("Notas da disciplina " + getNomeDisciplinas(i));
            for (int j = 0; j < getNotasDisciplinas()[i].length; j++) {
                System.out.print(getNotasDisciplinas(i, j) + "; ");
            }
            System.out.println();
        }
    }
    
    public boolean verificaAprovado(int index) {
        
        double soma = 0;
        double media = 0;
        
        for (int i = 0; i < getNotasDisciplinas()[index].length; i++) {
            soma += getNotasDisciplinas(index, i);
        }
        
        media = soma / getNotasDisciplinas()[index].length;
        
        return media >= 7;
    }

    
    
}
