/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula24.labs;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Exercicio04 {

    public static void main(String[] args) {

        LivroDeBiblioteca livroBiblioteca = new LivroDeBiblioteca();
        
        livroBiblioteca.nome = "Mastering ExtJS";
        livroBiblioteca.autor = "Loiane Groner";
        livroBiblioteca.anoLancamento = 2015;
        
        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.emprestadoPara = "Newton";
        
        System.out.println("Nome Livro = " + livroBiblioteca.nome);
        System.out.println("Emprestado para: " + livroBiblioteca.emprestadoPara);
        System.out.println("Data devolução: " + livroBiblioteca.dataEntrega);

    }
    
}
