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
public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorHoraTrab, quantidadeHoraTrab, salarioBruto, impostoRenda, inss, fgts, totalDesc,
               salarioLiquido, percentualIr, percentualInss = 10, percentualFgts = 11;
        
        System.out.println("Digite o valor da hora trabalhada:");
        valorHoraTrab = scanner.nextDouble();
        System.out.println("Digite agora a quantidade de horas trabalhadas no mês:");
        quantidadeHoraTrab = scanner.nextDouble();
        
        
        if (valorHoraTrab > 0 && quantidadeHoraTrab > 0) {
            salarioBruto = valorHoraTrab * quantidadeHoraTrab;
            if (salarioBruto <= 900) {
                percentualIr = 0;
            } else if (salarioBruto <= 1500) {
                percentualIr = 5;
            } else if (salarioBruto <= 2500) {
                percentualIr = 10;
            } else {
                percentualIr = 20;
            }
            impostoRenda = salarioBruto * (percentualIr / 100);
            inss = salarioBruto * (percentualInss / 100);
            fgts = salarioBruto * (percentualFgts / 100);
            totalDesc = impostoRenda + inss;
            salarioLiquido = salarioBruto - totalDesc;
            System.out.println(totalDesc);
            System.out.println("Salário Bruto: (" + valorHoraTrab + " * " + 
                    quantidadeHoraTrab + ")------------: R$ " + salarioBruto);
            System.out.println("(-) IR (" + percentualIr + "%)------------------"
                    + "---------: R$ " + impostoRenda);
            System.out.println("(-) INSS (" + percentualInss + "%)------------------------: R$ " + inss);
            System.out.println("FGTS (" + percentualFgts + "%)----------------------------: R$ " + fgts);
            System.out.println("Total de descontos----------------------: R$ " + totalDesc); 
            System.out.println("Salário Líquido-------------------------: R$ " + salarioLiquido); 

        } else {
            System.out.println("Valores inváldos!");
        }
    }
    
}
