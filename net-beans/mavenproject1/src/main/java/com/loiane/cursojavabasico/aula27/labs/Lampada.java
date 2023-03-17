/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula27.labs;

/**
 *
 * @author Administrator
 */
public class Lampada {
    
    String modelo, cor, tipoLuz, tensao;
    int potenciaWatts, garantiaMeses;
    String[] tipos;
    boolean ligada;
    
    void ascenderLampada(){
        ligada = true;
    }
    
    void apagarLampada() {
        ligada = false;
    }
    
    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lampada acesa");
        } else {
            System.out.println("Lampada apagada");
        }
    } 
    
    void mudarEstado() {
        if (ligada) {
            apagarLampada();
        } else {
            ascenderLampada();
        }
    }
    
}
