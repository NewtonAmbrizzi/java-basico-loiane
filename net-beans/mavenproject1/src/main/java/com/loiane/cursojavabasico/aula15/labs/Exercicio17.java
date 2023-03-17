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
public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano com 4 dígitos para verificar se é bissexto:");
        ano = scanner.nextInt();
        
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }

    }
    
}
