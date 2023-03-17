/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String tipoPagamento, carne = "";
        double quantidadeCarne = 0,
               precoKg = 0,
               valorTotal,
               valorDesconto = 0,
               totalAPagar;
        int tipoCarne;

        System.out.println("Entre com a carne desejada:");
        System.out.println("1 - Filé duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        tipoCarne = Integer.parseInt(scanner.next());
        System.out.println("Quantos Kg deseja:");
        quantidadeCarne = scanner.nextDouble();
        
        switch (tipoCarne) {
            case 1:
                carne = "File duplo";
                if (quantidadeCarne > 5) {
                    precoKg = 5.8;
                } else {
                    precoKg = 4.9;
                }
                break;
            case 2:
                carne = "Alcatra";
                if (quantidadeCarne > 5) {
                    precoKg = 6.8;
                } else {
                    precoKg = 5.9;
                }
                break;
            case 3:
                carne = "Picanha";
                if (quantidadeCarne > 5) {
                    precoKg = 7.8;
                } else {
                    precoKg = 6.9;
                }
                break;
            default:
                System.out.println("Código inválido");;
        }
        
        System.out.println("O pagamento será no cartão Tabajara? (S / N)");
        tipoPagamento = scanner.next();
        
        valorTotal = precoKg * quantidadeCarne;
        if (tipoPagamento.equalsIgnoreCase("S")) {
            valorDesconto = valorTotal/100 * 5;
        }
        
        totalAPagar = valorTotal - valorDesconto;
        
        System.out.println(carne + "-----" + quantidadeCarne + " Kg------valor: R$ " + valorTotal);
        System.out.println("Cartão Tabajara?--------------------" + tipoPagamento);
        System.out.println("Valor Desconto----------------R$ " + valorDesconto);
        System.out.println("Total a pagar----------------R$ " + totalAPagar);
    }
    
}
