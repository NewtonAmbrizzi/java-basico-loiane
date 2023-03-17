/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

/**
 *
 * @author Administrator
 */
public class JogoVelha {
    
    private char[][] jogoVelha;
    private char marcador;
    private int linha = 0;
    private int coluna = 0;
    private int vez = 1;
    private int rodada = 1;
    private String ganhador = "";
    private boolean invalido;

    public JogoVelha() {
        this.jogoVelha = new char[3][3];
    }

    public void iniciaJogo() {

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        System.out.println();

        for (int i = 0; i < getJogoVelha().length; i++) {
            for (int j = 0; j < getJogoVelha()[i].length; j++) {
                getJogoVelha()[i][j] = ' ';
            }
        }
        
        definirVez();
        desenharTabuleiro();

    }

    public void desenharTabuleiro() {

        System.out.println("          Col 1|col 2|col 3");
        for (int i = 0; i < getJogoVelha().length; i++) {
            System.out.print("Linha " + (i + 1) + " -   ");
            for (int j = 0; j < getJogoVelha()[i].length; j++) {
                System.out.print(getJogoVelha()[i][j] + ((j == 2) ? "" : "  |  "));
            }
            System.out.println("\n          -----------------");
        }

    }

    public boolean validarLinha() {
        return !(getLinha() < 1 || getLinha() > 3);
    }

    public boolean validarColuna() {
        return !(getColuna() < 1 || getColuna() > 3);
    }

    public boolean validarJogada() {
        //Valida o local escolhido
        
        return getJogoVelha()[getLinha() - 1][getColuna() - 1] == ' ';
    }

    public boolean verificarGanhador() {
        if (getRodada() > 9) {
            setGanhador("Jogo empatado, sem ganhador");
            return true;
        }        
        if ((getJogoVelha()[0][0] == 'X' && getJogoVelha()[0][1] == 'X' && getJogoVelha()[0][2] == 'X')
                || (getJogoVelha()[1][0] == 'X' && getJogoVelha()[1][1] == 'X' && getJogoVelha()[1][2] == 'X')
                || (getJogoVelha()[2][0] == 'X' && getJogoVelha()[2][1] == 'X' && getJogoVelha()[2][2] == 'X')
                || (getJogoVelha()[0][0] == 'X' && getJogoVelha()[1][0] == 'X' && getJogoVelha()[2][0] == 'X')
                || (getJogoVelha()[0][1] == 'X' && getJogoVelha()[1][1] == 'X' && getJogoVelha()[2][1] == 'X')
                || (getJogoVelha()[0][2] == 'X' && getJogoVelha()[0][2] == 'X' && getJogoVelha()[2][2] == 'X')
                || (getJogoVelha()[0][0] == 'X' && getJogoVelha()[1][1] == 'X' && getJogoVelha()[2][2] == 'X')
                || (getJogoVelha()[2][0] == 'X' && getJogoVelha()[1][1] == 'X' && getJogoVelha()[0][2] == 'X')
                || (getJogoVelha()[0][0] == 'O' && getJogoVelha()[0][1] == 'O' && getJogoVelha()[0][2] == 'O')
                || (getJogoVelha()[1][0] == 'O' && getJogoVelha()[1][1] == 'O' && getJogoVelha()[1][2] == 'O')
                || (getJogoVelha()[2][0] == 'O' && getJogoVelha()[2][1] == 'O' && getJogoVelha()[2][2] == 'O')
                || (getJogoVelha()[0][0] == 'O' && getJogoVelha()[1][0] == 'O' && getJogoVelha()[2][0] == 'O')
                || (getJogoVelha()[0][1] == 'O' && getJogoVelha()[1][1] == 'O' && getJogoVelha()[2][1] == 'O')
                || (getJogoVelha()[0][2] == 'O' && getJogoVelha()[0][2] == 'O' && getJogoVelha()[2][2] == 'O')
                || (getJogoVelha()[0][0] == 'O' && getJogoVelha()[1][1] == 'O' && getJogoVelha()[2][2] == 'O')
                || (getJogoVelha()[2][0] == 'O' && getJogoVelha()[1][1] == 'O' && getJogoVelha()[0][2] == 'O')) {
            setGanhador("Resultado: Vencedor - Jogador " + getVez());
            return true;
        }
        return false;
    }
    
    public void definirVez() {
        if (getRodada() % 2 != 0) {
            setVez(1);
            setMarcador('X');
        } else {
            setVez(2);
            setMarcador('O');
        }
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void marcarJogada(int i, int j) {
        getJogoVelha()[i][j] = getMarcador();
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

    /**
     * @return the jogoVelha
     */
    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    /**
     * @param jogoVelha the jogoVelha to set
     */
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    /**
     * @return the marcador
     */
    public char getMarcador() {
        return marcador;
    }

    /**
     * @param marcador the marcador to set
     */
    public void setMarcador(char marcador) {
        this.marcador = marcador;
    }

    /**
     * @param ganhador the ganhador to set
     */
    public void setGanhador(String ganhador) {
        this.ganhador = ganhador;
    }
    
}
