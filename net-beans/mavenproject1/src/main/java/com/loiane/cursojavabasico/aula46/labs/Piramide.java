/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula46.labs;

/**
 *
 * @author Administrator
 */
public class Piramide extends Figura3D {

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    private Figura2D base;

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        if (base != null) {
            double areaLado = this.numPoliBase * ((this.arestaBase * this.apotema) / 2);
            areaTotal = base.calcularArea() + areaLado;
        }
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        double volume = 0;
        if (base != null) {
            volume = (base.calcularArea() * this.altura) / 3;
        }
        return volume;
    }

}
