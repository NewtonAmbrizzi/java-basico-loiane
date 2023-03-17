/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] cotacoes = new double[20];
        double cotacaoDolar;
        
        System.out.println("Informe a cotação do Dólar em Reais:");
        cotacaoDolar = scanner.nextDouble();
        
        for (int i = 0; i < cotacoes.length; i++){
            cotacoes[i] = cotacaoDolar * (i+1);
        }
        
        System.out.print("Cotações = ");
        for (double cotacao : cotacoes) {
            System.out.print("R$ " + cotacao + " | ");
        }

    }
    
}
