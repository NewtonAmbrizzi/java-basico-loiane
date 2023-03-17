/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio01;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            super.setSaldo(super.getSaldo() * (1 + taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        
        return "Conta Poupança: " + super.toString();
        
    }
    
    
    
}
