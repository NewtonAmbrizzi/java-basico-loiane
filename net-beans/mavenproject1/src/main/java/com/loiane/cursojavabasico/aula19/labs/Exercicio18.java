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
public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        int menorIdade, maiorIdade, indexMaior, indexMenor;
        
        for (int i = 0; i < idades.length; i++){
            System.out.println("Entre com a idade " + (i+1));
            idades[i] = scanner.nextInt();
        }
        
        menorIdade = idades[0];
        maiorIdade = idades[0];
        indexMaior = 0;
        indexMenor = 0;
        
        for (int i = 1; i < idades.length; i++){
            if (idades[i] < menorIdade){
                menorIdade = idades[i];
                indexMenor = i;
            }
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                indexMaior = i;
            }
        }

        System.out.print("Vetor A = ");
        for (int idade : idades) {
            System.out.print(idade + " | ");
        }
        
        System.out.println("\nMenor idade é " + menorIdade + " na posição " + indexMenor);
        System.out.println("Maior idade é " + maiorIdade + " na posição " + indexMaior);
    }
    
}
