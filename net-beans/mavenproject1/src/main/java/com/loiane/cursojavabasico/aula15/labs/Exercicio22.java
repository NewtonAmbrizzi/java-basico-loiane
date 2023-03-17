/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double quantidadeMorango, quantidadeMaca, valorMorango = 0, valorMaca = 0, valorCompra, quantidadeTotal;
        
        System.out.println("Digite quantos Kg de morango:");
        quantidadeMorango = scanner.nextDouble();
        System.out.println("Digite quantos Kg de maçã:");
        quantidadeMaca = scanner.nextDouble();
        
        if (quantidadeMorango <= 5) {
            valorMorango = 2.5;
        } else if (quantidadeMorango > 5) {
            valorMorango = 2.2;
        }
        
        if (quantidadeMaca <= 5) {
            valorMaca = 1.8;
        } else if (quantidadeMaca > 5) {
            valorMaca = 1.5;
        }
        
        valorCompra = (valorMaca * quantidadeMaca) + (valorMorango * quantidadeMorango);
        quantidadeTotal = quantidadeMaca + quantidadeMorango;
        
        if (quantidadeTotal > 8 || valorCompra > 25) {
            valorCompra *= 0.9;
        }
        
        System.out.println("O valor da compra é de: R$ " + valorCompra);

    }
    
}
