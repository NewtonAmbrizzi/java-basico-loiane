/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula49;

/**
 *
 * @author Administrator
 */
public class TestandoFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Acesso a índice fora dos limites");
            } finally {
                System.out.println("Essa linha semre será impressa após um try/catch");
            }
        }
    }

}
