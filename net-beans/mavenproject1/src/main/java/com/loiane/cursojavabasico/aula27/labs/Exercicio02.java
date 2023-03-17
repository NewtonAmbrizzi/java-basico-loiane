/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula27.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("123456", "123-4", true, 5000, 2000);
        
        cc.mostrarSaldoDetalhado();
        
        cc.sacar(8000);
        
        if (cc.getUsoLimite()){
            System.out.println("Limite utilizado");
        } else {
            System.out.println("Liminte não foi utilizado");
        }
        
        cc.mostrarSaldoDetalhado();

        cc.depositar(2000);
        
        cc.mostrarSaldoDetalhado();
        
        if (cc.getUsoLimite()){
            System.out.println("Limite utilizado");
        } else {
            System.out.println("Liminte não foi utilizado");
        }
        
        


    }
    
}
