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
public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];
        char marcador = 'X';
        int linha = 0;
        int coluna = 0;
        int vez = 1;
        int rodada = 1;
        String ganhador = "";
        boolean continua = true;
        boolean invalido;

        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                jogoVelha[i][j] = ' ';
            }
        }

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        
        System.out.println("          Col 1|col 2|col 3");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Linha " + i + " -      |     |     ");
            System.out.println("          -----------------");                      
        }


        do {            
            do {
                invalido = false;
                do { //Escolhendo a linha
                    System.out.println("\nJogador " + vez + " escolha uma linha de 1 a 3");
                    linha = scanner.nextInt();
                    if (linha < 1 || linha > 3) {
                        System.out.println("Linha selecionada inválida, selecione uma linha entre 1 e 3");
                    }
                } while (linha < 1 || linha > 3);
                
                do { //Escolhendo a coluna
                    System.out.println("\nJogador " + vez + " escolha uma coluna de 1 a 3");
                    coluna = scanner.nextInt();
                    if (coluna < 1 || coluna > 3) {
                        System.out.println("Coluna selecionada inválida, selecione uma coluna entre 1 e 3");
                    }
                } while (coluna < 1 || coluna > 3);
                
                if (jogoVelha[linha - 1][coluna - 1] != ' ') { //Valida o local escolhido
                    invalido = true;
                    System.out.println("Jogada inválida o local escolhido já está ocupado, tente outra coordenada de linha/coluna");
                }
                
            } while (invalido);
            
            linha--;
            coluna--;
            
            jogoVelha[linha][coluna] = marcador;
            
            System.out.println("          Col 1|col 2|col 3");
            for (int i = 0; i < jogoVelha.length; i++){
                System.out.print("Linha " + (i + 1) + " -   ");
                for (int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + ((j == 2) ? "" :"  |  "));
                }
                System.out.println("\n          -----------------");
            }
            

            if (rodada == 9){
                continua = false;
                ganhador = "Empate";
            }
            
            if (rodada >= 5){
                if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                        (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                        (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
                        (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
                        (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                        (jogoVelha[0][2] == 'X' && jogoVelha[0][2] == 'X' && jogoVelha[2][2] == 'X') ||
                        (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') ||
                        (jogoVelha[2][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[0][2] == 'X') ||                        
                        (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                        (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                        (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                        (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                        (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                        (jogoVelha[0][2] == 'O' && jogoVelha[0][2] == 'O' && jogoVelha[2][2] == 'O') ||
                        (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
                        (jogoVelha[2][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[0][2] == 'O')
                        ){
                    ganhador = "Vencedor - Jogador " + vez;
                    continua = false;
                }
            }
            
            if (vez == 1 && continua) {
                vez++;
                marcador = 'O';
            } else if (continua) {
                vez--;
                marcador = 'X';
            }
            
            rodada++;

        } while (continua);
        
        System.out.println("Resultado: " + ganhador);
        
    }

}
