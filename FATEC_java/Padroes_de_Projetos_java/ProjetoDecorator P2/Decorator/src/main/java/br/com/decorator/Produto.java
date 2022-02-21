package br.com.decorator;

/**
 *
 * @author rodrigo
 */
public interface Produto {
    
    //setters
    public void setLabel(String label);

    public void setPreco(double preco);
    //getters

    public String getLabel();

    public double getPreco();

    public String geraLabel();
}
