/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula43.labs.exercicio03;

/**
 *
 * @author Administrator
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal camelo = new Animal();
        Peixe tubarao = new Peixe();
        Mamifero ursoDoCanada = new Mamifero();
        
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);
        
        System.out.println("Zoo");
        System.out.println("---------------------------------");
        
        System.out.println(camelo.toString());
        
        System.out.println("---------------------------------");
        
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        
        System.out.println(tubarao.toString());
        
        System.out.println("---------------------------------");
        
        ursoDoCanada.setNome("Urso-do-canadá");
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setCor("Vermelho");
        ursoDoCanada.setVelocidade(0.5);
        ursoDoCanada.setAlimento("Mel");
        
        System.out.println(ursoDoCanada.toString());
        
        System.out.println("---------------------------------");

    }
    
}
