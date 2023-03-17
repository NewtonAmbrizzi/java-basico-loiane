/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tamanhoArquivo, velocidadeInternet, tempoDeDownload;
        
        System.out.println("Informe o tamanho do arquivo a ser baixado em mb:");
        tamanhoArquivo = scanner.nextDouble();
        System.out.println("Informe a velocidade da conexão em mbps:");
        velocidadeInternet = scanner.nextDouble();
        tempoDeDownload = (tamanhoArquivo / velocidadeInternet) / 60;
        System.out.println("O tempo aproximado de download será: " + tempoDeDownload + " minutos");

    }
    
}
