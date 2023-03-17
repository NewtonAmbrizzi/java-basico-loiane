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
public class Exercicio30 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int multiplicador, inicio, fim;
        

            System.out.print("Montar a tabuado do: ");
            multiplicador = scanner.nextInt();

            System.out.print("Começar por: ");
            inicio = scanner.nextInt();
            
            do {
                System.out.print("Terminar em: ");
                fim = scanner.nextInt();
                if (fim < inicio) {
                    System.out.println("O número final deve ser maior que o inicial.");
                }
            } while (fim < inicio);
            
            System.out.println("\nVou montar a tabuada do " + multiplicador + " começando em " + inicio + " e terminando em " + fim);
            
            for (int i = inicio; i <= fim; i++){
                System.out.println(multiplicador + " X " + i + " = " + (i*multiplicador));
            }
    }
    
}
