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
public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeCd;
        double valorCd, somaCd = 0, mediaColecao;
        
        System.out.println("Digite quantos CDs tem a coleção:");
        quantidadeCd = scanner.nextInt();
        
        for (int i = 1; i <= quantidadeCd; i++){
            System.out.println("Digite o valor do cd " + i + " da coleção");
            valorCd = scanner.nextDouble();
            somaCd += valorCd;
        }
        
        mediaColecao = somaCd / quantidadeCd;
        
        System.out.println("O valor total da coleção é de: R$ " + somaCd);
        System.out.println("O valor médio de cada CD é de: R$ " + mediaColecao);

    }
    
}
