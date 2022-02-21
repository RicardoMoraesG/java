
package comand;

public class Loja {
    private String nomeLoja;

    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
    
    public void executarCompra(double valor, PagamentoComand formaPagamento) {
        Compra compra = new Compra(nomeLoja);
        compra.setValor(valor);
        formaPagamento.processarCompra(compra);
        
    }
}
