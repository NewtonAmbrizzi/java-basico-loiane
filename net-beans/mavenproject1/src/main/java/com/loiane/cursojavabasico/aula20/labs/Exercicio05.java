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
public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][][] tarefas = new String[12][31][8];
        int mes = 0;
        boolean continua = true;
        int opcao;
        int maxDiasMes = 31;
        int dia = 0;
        int hora = 0;
        String tarefa;

        do {

            System.out.println("Escolha uma opção:"
                    + "\n1 - Cadastrar tarefa/compromisso"
                    + "\n2 - Consultar tarefa/compromisso"
                    + "\n0 - Sair");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                continua = false;
            } else if (opcao == 1 || opcao == 2) {

                do {
                    System.out.println("Digite o mês:");
                    mes = scanner.nextInt();

                    if (mes < 1 || mes > 12) {
                        System.out.println("Mes inválido");
                    }
                } while (mes < 1 || mes > 12);

                do {
                    System.out.println("Digite o dia entre 1 e " + maxDiasMes);
                    dia = scanner.nextInt();
                    if (dia < 1 || dia > maxDiasMes) {
                        System.out.println("Dia inválido");
                    }
                } while (dia < 1 || dia > maxDiasMes);

                do {
                    System.out.println("Digite a hora entre 1 e 8");
                    hora = scanner.nextInt();
                    if (hora < 1 || hora > 8) {
                        System.out.println("Hora inválida");
                    }
                } while (hora < 1 || hora > 8);

                if (opcao == 1) {
                    System.out.println("Digite a tarefa/compromisso para o dia " + dia + " às " + hora + "H");
                    tarefa = scanner.next();
                    tarefas[mes - 1][dia - 1][hora - 1] = tarefa;
                }

                if (opcao == 2) {
                    System.out.println("Tarefa/Compromisso do dia " + dia + " às " + hora + "H");
                    System.out.println(tarefas[mes - 1][dia - 1][hora - 1]);
                }

            } else {
                System.out.println("Opção digitada inválida");
            }

        } while (continua);
    }

}
