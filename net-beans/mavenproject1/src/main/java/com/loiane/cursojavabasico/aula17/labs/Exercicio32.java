/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        boolean naoTerminar = true;
        int codigo, quantidade;
        double total = 0;
        String output = "";
        
        do {
            
            System.out.println("Digite o código e a quantidade, digite 0 no código para sair");
            codigo = scanner.nextInt();
            quantidade = scanner.nextInt();
            
            System.out.println(codigo);
            
            switch (codigo){
                case 100:
                    output += "Cachorro Quente -> 1,20 * " + quantidade;
                    output += " = " + (1.2*quantidade) + "\n";
                    total += (1.2*quantidade);
                    break;
                case 101:
                    output += "Bauru Simples -> 1,30 * " + quantidade;
                    output += " = " + (1.3*quantidade) + "\n";
                    total += (1.3*quantidade);
                    break;
                case 102:
                    output += "Bauru com Ovo -> 1,50 * " + quantidade;
                    output += " = " + (1.5*quantidade) + "\n";   
                    total += (1.5*quantidade);
                    break;
                case 103:
                    output += "Hambúrguer -> 1,20 * " + quantidade;
                    output += " = " + (1.2*quantidade) + "\n";
                    total += (1.2*quantidade);
                    break;
                case 104:
                    output += "Cheeseburguer -> 1,30 * " + quantidade;
                    output += " = " + (1.3*quantidade) + "\n";
                    total += (1.3*quantidade);
                    break;
                case 105:
                    output += "Refrigerante -> 1,00 * " + quantidade;
                    output += " = " + (1*quantidade) + "\n";
                    total += (1*quantidade);
                    break;
                case 0:
                    naoTerminar = false;
                    output += "Total a pagar = " + total;
                    break;
                default:
                    System.out.println("código inválido");
            }
            
        } while (naoTerminar);
        
        System.out.println(output);

    }
    
}
