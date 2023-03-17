/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula21;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class ForEach {

    public static void main(String[] args) {

        int[] notas = new int[10];
        
        Random random = new Random();
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(11);
        }
        
        System.out.println("For regular:");
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            System.out.print(nota + " | ");
        }
        
        System.out.println("\nFor each");
        for (int nota : notas) {
            System.out.print(nota + " | ");
        }
    }
    
}
