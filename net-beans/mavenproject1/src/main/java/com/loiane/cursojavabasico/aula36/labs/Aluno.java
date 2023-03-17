/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula36.labs;

/**
 *
 * @author Administrator
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public boolean isAprovado() {
        double soma = 0;
        for (int i = 0; i < getNotas().length; i++) {
            soma += getNotas()[i];
        }
        
        return (soma / getNotas().length) >= 7;
    }
    
    public double obterMedia() {
        double soma = 0;
        for (int i = 0; i < getNotas().length; i++) {
            soma += getNotas()[i];
        }
        double media = soma / getNotas().length;
        return media;
    }
    
    public String obterInfo() {
        String info = "Nome do Aluno: " + getNome() + "; " +
                "Matricula: " + getMatricula() + "; " +
                "\nNotas: ";
        for (Double nota :getNotas()) {
            info += nota + ", ";
        }
        if (isAprovado()) {
            info += "\nAprovado";
        } else {
            info += "\nReprovado";
        }
        
        return info;
    }
    
    
}
