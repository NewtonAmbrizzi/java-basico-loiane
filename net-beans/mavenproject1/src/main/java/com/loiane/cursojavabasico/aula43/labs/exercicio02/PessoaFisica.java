/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio02;

/**
 *
 * @author Administrator
 */
public class PessoaFisica extends Contribuinte {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        if (getRendaBruta() < 1400) {
            imposto = ((getRendaBruta() / 100) * 0) - 0;
        } else if (getRendaBruta() < 2100) {
            imposto = ((getRendaBruta() / 100) * 10) - 100;
        } else if (getRendaBruta() < 2800) {
            imposto = ((getRendaBruta() / 100) * 15) - 270;
        } else if (getRendaBruta() < 3600) {
            imposto = ((getRendaBruta() / 100) * 25) - 500;
        }else {
            imposto = ((getRendaBruta() / 100) * 30) - 700;
        }

        return imposto;

    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCPF - " + getCpf() +
                "\nImposto devido: " + calculaImposto();
    }
    
    
    
}
