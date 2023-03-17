/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula46.labs;

/**
 *
 * @author Administrator
 */
public class Cubo extends Figura3D {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(this.lado, 2) * 6;
        return area;
    }

    @Override
    public double calcularVolume() {
        double volume = Math.pow(this.lado, 3);
        return volume;
    }
    
}
