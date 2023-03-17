/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula34.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(1, 2));
        imprimirTela(Calculadora.subtrair(2, 1));
        imprimirTela(Calculadora.dividir(10, 5));
        imprimirTela(Calculadora.multiplicar(2, 3));
        imprimirTela(Calculadora.potencializar(2, 6));

    }
    
    static void imprimirTela(int num){
        System.out.println(num);
    }
    
}
