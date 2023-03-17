/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio01;

/**
 *
 * @author Administrator
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Simples");
        contaSimples.setNumConta("12345-6");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Poupança");
        contaPoupanca.setNumConta("45678-9");
        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        contaPoupanca.setDiaRendimento(14);
        System.out.println(contaPoupanca);
        contaPoupanca.calcularNovoSaldo(0.07);
        System.out.println(contaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Especial");
        contaEspecial.setNumConta("15975-3");
        contaEspecial.setLimite(100);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        System.out.println(contaEspecial);

    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

}
