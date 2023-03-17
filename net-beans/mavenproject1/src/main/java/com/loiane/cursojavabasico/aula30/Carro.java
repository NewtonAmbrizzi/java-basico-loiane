/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula30;

/**
 *
 * @author Administrator
 */
public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capTanqueCombustivel;
    double autonomia;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numeroPassageiros, double capTanqueCombustivel, double autonomia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capTanqueCombustivel = capTanqueCombustivel;
        this.autonomia = autonomia;
    }

    public Carro(String marca, String modelo, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        System.out.println("Construtor com 3 parametros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Construtor com 2 parametros");
    }
    
        
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.obterAutonomia() + " km");
    }
    
    double obterAutonomia(){
        return this.capTanqueCombustivel * this.autonomia;
    }
    
    double calculaCombustivel(double km) {
        return km / this.autonomia;
    }
}
