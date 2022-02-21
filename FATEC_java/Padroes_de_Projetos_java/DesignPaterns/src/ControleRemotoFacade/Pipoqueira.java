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
public class Pipoqueira {
    private String sabor;//manteiga, sal, doce, queijo...
    private String tamanho;//pequena, media, grande.

    public Pipoqueira(String sabor, String tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }
    
    public void estourarPipoca(String sabor){
        this.sabor = sabor;
        this.tamanho = tamanho;
        System.out.println("pipoca estourando...");
        System.out.println("pipoca "+ this.sabor + " tamanho " + this.tamanho + " pronta!");
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
}
