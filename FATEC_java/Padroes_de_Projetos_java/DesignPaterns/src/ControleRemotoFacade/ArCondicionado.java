/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleRemotoFacade;

/**
 *
 * @author aluno
 */
public class ArCondicionado {

    private int temperatura;
    private boolean ligado = false;

    public void ligar() {
        this.ligado = true;
        System.out.println("Ar condicionado ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando ar condicionado...");
    }

    public ArCondicionado(int temperatura) {
        this.temperatura = temperatura;
    }
    

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

}
