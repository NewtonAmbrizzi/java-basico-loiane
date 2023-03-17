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
public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String periodo;
        
        System.out.println("Digite seu periodo de estudo: (M - Matutino/V - Vespertino/N - Noturno)");
        periodo = scanner.next();
        
        switch(periodo){
            case "M":
            case "m": System.out.println("Bom Dia!"); break;
            case "V":
            case "v": System.out.println("Boa Tarde!"); break;
            case "N":
            case "n": System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor Inválido!");
        }
        
    }
    
}
