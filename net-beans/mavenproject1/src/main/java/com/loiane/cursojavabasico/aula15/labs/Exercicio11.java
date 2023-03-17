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
public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salario, reajuste, percentualReajuste, novoSalario;
        
        System.out.println("Digite o valor do salário atual");
        salario = scanner.nextDouble();
        
        if (salario < 0) {
            System.out.println("Valor Inválido");
        } else {
            if (salario <= 280){
                percentualReajuste = 20;
            } else if (salario < 700) {
                percentualReajuste = 15;
            } else if (salario < 1500) {
                percentualReajuste = 10;
            } else {
                percentualReajuste = 5;
            }
        reajuste = salario * (percentualReajuste / 100);
        novoSalario = salario + reajuste;
        System.out.println("Salário antigo: R$" + salario);
        System.out.println("Percentual de reajuste: " + percentualReajuste + "%");
        System.out.println("Reajuste: R$" + reajuste);
        System.out.println("Novo salário: R$" + novoSalario);
        }

    }
    
}
