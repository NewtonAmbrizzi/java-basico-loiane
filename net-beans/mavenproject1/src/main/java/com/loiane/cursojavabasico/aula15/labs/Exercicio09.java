/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula15.labs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        System.out.println("Digite o primeiro número");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        numero3 = scanner.nextInt();
        
        if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3){
            System.out.println("variável numero3: valor " + numero3);
            System.out.println("variável numero2: valor " + numero2);
            System.out.println("variável numero1: valor " + numero1);
        } else if (numero1 <= numero2 && numero1 <= numero3 && numero2 >= numero3){
            System.out.println("variável numero2: valor " + numero2);
            System.out.println("variável numero3: valor " + numero3);
            System.out.println("variável numero1: valor " + numero1);
        } else if (numero1 >= numero2 && numero1 <= numero3 && numero2 <= numero3){
            System.out.println("variável numero3: valor " + numero3);
            System.out.println("variável numero1: valor " + numero1);
            System.out.println("variável numero2: valor " + numero2);
        } else if (numero1 >= numero2 && numero1 >= numero3 && numero2 <= numero3){
            System.out.println("variável numero1: valor " + numero1);
            System.out.println("variável numero3: valor " + numero3);
            System.out.println("variável numero2: valor " + numero2);
        } else if (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3){
            System.out.println("variável numero1: valor " + numero1);
            System.out.println("variável numero2: valor " + numero2);
            System.out.println("variável numero3: valor " + numero3);
        } else if (numero1 <= numero2 && numero1 >= numero3 && numero2 <= numero3){
            System.out.println("variável numero2: valor " + numero2);
            System.out.println("variável numero1: valor " + numero1);
            System.out.println("variável numero3: valor " + numero3);
        }
        
        int[] numbers = {numero1, numero2, numero3};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                if (numbers[j] < numbers[j + 1]){
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        System.out.println("Bubble sort - " + Arrays.toString(numbers));


        Integer numeros[] = new Integer[3];
        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Collections.reverseOrder - " + Arrays.toString(numeros));
    }
    
}
