/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula33.labs;

/**
 *
 * @author Administrator
 */
public class Lampada {
    
    private String modelo, cor, tipoLuz, tensao;
    private int potenciaWatts, garantiaMeses;
    private String[] tipos;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String cor, String tipoLuz, String tensao, int potenciaWatts, int garantiaMeses, String[] tipos, boolean ligada) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.tensao = tensao;
        this.potenciaWatts = potenciaWatts;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.ligada = ligada;
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isLigada() {
        return ligada;
    }
        
    
    private boolean ascenderLampada(){
        setLigada(true);
        return ligada;
    }
    
    private boolean apagarLampada() {
        setLigada(false );
        return ligada;
    }
    
    public String mostrarEstado() {
        if (isLigada()) {
            return "Lampada acesa";
        } else {
            return "Lampada apagada";
        }
    } 
    
    public boolean mudarEstado() {
        if (isLigada()) {
            return this.apagarLampada();
        } else {
            return this.ascenderLampada();
        }
    }
    
}
