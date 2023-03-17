/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio01;

/**
 *
 * @author Administrator
 */
public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public boolean sacar(double saque) {
        if ((saldo - saque) > 0) {
            this.saldo -= saque;
            return true;
        }
        return false;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + '}';
    }

}
