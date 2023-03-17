/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula24.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio06 {

    public static void main(String[] args) {

        Contato contato1 = new Contato();
        
        contato1.nome = "Joao";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";
        
        contato1.telefones = new String[5];
        
        contato1.telefones[0] = "91234-5678";
        contato1.telefones[1] = "99876-5432";
        contato1.telefones[2] = "99999-8888";

    }
    
}
