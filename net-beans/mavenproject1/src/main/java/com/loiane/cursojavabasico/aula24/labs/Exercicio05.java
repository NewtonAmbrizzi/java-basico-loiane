/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula24.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limite = 5000;
        conta.saldo = 10000;
        
        System.out.println("Conta: " + conta.numero + " Agência: " + conta.agencia);
        System.out.println("Saldo = " + conta.saldo);
        System.out.println("Limite = " + conta.limite);
        System.out.println("Saldo + Limite = " + (conta.saldo + conta.limite));
        
    }
    
}
