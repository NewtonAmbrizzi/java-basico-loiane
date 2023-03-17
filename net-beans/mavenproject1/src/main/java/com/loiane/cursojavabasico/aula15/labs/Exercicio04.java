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
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        String letra = scanner.next();
        
        switch(letra){
            case "a":
            case "A":
            case "e":
            case "E":    
            case "i":    
            case "I":    
            case "o":
            case "O":    
            case "u":
            case "U":System.out.println("A letra digitada é uma vogal"); break;
            default:System.out.println("A letra digitada é uma consoante");
        }
            

    }
    
}
