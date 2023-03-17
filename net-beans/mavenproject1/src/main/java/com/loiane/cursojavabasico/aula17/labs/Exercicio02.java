/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula17.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String user, password;
        
        do {
            System.out.println("Digite o nome de usuário:");
            user = scanner.nextLine();
            System.out.println("Digite a senha:");
            password = scanner.nextLine();
        }while (user.equalsIgnoreCase(password));
        

    }
    
}
