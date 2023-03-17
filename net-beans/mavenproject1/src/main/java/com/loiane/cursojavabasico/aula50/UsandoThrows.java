/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class UsandoThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Entre com um numero decimal");
        try {
            double num = leNumero();
        } catch (Exception ex) {
            System.out.println("Entrada inválida");
            ex.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }

}
