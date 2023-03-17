/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio01;

/**
 *
 * @author Administrator
 */
public class ContaEspecial extends ContaBancaria {
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double saque) {
        if ((super.getSaldo() + this.getLimite()) > saque) {
            super.setSaldo(super.getSaldo() - saque);
            return true;
        }
        
        return false;
        
    }

    @Override
    public String toString() {
        return super.toString() + "; ContaEspecial{" + "limite=" + limite + '}';
    }
    
    
    
    

}
