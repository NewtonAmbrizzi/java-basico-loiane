/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula20.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] diasCompromissos = new String[31][24];
        String encerrar = "";
        boolean continua = true;
        int dia = 0;
        int hora = 0;
        int menu = 0;

        do {
            do {
                System.out.println("Digite um dia de 1 a 31");
                dia = scanner.nextInt();
            } while (dia < 1 || dia > 31);
            do {
                System.out.println("Digite uma hora de 1 a 24");
                hora = scanner.nextInt();
            } while (hora < 1 || hora > 24);

            do {
                System.out.println("Digite:");
                System.out.println("1 - para cadastrar tarefa/compromisso");
                System.out.println("2 - para consultar tarefa/compromisso");
                menu = scanner.nextInt();
            } while (menu < 1 || menu > 2 );

            switch (menu) {
                case 1:
                    System.out.println("Digite a tarefa/compromisso para o dia " + dia + " às " + hora + "H");
                    diasCompromissos[dia - 1][hora -1] = scanner.next();
                    break;
                case 2:
                    System.out.println("Tarefa/Compromisso do dia " + dia + " às " + hora);
                    System.out.println(diasCompromissos[dia - 1][hora - 1]);
                    break;

            }
            
            do {
                System.out.println("Deseja realizar uma nova operação? (S/N)");
                encerrar = scanner.next();
                if (encerrar.equalsIgnoreCase("n")){
                    continua = false;
                } else {
                    continua = true;
                }
                
            } while (!encerrar.equalsIgnoreCase("s" ) && !encerrar.equalsIgnoreCase("n"));

        } while (continua);
    }

}
