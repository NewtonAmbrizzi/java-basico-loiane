/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula29;

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
    
    Carro(){
        System.out.println("Classe Carro foi instanciado");
        numeroPassageiros = 4;
    }
    
    Carro(String marca){
        this.marca = marca;
    }

    public Carro(String marca, String modelo, int numeroPassageiros, double capTanqueCombustivel, double autonomia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capTanqueCombustivel = capTanqueCombustivel;
        this.autonomia = autonomia;
    }
        
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + obterAutonomia() + " km");
    }
    
    double obterAutonomia(){
        return capTanqueCombustivel * autonomia;
    }
    
    double calculaCombustivel(double km) {
        return km / autonomia;
    }
    
}
