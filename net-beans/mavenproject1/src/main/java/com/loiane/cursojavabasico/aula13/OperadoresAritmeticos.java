/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13;

/**
 *
 * @author Administrator
 */
public class OperadoresAritmeticos {


    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado -= 1; // resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado *= 2; // resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado /= 2; // resultado = resultado / 2;
        System.out.println(resultado);

        resultado += 8; // resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado %= 7; // resultado = resultado % 7;
        System.out.println(resultado);
        
        // Uso do operador + para concatenação
        String primeiraString = "Esta é";
        String segundaString = " uma String concatenada.";
        String terceiraString = primeiraString + segundaString;
        System.out.println(terceiraString);
        
        resultado += 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        // resultado vale 5
        System.out.println(resultado++);
        System.out.println(++resultado);
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
    
}
