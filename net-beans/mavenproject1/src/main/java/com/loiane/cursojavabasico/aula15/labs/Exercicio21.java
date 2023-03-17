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
public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int litros;
        String combustivel;
        double valorAbastecimento = 0;
        
        System.out.println("Digite quantos litros deseja abastecer:");
        litros = scanner.nextInt();
        System.out.println("Qual combustível? (A-álcool / G-gasolina)");
        combustivel = scanner.next();
        
        if (combustivel.equalsIgnoreCase("A")) {
            if (litros < 20) {
                valorAbastecimento = (litros * 1.9) * 0.97;
            } else if (litros >= 20) {
                valorAbastecimento = (litros * 1.9) * 0.95;
            }
        } else if (combustivel.equalsIgnoreCase("G")) {
            if (litros < 20) {
                valorAbastecimento = (litros * 2.5) * 0.96;
            } else if (litros >= 20) {
                valorAbastecimento = (litros * 2.5) * 0.94;
            }
        }
        
        System.out.println("O valor a ser pago é: R$ " + valorAbastecimento);
    }
    
}
