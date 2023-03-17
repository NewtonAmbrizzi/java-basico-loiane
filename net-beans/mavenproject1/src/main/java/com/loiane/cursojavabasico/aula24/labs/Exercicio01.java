/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula24.labs;

/**
 *
 * @author Administrator
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Lampada lamp = new Lampada();
        
        lamp.modelo = "A60";
        lamp.tensao = "Bivolt";
        lamp.potenciaWatts = 7;
        lamp.cor = "Amarela";
        lamp.tipoLuz = "Amarela";
        lamp.garantiaMeses = 36;
        lamp.tipos = new String[5];
        lamp.tipos[0] = "Abajur";
        lamp.tipos[1] = "Lampeões";
        lamp.tipos[2] = "Luminária";
        
        

    }
    
}
