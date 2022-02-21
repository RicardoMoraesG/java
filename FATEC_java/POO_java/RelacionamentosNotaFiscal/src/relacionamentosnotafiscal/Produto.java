/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionamentosnotafiscal;

/**
 *
 * @author Usuario
 */
public class Produto {
    private double preco;
    private String descricao;

    public Produto(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "preco=" + preco + ", descricao=" + descricao + '}';
    }
    
    
    
    
}
