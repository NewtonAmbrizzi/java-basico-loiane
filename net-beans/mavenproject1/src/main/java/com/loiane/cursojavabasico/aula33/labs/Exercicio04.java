/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JogoVelha jogoVelha = new JogoVelha();

        jogoVelha.iniciaJogo();
        
        
        do {
            do {
                do {
                    System.out.println("\nJogador " + jogoVelha.getVez() + " escolha uma linha de 1 a 3");
                    jogoVelha.setLinha(scanner.nextInt());
                    System.out.println(!jogoVelha.validarLinha() ? "Linha selecionada inválida, selecione uma linha entre 1 e 3":"");
                } while (!jogoVelha.validarLinha());
                
                do {
                    System.out.println("\nJogador " + jogoVelha.getVez() + " escolha uma coluna de 1 a 3");
                    jogoVelha.setColuna(scanner.nextInt());
                    System.out.println(!jogoVelha.validarColuna() ? "Coluna selecionada inválida, selecione uma coluna entre 1 e 3":"");
                } while (!jogoVelha.validarColuna());
                
                System.out.println(!jogoVelha.validarJogada() ? "Jogada inválida o local escolhido já está ocupado, tente outra coordenada de linha/coluna":"");
            } while (!jogoVelha.validarJogada());

            
            jogoVelha.marcarJogada((jogoVelha.getLinha() - 1), (jogoVelha.getColuna() - 1));
            jogoVelha.desenharTabuleiro();
            
            if (jogoVelha.verificarGanhador()){
                System.out.println(jogoVelha.getGanhador());
            }
            
            jogoVelha.setRodada((jogoVelha.getRodada() + 1));
            jogoVelha.definirVez();
            
        } while (!jogoVelha.verificarGanhador());
        

    }
    
}
