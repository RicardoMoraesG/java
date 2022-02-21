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
public class BlueRay {

    private boolean ligado = false;

    public void ligar() {
        this.ligado = true;
        System.out.println("BlueRay ligado.");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Desligando BlueRay...");
    }


}
