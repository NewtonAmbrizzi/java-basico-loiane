/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula24;

/**
 *
 * @author Administrator
 */
public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capTanqueCombustivel = 100;
        van.autonomia = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numeroPassageiros = 4;
        fusca.capTanqueCombustivel = 30;
        fusca.autonomia = 0.15;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
    
}
