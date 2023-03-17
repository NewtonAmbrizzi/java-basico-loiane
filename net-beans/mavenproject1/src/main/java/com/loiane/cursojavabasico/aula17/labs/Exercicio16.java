/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int aux = 0;
        
        
        System.out.print(num1 + ", " + num2);
        while (aux < 500) {
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
            System.out.print(", " + aux);
        }
        
        num1 = 1;
        num2 = 1;
        aux = 0;
        
        System.out.print("\n" + num1 + ", " + num2);
        for (int i = 0; i < 500; i = aux) {
            aux = num1 + num2;
            num1 = num2;
            num2 = aux;
            System.out.print(", " + aux);
        }
    }
    
}
