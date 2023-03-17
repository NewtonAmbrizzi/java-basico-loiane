/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula27.labs;

/**
 *
 * @author Administrator
 */
public class JogoVelha {

    char[][] jogoVelha = new char[3][3];
    char marcador;
    int linha = 0;
    int coluna = 0;
    int vez = 1;
    int rodada = 1;
    String ganhador = "";
    boolean continua = true;
    boolean invalido;

    void iniciaJogo() {

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        System.out.println();

        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                jogoVelha[i][j] = ' ';
            }
        }
        
        definirVez();
        desenharTabuleiro();

    }

    public void desenharTabuleiro() {

        System.out.println("          Col 1|col 2|col 3");
        for (int i = 0; i < jogoVelha.length; i++) {
            System.out.print("Linha " + (i + 1) + " -   ");
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + ((j == 2) ? "" : "  |  "));
            }
            System.out.println("\n          -----------------");
        }

    }

    public boolean validarLinha() {
        if (getLinha() < 1 || getLinha() > 3) {
            return false;
        }
        return true;
    }

    public boolean validarColuna() {
        if (getColuna() < 1 || getColuna() > 3) {
            return false;
        }
        return true;
    }

    public boolean validarJogada() {
        if (jogoVelha[getLinha() - 1][getColuna() - 1] == ' ') { //Valida o local escolhido
            return true;
        }
        return false;
    }

    public boolean verificarGanhador() {
        if (rodada == 9) {
            ganhador = "Jogo empatado, sem ganhador";
            return true;
        }        
        if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
                || (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')
                || (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')
                || (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')
                || (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')
                || (jogoVelha[0][2] == 'X' && jogoVelha[0][2] == 'X' && jogoVelha[2][2] == 'X')
                || (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')
                || (jogoVelha[2][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[0][2] == 'X')
                || (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
                || (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')
                || (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')
                || (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')
                || (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')
                || (jogoVelha[0][2] == 'O' && jogoVelha[0][2] == 'O' && jogoVelha[2][2] == 'O')
                || (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')
                || (jogoVelha[2][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[0][2] == 'O')) {
            ganhador = "Resultado: Vencedor - Jogador " + vez;
            return true;
        }
        return false;
    }
    
    void definirVez() {
        if (rodada % 2 != 0) {
            vez = 1;
            marcador = 'X';
        } else {
            vez = 2;
            marcador = 'O';
        }
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void marcarJogada(int i, int j) {
        jogoVelha[i][j] = marcador;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public boolean isInvalido() {
        return invalido;
    }

    public void setInvalido(boolean invalido) {
        this.invalido = invalido;
    }

    public String getGanhador() {
        return ganhador;
    }
    
    

}
