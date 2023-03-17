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
public class Exercicio27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temperatura, mediaTemperatura;
        double totalTemp = 0;
        double temperaturaMin = Double.MAX_VALUE;
        double temperaturaMax = Double.MIN_VALUE;
        String novaTemp;
        boolean continua = true;
        int cont = 0;
        
        while (continua) {
            System.out.println("Digite uma temperatura:");
            temperatura = scanner.nextDouble();
            totalTemp += temperatura;
            cont++;
            if (temperatura < temperaturaMin) {
                temperaturaMin = temperatura;
            }
            if (temperatura > temperaturaMax) {
                temperaturaMax = temperatura;
            }
            
            System.out.println("Deseja informar outra temperatura? (S/N)");
            novaTemp = scanner.next();
            
            if (novaTemp.equalsIgnoreCase("n")){
                break;
            }
        }
        
        mediaTemperatura = totalTemp / cont;
        
        System.out.println("Temperatura máxima: " + temperaturaMax);
        System.out.println("Temperatura mínima:" + temperaturaMin);
        System.out.println("Média de " + cont + " temperaturas informadas: " + mediaTemperatura);
        
        
    }
    
}
