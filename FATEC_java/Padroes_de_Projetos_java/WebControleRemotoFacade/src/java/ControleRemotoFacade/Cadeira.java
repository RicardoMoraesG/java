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
public class Cadeira {

    private int anguloInclinacao;

    public Cadeira(int anguloInclinacao) {
        this.anguloInclinacao = anguloInclinacao;
    }
    

    public void baixar() {
        System.out.println("baixando cadeira");
        this.anguloInclinacao = this.anguloInclinacao + 20;
    }

    public void levantar() {
        System.out.println("levantando cadeira");
        if (this.anguloInclinacao == 90) {
            System.out.println("Cadeiras chegaram na altura total");
        }
        this.anguloInclinacao = this.anguloInclinacao - 20;
    }

    public int getAngulo() {
        return anguloInclinacao;
    }

    public void setAngulo(int angulo) {
        if (angulo < 90) {
            System.out.println("altura máxima é 90º ");
        } else {
            if (angulo > 180) {
                System.out.println("inclinação máxima é de 180º");
            } else {
                this.anguloInclinacao = angulo;
            }
        }

    }
}
