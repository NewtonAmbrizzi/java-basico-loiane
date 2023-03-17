/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula34.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contador contador = new Contador();
        
        System.out.println(Contador.getContador());
        
        Contador contador2 = new Contador();
        
        System.out.println(Contador.getContador());
        
        Contador.incrementarContador();
        
        System.out.println(Contador.getContador());
        
        Contador.zerarContador();
        
        System.out.println(Contador.getContador());

    }
    
}
