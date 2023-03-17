/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula46.labs;

/**
 *
 * @author Administrator
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        
        Cilindro cilindro = new Cilindro();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();
        
        circulo.setRaio(2);
        circulo.setNome("Circulo");
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");
        
        cilindro.setRaio(2);
        cilindro.setAltura(3);
        cilindro.setNome("Cilindro");
        cubo.setLado(3);
        cubo.setNome("Cubo");
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setBase(quadrado);
        piramide.setNumPoliBase(4);
        piramide.setNome("Piramide");
        
        FiguraGeometrica[] figuras = {circulo, quadrado, triangulo, cilindro, cubo, piramide};
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println("-------------------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D) {
                System.out.println(((Figura2D) figura).calcularArea());
            } else {
                System.out.println(((Figura3D) figura).calcularArea());
                System.out.println(((Figura3D) figura).calcularVolume());
            }

        }
    }
    
}
