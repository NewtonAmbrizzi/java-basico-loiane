/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula41;

/**
 *
 * @author Administrator
 */
public class Professor extends Pessoa {
    
    
    private double salario;
    private String nomeCurso;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public double calcularSalarioLiquido() {
        return 0;
    }
    
    @Override
    public String obterEtiquetaEndereco() {
        String info = "Endereço do Professor: ";
        info += super.getEndereco();
        return info;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo etiqueta do professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
}
