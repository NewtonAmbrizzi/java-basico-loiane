/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio02;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PessoaFisica contribuintePF1 = new PessoaFisica();
        PessoaFisica contribuintePF2 = new PessoaFisica();
        PessoaFisica contribuintePF3 = new PessoaFisica();
        
        PessoaJuridica contribuintePJ1 = new PessoaJuridica();
        PessoaJuridica contribuintePJ2 = new PessoaJuridica();
        PessoaJuridica contribuintePJ3 = new PessoaJuridica();
        
        contribuintePF1.setNome("Contribuinte PF 1");
        contribuintePF1.setCpf("111.111.111-11");
        contribuintePF1.setRendaBruta(1300);
        
        contribuintePF2.setNome("Contribuinte PF 2");
        contribuintePF2.setCpf("222.222.222-22");
        contribuintePF2.setRendaBruta(2300);
        
        contribuintePF3.setNome("Contribuinte PF 3");
        contribuintePF3.setCpf("333.333.333-33");
        contribuintePF3.setRendaBruta(4300);
        
        contribuintePJ1.setNome("Contribuinte PJ 1");
        contribuintePJ1.setCnpj("11.111.111/0001-11");
        contribuintePJ1.setRendaBruta(1300);
        
        contribuintePJ2.setNome("Contribuinte PJ 2");
        contribuintePJ2.setCnpj("22.222.222/0001-22");
        contribuintePJ2.setRendaBruta(2300);
        
        contribuintePJ3.setNome("Contribuinte PJ 3");
        contribuintePJ3.setCnpj("33.333.333/0001-33");
        contribuintePJ3.setRendaBruta(4300);
        
        System.out.println("*** PF ***");
        
        System.out.println(contribuintePF1.toString());
        System.out.println(contribuintePF2.toString());
        System.out.println(contribuintePF3.toString());
        
        System.out.println("*** PJ ***");
        
        System.out.println(contribuintePJ1.toString());
        System.out.println(contribuintePJ2.toString());
        System.out.println(contribuintePJ3.toString());
    }
    
}
