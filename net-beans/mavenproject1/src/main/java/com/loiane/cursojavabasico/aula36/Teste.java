/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula36;

/**
 *
 * @author Administrator
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");

        //criar objeto Endereco
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("n/a");
        endereco.setComplemento("-");
        endereco.setCidade("Kigs Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("99999-999");

        contato.setEndereco(endereco);
        
        //criar objeto Telefone
        
        Telefone tel = new Telefone();
        
        tel.setTipo("Celular");
        tel.setDdd("11");
        tel.setNumero("99999-9999");
        
        Telefone tel2 = new Telefone();
        
        tel2.setTipo("Casa");
        tel2.setDdd("11");
        tel2.setNumero("8888-8888");
        
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;
        
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().toString());

        }
        
      
        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().toString());

        }*/
        
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone telefone : contato.getTelefones()) {
                System.out.println(telefone.toString());
                
            }
        }

    }

}
