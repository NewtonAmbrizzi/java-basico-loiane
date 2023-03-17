/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

/**
 *
 * @author Administrator
 */
public class ContaCorrente {
    
    private String numero;
    private String agencia;
    private boolean especial;
    private boolean usoLimite;
    private double limiteTotal;
    private double limiteUtilizado = 0;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, boolean usoLimite, double limiteTotal, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.usoLimite = usoLimite;
        this.limiteTotal = limiteTotal;
        this.saldo = saldo;
    }
    
    
    
    ContaCorrente(String numero, String agencia, boolean especial, double limite, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteTotal = limite;
        this.saldo = saldo;
    }
    
    
    
    public boolean getUsoLimite() {
        return usoLimite;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limiteTotal;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteAtual(double limite) {
        return limiteTotal - limiteUtilizado;
    }

    public double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean isUsoLimite() {
        return usoLimite;
    }

    public void setUsoLimite(boolean usoLimite) {
        this.usoLimite = usoLimite;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }
    
    public void mostrarSaldoDetalhado() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
        System.out.println("Limite utilizado: " + getLimiteUtilizado());
        System.out.println("Limite Disponível: " + getLimiteAtual(0));
    }

    public void sacar(double saque){
        if (saque <= ((this.limiteTotal - this.limiteUtilizado) + this.saldo)) {
            debitaSaque(saque);
        } else {
            System.out.println("Saldo + Limite insuficientes para o valor solicitado");
        }
    }
    
    private void debitaSaque(double saque) {
        if (saque <= this.saldo) {
                this.saldo -= saque;
                System.out.println("Saque realizado com sucesso");
            } else {
                this.saldo -= saque;
                this.limiteUtilizado = this.saldo * -1;
                this.usoLimite = true;
                this.saldo = 0;
                System.out.println("Saque realizado com sucesso, limite utilizado");
            }
    }
    
    public void depositar(double deposito) {
        if (deposito > this.limiteUtilizado) {
            saldo += (deposito - this.limiteUtilizado);
            this.limiteUtilizado = 0;
            this.usoLimite = false;
        } else if (deposito == this.limiteUtilizado) {
            this.limiteUtilizado = 0;
            this.usoLimite = false;
        } else {
            this.limiteUtilizado -= deposito;
        }
    }
    
    public void usoLimite() {
        if (getUsoLimite()) {
            System.out.println("Limite está em uso");
        } else {
            System.out.println("Limite não está em uso");
        }
    }
    
}
