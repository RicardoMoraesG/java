package comand;

public class Comand {

    public static void main(String[] args) {
        
        Loja lojasX = new Loja("LojaX");
        lojasX.executarCompra(1000, new PagamentoBoleto() );
    }

}
