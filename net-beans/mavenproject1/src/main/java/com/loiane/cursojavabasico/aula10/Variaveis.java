/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula10;

/**
 *
 * @author Administrator
 */
public class Variaveis {
    
    public static void main(String[] args) {
        
        //Convenção
        int idade = 20;
        String nome = "Loiane";
        String nomeDoMeuCachorro = "totó";
        
        //Válido, mas não aconselhável
        int _idade;
        int $idade;
        String ano2014 = "2014";
        
        //Válido, mas não segue a convenção
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;
        
        idade = 25;
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        //má prática, nome sem significado
        int a = 10;
        String b = "Loiane";
    }
    
}
