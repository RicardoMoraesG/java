/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionamentosnotafiscal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Item {
    private int quantidade;
    private double valorItem;
    private int numero;    
    private Produto produto;
    private ArrayList<Integer> numeracao = new ArrayList<>();
    
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorItem = produto.getPreco() * this.getQuantidade();
        numeracao.add(1);
        this.numero = numeracao.size() + 1;
    }
       
    //SETTERS
    
    public void setNumero(int numero) {
        
    }
    //GETTERS
    public int getQuantidade() {
        return quantidade;
    }
    public double getValorItem() {
        return valorItem;
    }
    public int getNumero() {
        return numero;
    }
    public Produto getProduto() {
        return produto;
    }
    
    

    
    
}
