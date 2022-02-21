
import java.util.ArrayList;

public abstract class CoquetelDecorator extends Coquetel {
    
    ArrayList<Coquetel> listacoquetel;
 
    public CoquetelDecorator(ArrayList<Coquetel> lista) {
        listacoquetel = lista;
    }
    @Override
    public String getNome() {
        String nomesBebidas = nome;
        for(Coquetel coquetel : listacoquetel){
            nomesBebidas += "+" +coquetel.getNome();
            //System.out.println("Bebidas: " + coquetel.getNome());
            
        }
        return nomesBebidas;        
    }
    
    public double getPreco() {
        double valor = 0;
        for(Coquetel coquetel : listacoquetel){
            valor = coquetel.getPreco();            
        }
        return valor + preco;
    }
    
}
