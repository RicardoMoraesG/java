/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.decorator;

/**
 *
 * @author rodrigo
 */
public class MesaJantar implements Produto {

    private String label;
    private double preco;

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String geraLabel() {
        return ("Fui Instanciado e estou no geraLabel da classe Mesa Jantar!");
    }
}
