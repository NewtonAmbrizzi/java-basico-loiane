/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio03;

/**
 *
 * @author Administrator
 */
public class Animal {
    
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.patas = 4;
    }
    
    

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
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the patas
     */
    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        String s = "Animal: " + getNome() +
                "\nComprimento: " + getComprimento() + " cm" +
                "\nPatas: " + getPatas() +
                "\nCor: " + getCor() +
                "\nAmbiente: " + getAmbiente() + 
                "\nVelocidade: " + getVelocidade() + " m/s";
        return s;
    }
    
    
    
}
