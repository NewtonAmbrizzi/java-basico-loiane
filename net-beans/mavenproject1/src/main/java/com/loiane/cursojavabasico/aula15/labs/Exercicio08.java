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
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double preco1, preco2, preco3;
        
        System.out.println("Digite o preço 1:");
        preco1 = scanner.nextDouble();
        System.out.println("Digite o preço 2:");
        preco2 = scanner.nextDouble();
        System.out.println("Digite o preço 3:");
        preco3 = scanner.nextDouble();
        
        if (preco1 == preco2 && preco2 == preco3) {
            System.out.println("Os preços são iguais, comprar qualquer um.");
        } else {
            if (preco1 < preco2 && preco1 < preco3){
                System.out.println("O preço 1 é o menor, compre este item.");
            } else if (preco1 > preco2 && preco2 < preco3){
                System.out.println("O preço 2 é o menor, compre este item.");
            } else {
                System.out.println("O preço 3 é o menor, compre este item.");
            }
        }

    }
    
}
