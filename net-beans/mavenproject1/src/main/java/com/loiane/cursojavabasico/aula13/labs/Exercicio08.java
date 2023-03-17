/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorHora, salario;
        int quantidadeHora;
        
        System.out.println("Digite o valor da hora salarial e total de horas trabalhadas no mês separadas por espaço:");
        valorHora = scanner.nextDouble();
        quantidadeHora = scanner.nextInt();
        salario = valorHora * quantidadeHora;
        System.out.println("O seu salário neste mês será de: " + salario);
        
        // Alternantiva
        System.out.println("Digite o valor da hora salarial:");
        valorHora = scanner.nextDouble();
        System.out.println("Digite o total de horas trabalhadas no mês:");
        quantidadeHora = scanner.nextInt();
        salario = valorHora * quantidadeHora;
        System.out.println("O seu salário neste mês será de: " + salario);
        
        
    }
    
}
