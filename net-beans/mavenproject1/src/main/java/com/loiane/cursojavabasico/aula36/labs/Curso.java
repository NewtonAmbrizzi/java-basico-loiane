/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula36.labs;

/**
 *
 * @author Administrator
 */
public class Curso {
    
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public Aluno[] getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    public String obterInfo() {
        String info = "Nome do Curso: " + getNome() + "; " +
                "Horário: " + getHorario() + "\n";
        
        if (professor != null) {
            info += professor.obterInfo() + "\n";
        }
        
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                info += aluno.obterInfo() + "\n";
            }
            
            obterMediaTurma();
        }
        
        
        
        return info;
    }
    
    public double obterMediaTurma() {
        double soma = 0;
        for (int i = 0; i < alunos.length; i++) {
            soma += alunos[i].obterMedia();
        }
        double media = soma / alunos.length;
        return media;
    }
    
}
