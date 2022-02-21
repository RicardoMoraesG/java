/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

/**
 *
 * @author rodrigo
 */
@Decorator
public class DescontoDecorator implements Produto {

    @Inject
    @Any
    @Delegate
    private Produto produto;

    @Override
    public void setLabel(String label) {
        produto.setLabel(label);
    }

    @Override
    public void setPreco(double preco) {
        produto.setPreco(preco);
    }

    @Override
    public String getLabel() {
        return produto.getLabel();
    }

    @Override
    public double getPreco() {
        return produto.getPreco();
    }

    @Override
    public String geraLabel() {
        return "Agora estou no geraLabel do Decorator!!!!!!!";
    }

}
