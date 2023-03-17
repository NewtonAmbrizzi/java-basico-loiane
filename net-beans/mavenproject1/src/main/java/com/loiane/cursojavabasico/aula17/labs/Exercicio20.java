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
public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pessoas, idade = 0;
        double mediaIdade;
        
        System.out.println("Digite o número de pessoas:");
        pessoas = scanner.nextInt();
        
        for (int i = 0; i < pessoas; i++) {
            System.out.println("Digite uma idade:");
            idade += scanner.nextInt();
        }
        
        mediaIdade = idade/pessoas;
        
        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("Jovem");
        } else if (mediaIdade <= 60) {
            System.out.println("Adulta");
        } else {
            System.out.println("Idosa");
        }

    }
    
}
