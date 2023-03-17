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
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String letra;
        
        System.out.println("Digite F para Feminino e M para Masculino:");
        letra = scanner.next();
        
        if (letra.equalsIgnoreCase("f")){    
            System.out.println("F - Feminino");
        } else if(letra.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
    
}
