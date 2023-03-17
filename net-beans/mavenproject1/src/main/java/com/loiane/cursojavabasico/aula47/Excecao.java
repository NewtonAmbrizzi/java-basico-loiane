/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula47;

/**
 *
 * @author Administrator
 */
public class Excecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = new int[4];

        try {
            System.out.println("Antes da exception");

            vetor[4] = 1;
            
            System.out.println("Esses texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao acessar um índece do vetor que não existe");
        }
        
        System.out.println("Esse texto será impresso após a exception");

        

    }

}
