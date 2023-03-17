/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula34.labs;

/**
 *
 * @author Administrator
 */
public class Calculadora {
    
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
    
    public static int potencializar(double num1, double num2){
        return (int) Math.pow(num1, num2);
    }
    
    //Exercício03
    
    public static int fatorial(int num){
        if (num == 0){
            return 1;
        }
        
        int fatorial = num;
        for (int i = num-1; i > 0; i--){
            fatorial *= i;
        }
        return fatorial;
    }
    
}
