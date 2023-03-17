/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula25;

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

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia di carro é: " + autonomia);

        System.out.println("Qtd 10 km " + van.calculaCombustivel(10) + " Litros");
        System.out.println("Qtd 5 km " + van.calculaCombustivel(5) + " Litros");

    }

}
