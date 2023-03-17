/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        int anoAtual = calendar.get(calendar.YEAR);
        
        System.out.println("Informe o salário em 1996:");
        double salario = scanner.nextDouble();
        double percentualReajuste = 1.5;
        salario += (salario/100) * percentualReajuste;
        
        System.out.println("Ano ------- Salário");
        for (int i = 1997; i <= anoAtual; i++) {
            percentualReajuste *= 2;
            salario += (salario/100) * percentualReajuste;
            System.out.println(i + " ------ R$ " + salario);
        }
        
        

    }
    
}
