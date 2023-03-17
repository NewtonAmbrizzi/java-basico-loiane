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
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorHora, salarioBruto, valorInss, valorIr, valorSindicato, salarioLiquido, totalDescontos;
        int quantidadeHora;
        
        System.out.println("Digite o valor da hora salarial:");
        valorHora = scanner.nextDouble();
        System.out.println("Digite o total de horas trabalhadas no mês:");
        quantidadeHora = scanner.nextInt();
        salarioBruto = valorHora * quantidadeHora;
        valorInss = salarioBruto * 0.08;
        valorIr = salarioBruto * 0.11;
        valorSindicato = salarioBruto * 0.05;
        totalDescontos = valorInss + valorIr + valorSindicato;
        salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Imposto de Renda: " + valorIr);
        System.out.println("INSS: " + valorInss);
        System.out.println("Sindicato: " + valorSindicato);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
    
}
