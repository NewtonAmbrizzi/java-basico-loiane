/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojavabasico.aula52.labs;

/**
 *
 * @author Administrator
 */
public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "A Agenda já está cheia";
    }
    
    
    
}
