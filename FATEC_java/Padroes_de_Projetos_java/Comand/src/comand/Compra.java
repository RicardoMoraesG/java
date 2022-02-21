
package comand;

public class Compra {

    public static int contador_id;
    public int idNotaFiscal;
    private String nomeLoja;
    private double valorTotal;

    public Compra(String nomeLoja) {
        this.idNotaFiscal = ++contador_id;
        this.nomeLoja = nomeLoja;
    }

    public void setValor(double valor) {
        this.valorTotal = valor;
    }

}
