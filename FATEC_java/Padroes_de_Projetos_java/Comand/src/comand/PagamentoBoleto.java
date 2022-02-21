
package comand;

public class PagamentoBoleto implements PagamentoComand{

    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Boleto Criado");
        
    }
    
}
