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
public class Exercicio25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorProduto, totalCompra = 0, dinheiro, troco;
        int i = 1;
        boolean continua = true;
        String novaCompra;
        
        System.out.print("Lojas Tabajara\n");
        
        while (continua){

            do{
                System.out.print("Produto " + i + ": R$ ");
                valorProduto = scanner.nextDouble();
                totalCompra += valorProduto;
                i++;
            } while (valorProduto != 0);
            
            System.out.print("Total: R$ " + totalCompra);
            System.out.print("\nDinheiro: R$ ");
            dinheiro = scanner.nextDouble();
            troco = dinheiro - totalCompra;
            System.out.print("Troco: R$ " + troco);
            System.out.print("\n...");
            
            System.out.println("\nDeseja registrar nova compra? (S/N)");            
            novaCompra = scanner.next();
            if (novaCompra.equalsIgnoreCase("n")) {
                continua = false;
            } else {
                i = 1;
                totalCompra = 0;
            }
        }
        
        
    }
    
}
