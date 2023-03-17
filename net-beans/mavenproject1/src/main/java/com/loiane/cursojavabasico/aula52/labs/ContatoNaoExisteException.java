/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52.labs;

/**
 *
 * @author Administrator
 */
public class ContatoNaoExisteException extends Exception {
    
    private String nomeContato;
    private int idContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public ContatoNaoExisteException(int idContato) {
        this.idContato = idContato;
    }

    @Override
    public String getMessage() {
        if (nomeContato != null){
            return "Contato " + nomeContato + " não encontrado na agenda!";
        } else {
            return "Contato " + idContato + " não encontrado na agenda!";
        }
    }
    
    
    
}
