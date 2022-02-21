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
public class Nota {
    private int numero;
    private int serie;
    private int valorTotal;
    private Empresa emissor;
    private Empresa destinatario;
    private ArrayList<Integer> numeracaoNF = new ArrayList<>();
    public ArrayList<Item> itens = new ArrayList<>();

    public Nota(Empresa emissor, Empresa destinatario) {
        this.emissor = emissor;
        this.destinatario = destinatario;
        numeracaoNF.add(1);
        this.numero = numeracaoNF.size();
        this.serie = 1;
    }
    public void addItens(Item it)  {
        itens.add(it);
    }
    public void ImprimirNF() {
        System.out.println("NF " + this.numero + " Série: " + this.serie);
        
        System.out.println(" Emissor: " + this.emissor.getNomeRazaoSocial() 
                + " CPF/CNPJ: " + this.emissor.getCpfCnpj());
        System.out.println(" Endereço Emissor: " );
        this.emissor.getEndereco();
        
        System.out.println(" Destinatário: " + this.destinatario.getNomeRazaoSocial() 
                + "CPF/CNPJ: " + this.destinatario.getCpfCnpj());
        System.out.println(" Endereço Destinatário: ");
        this.destinatario.getEndereco();
        System.out.println("");
        System.out.println(" ITENS: ");
        int i;
        for (i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i).getNumero()
                    + " Qtd. " + itens.get(i).getQuantidade() 
                    + " PRODUTO - " + itens.get(i).getProduto().getDescricao()
                    + " R$ "+ itens.get(i).getValorItem()
                    );
        }
        System.out.println(" Valor Total R$: " + this.valorTotal);
        
        System.out.println("");
        System.out.println(" Sistema NFPrinter - Desenvolvido por Override Software");
    }


    /**
    * calcula o valor total da NF somando o valor de cada item listado.
    */
    private void setValorTotal() {
        int i;
         for (i = 0; i < itens.size(); i++) {
            this.valorTotal += itens.get(i).getValorItem();
         }       
    }

    //GETTERS
    public double getNumero() {
        return numero;
    }

    public int getSerie() {
        return serie;
    }

    public int getValorTotal() {
        return valorTotal;
    }
    
    
}
