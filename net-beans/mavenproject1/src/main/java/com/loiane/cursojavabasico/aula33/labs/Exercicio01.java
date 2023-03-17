/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.mudarEstado();
        
        System.out.println(lampada.mostrarEstado());

        lampada.mudarEstado();
        
        System.out.println(lampada.mostrarEstado());
        
        lampada.mudarEstado();
        
        System.out.println(lampada.mostrarEstado());

    }
    
}
