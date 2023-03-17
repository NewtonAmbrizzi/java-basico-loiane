/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17;

/**
 *
 * @author Administrator
 */
public class LoopFor {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println("i tem o valor: " + i);
        }

        for (int i = 5; i > 0; i--){
            System.out.println("i tem o valor: " + i);
        }
        
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("Valor de i: " + i + " e valor de j: " + j);
        }
        
        int count = 0;
        for (;count < 10;){
            System.out.println("valor de count " + count);
            count +=2;
        }
        
        for (int cont = 0; cont < 10; cont +=2){
            System.out.println("valor de count " + cont);
        }
        
        int soma = 0;
        for (int i = 1; i < 5; soma += i++ );
        System.out.println("O valor da soma é: " + soma);
        
        int[] numeros = {0,1,2,3,4};
        for (int numero:numeros){
            System.out.println(numero);
        }
    }
    
    
    
}
