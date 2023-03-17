/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula35;

import com.loiane.cursojavabasico.aula34.labs.*;

/**
 *
 * @author Administrator
 */
public class Calculadora {
    
    
    public static int fatorialNaoRecursivo(int num){
        if (num == 0){
            return 1;
        }
        
        int fatorial = num;
        for (int i = num-1; i > 0; i--){
            fatorial *= i;
        }
        return fatorial;
    }
    
    public static int fatorialRecursivo(int num) {
        
        if (num == 0) {
            return 1;
        }
        
        return num * fatorialRecursivo(num - 1);
    }
    
}
