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
public class HomeTheater {

    private boolean ligado = false;
    private int volume;//0 a 10.

    public HomeTheater() {
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Ligando home theater: som direito OK! som esquerdo OK!");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Desligando Home Theater...");
    }
}
