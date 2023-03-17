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
public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean validaInfo = false;
        
        
        do {
            System.out.println("Digite o nome:");
            nome = scanner.nextLine();
        } while (nome.length() < 3);
        
        do {
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
        } while (idade > 0 && idade < 150);
        
        do {
            System.out.println("Digite o salário:");
            salario = scanner.nextDouble();
        } while (salario < 0);
        
        do {
            System.out.println("Digite o sexo: (m / f)");
            sexo = scanner.next();
        } while (!sexo.equalsIgnoreCase("f") || !sexo.equalsIgnoreCase("m"));
        
        do {
            System.out.println("Estado civil: (S-Solteiro/C-Casado/V-Viúvo/D-Divorciado");
            estadoCivil = scanner.next();
        } while (!sexo.equalsIgnoreCase("s") || !sexo.equalsIgnoreCase("c") ||
                !sexo.equalsIgnoreCase("v") || !sexo.equalsIgnoreCase("d"));
        
        //Resolução alternativa
        
        do {
            System.out.println("Digite o nome:");
            nome = scanner.nextLine();
            
            if (nome.length() > 3) {
                validaInfo = true;
            } else {
                System.out.println("Nome deve ter mais de 3 caracteres");
            }
        } while (!validaInfo);
        
        validaInfo = false;
        
        do {
            System.out.println("Digite a idade:");
            idade = scanner.nextInt();
            
            if (idade > 0 && idade < 150) {
                validaInfo = true;
            } else {
                System.out.println("Idade deve estar entre 0 e 150");
            }
        } while (!validaInfo);
        
        validaInfo = false;
        
        do {
            System.out.println("Digite o salário:");
            salario = scanner.nextDouble();
            
            if (salario < 0) {
                validaInfo = true;                
            } else {
                System.out.println("Salário deve ser maior que 0");
            }
        } while (!validaInfo);
        
        validaInfo = false;
        
        do {
            System.out.println("Digite o sexo: (m / f)");
            sexo = scanner.next();
            
            if (!sexo.equalsIgnoreCase("f") || !sexo.equalsIgnoreCase("m")){
                validaInfo = true;
            } else {
                System.out.println("Digite uma opção válida (m/f)");
            }
            
        } while (!validaInfo);
        
        validaInfo = false;
            
        do {
            System.out.println("Estado civil: (S-Solteiro/C-Casado/V-Viúvo/D-Divorciado");
            estadoCivil = scanner.next();
            
            if (!sexo.equalsIgnoreCase("s") || !sexo.equalsIgnoreCase("c") ||
                !sexo.equalsIgnoreCase("v") || !sexo.equalsIgnoreCase("d")) {
                validaInfo = true;
            } else {
                System.out.println("Digite uma opção válida (s/c/v/d)");
            }
        } while (!validaInfo);
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

    }
    
}
