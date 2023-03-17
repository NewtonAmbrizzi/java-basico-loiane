/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula34.labs;

/**
 *
 * @author Administrator
 */
public class Contador {
    
    private static int contador;
    
    Contador(){
        contador++;
    }
    
    public static void incrementarContador(){
        contador++;
    }
    
    public static void zerarContador(){
        contador = 0;
    }

    public static int getContador() {
        return contador;
    }
    
}
