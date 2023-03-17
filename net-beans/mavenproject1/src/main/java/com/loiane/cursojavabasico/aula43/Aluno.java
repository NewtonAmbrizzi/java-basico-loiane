/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43;

/**
 *
 * @author Administrator
 */
public class Aluno {
    
    private String curso;
    private double[] notas;

    public Aluno() {
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        return 0;
    }
    
    public boolean isAproved() {
        return true;
    }

    @Override
    public String toString() {
        String s = curso + "\n";
        for (double nota:notas) {
            s += nota + " | ";
        }
        return s;
    }
    
    
    
}
