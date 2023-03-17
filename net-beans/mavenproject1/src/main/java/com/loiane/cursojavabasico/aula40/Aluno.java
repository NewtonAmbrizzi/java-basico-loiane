/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula40;

/**
 *
 * @author Administrator
 */
public class Aluno extends Pessoa {
    
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
    public String obterEtiquetaEndereco() {
        String info = "Endereço do Aluno: ";
        info += super.obterEtiquetaEndereco();
        return info;
    }
    
}
