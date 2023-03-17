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
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        double par = 0;
        double impar = 0;
        double percentualPar, percentualImpar;
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor contido na posição " + i);
            vetorA[i] = scanner.nextInt();
            if (vetorA[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }          
                        
        }
        
            percentualPar = par * 100 / vetorA.length;
            percentualImpar = impar * 100 / vetorA.length;
        
            System.out.print("Vetor A = ");
            for (int item : vetorA){
                System.out.print(item + " | ");
            }
            
            System.out.println("\nPares: " + percentualPar + "%");
            System.out.println("Impares: " + percentualImpar + "%");
        

    }
    
}
