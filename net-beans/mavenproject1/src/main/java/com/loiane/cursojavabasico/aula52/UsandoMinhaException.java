/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class UsandoMinhaException {
    
    public static void main(String[] args) {
        
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0){ 
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Ocorreu um erro");
                e.printStackTrace();
            }
        }
        
    }
    
}
