/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio36 {


    public static void main(String[] args) {
        
        int[] vetorA = new int[11];
        
        for (int i = 0; i < vetorA.length; i++){
            
            vetorA[i] = (int) Math.pow(2, i);
            System.out.println("2 ^ " + i + " = " + vetorA[i]);
        }
                
        
    }
    
}
