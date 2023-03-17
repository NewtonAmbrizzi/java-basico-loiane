/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio02;

/**
 *
 * @author Administrator
 */
public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calculaImposto() {
        return getRendaBruta() * 0.1;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nCNPJ - " + getCnpj() +
                "\nImposto devido: " + calculaImposto();
    }
    
}
