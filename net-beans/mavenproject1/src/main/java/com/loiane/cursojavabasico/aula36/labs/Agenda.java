/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula36.labs;

/**
 *
 * @author Administrator
 */
public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Agenda() {
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String obterInfo() {
        String info = "Nome = " + nomeAgenda + "\n";

        if (contatos != null) {
            for (Contato contato : contatos ) {
                info += contato.obterInfo() + "\n";
            }
        }

        return info;
    }

}
