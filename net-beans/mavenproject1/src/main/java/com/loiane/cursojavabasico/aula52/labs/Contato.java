/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52.labs;

/**
 *
 * @author Administrator
 */
public class Contato {
    
    private static int contadorId = 0;
    
    private String nome;
    private String telefone;
    private String email;
    private int id;

    public Contato() {
        contadorId++;
        id = contadorId;
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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the identificador
     */
    public int getId() {
        return id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                "\nNome: " + getNome() +
                "\nTelefone: " + getTelefone() +
                "\nE-mail: " + getEmail();
    }
    
    
    
}
