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
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;
        boolean valorValido = false;
        
        while (!valorValido){
            System.out.println("Digite uma nota de 0 a 10:");
            nota = scanner.nextDouble();
            if (nota >=0 && nota <= 10){
                valorValido = true;
                System.out.println("Você digitou a nota " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        }

    }
    
}
