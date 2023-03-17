/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula29;

/**
 *
 * @author Administrator
 */
public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numeroPassageiros = 10;
        van.capTanqueCombustivel = 100;
        van.autonomia = 0.2;
        
        System.out.println(van.numeroPassageiros);
        
        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
        
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numeroPassageiros);
        System.out.println(van2.capTanqueCombustivel);
        System.out.println(van2.autonomia);
    }
    
}
