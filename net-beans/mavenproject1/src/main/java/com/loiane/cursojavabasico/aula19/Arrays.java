/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19;

/**
 *
 * @author Administrator
 */
public class Arrays {
    
    public static void main(String[] args) {

        /* Inviavel criar uma variável or dia
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        */
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
        
        System.out.println("O tamanho do array: " + temperaturas.length);
        
        System.out.println("Valores do array: " + temperaturas); //imprime a posição de memoria da variavel
        
        for (int i = 0; i <= temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }
        
        for (double temperatura : temperaturas) {
            System.out.println(temperatura);            
        }
        
    }
    
}
