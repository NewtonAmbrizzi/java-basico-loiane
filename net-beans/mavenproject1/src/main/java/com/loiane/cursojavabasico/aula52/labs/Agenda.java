/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52.labs;

/**
 *
 * @author Administrator
 */
public class Agenda {
    
    private Contato[] contatos;
    private static int contador = 0;

    public Agenda() {
        contatos = new Contato[5];
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos) {
            s += contato.toString() + "\n-----------------------------\n";
        }
        return s;
    }
    
    
    public void AdicionarContato(Contato contato) throws AgendaCheiaException{
        
        if (this.contatos.length > this.contador) {
            this.contatos[this.contador] = contato;
            contador++;
        } else {
            throw new AgendaCheiaException();
        }
        
    }
    
    public String consultaContato(String nome) throws ContatoNaoExisteException {
        for (Contato contato : contatos) {
            if (contato != null) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    return "Contato Encontrado!\n" + contato.toString();
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }
    
    public String consultaContato(int id) throws ContatoNaoExisteException {
        for (Contato contato : contatos) {
            if (contato != null) {
                if (contato.getId() == id) {
                    return "Contato Encontrado!\n" + contato.toString();
                }
            }
        }
        throw new ContatoNaoExisteException(id);
    }
    
}
