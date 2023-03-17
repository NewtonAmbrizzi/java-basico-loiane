/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula46.labs;

/**
 *
 * @author Administrator
 */
public class Cilindro extends Figura3D {
    
    private double altura;
    private double raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.pow(raio, 2) * Math.PI;
        double areaLateral = 2 * Math.PI * this.raio * this.altura;
        double areaTotal = (2 * areaBase) + areaLateral;
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.pow(this.raio, 2) * Math.PI * this.altura;
        return volume;
    }
    
}
