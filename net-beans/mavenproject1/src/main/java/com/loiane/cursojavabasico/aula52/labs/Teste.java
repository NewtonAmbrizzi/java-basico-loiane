/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula52.labs;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) {
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                adicionarContato(scan, agenda);
            } else if (opcao == 3) {
                System.exit(0);
            }

        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = leInfoString(scan, "Digite o nome do seu contato:");
            String telefone = leInfoString(scan, "Digite o telefone do seu contato:");
            String email = leInfoString(scan, "Digite o e-mail do seu contato:");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato sendo criado: ");
            System.out.println(contato);

            agenda.AdicionarContato(contato);
        } catch (AgendaCheiaException ex) {
            System.out.println(ex.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInfoString(scan, "Digite o nome do contato que deseja pesquisar:");
        try {
            System.out.println(agenda.consultaContato(nomeContato));
        } catch (ContatoNaoExisteException ex) {
            System.out.println(ex.getMessage());;
        }
    }

    public static String leInfoString(Scanner scan, String mensagem) {
        System.out.println(mensagem);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("\nDigite a opção desejada:");
            System.out.println("Opcção 1: Consultar cotato");
            System.out.println("Opcção 2: Adicionar contato");
            System.out.println("Opcção 3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }

        return opcao;
    }

}
