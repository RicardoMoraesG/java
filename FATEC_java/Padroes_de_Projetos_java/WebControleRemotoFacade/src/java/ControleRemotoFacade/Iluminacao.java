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
public class Iluminacao {

    private int intensidade;//de 1 a 10, suponhamos que já esteja ligada quando o usuario escolher o filme.
    private boolean ligado = true;

    public Iluminacao(int intensidade) {
        this.intensidade = intensidade;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        if ((intensidade < 0) || (intensidade > 10)) {
            System.out.println("escolha entre 0 e 10");
        } else {
            this.intensidade = intensidade;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
