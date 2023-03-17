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
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                
        int contAno = 0;
        double popA;
        double popB;
        double taxaCrescimentoA;
        double taxaCrescimentoB;
        boolean validador = false;
        
        do{
            System.out.println("Entre com a população A:");
            popA = scanner.nextDouble();
            
            if (popA >= 1){
                validador = true;
            } else {
                System.out.println("População inválida, insira um valor válido");
            }
        } while (!validador);
        
        validador = false;
        
        do{
            System.out.println("Entre com a população B:");
            popB = scanner.nextDouble();
            
            if (popB >= 1){
                validador = true;
            } else {
                System.out.println("População inválida, insira um valor válido");
            }
        } while (!validador);
        
        validador = false;
        
        do{
            System.out.println("Entre com a taxa de crescimento do país A:");
            taxaCrescimentoA = scanner.nextDouble();
            
            if (taxaCrescimentoA > 0){
                validador = true;
            } else {
                System.out.println("Taxa de crescimento inválida, insira um valor válido");
            }
        } while (!validador);

        validador = false;
        
        do{
            System.out.println("Entre com a taxa de crescimento do país B:");
            taxaCrescimentoB = scanner.nextDouble();
            
            if (taxaCrescimentoB > 0 && taxaCrescimentoA > taxaCrescimentoB){
                validador = true;
            } else {
                System.out.println("Taxa de crescimento inválida, insira um valor válido");
            }
        } while (!validador);        

        
        while (popA < popB) {
            popA += popA/100 * taxaCrescimentoA;
            popB += popB/100 * taxaCrescimentoB;
            contAno++;
        }
        
        System.out.println("População paisA: " + Math.round(popA));
        System.out.println("População paisB: " + Math.floor(popB));
        System.out.println("Quantidade de Anos: " + contAno);
    }
    
}
