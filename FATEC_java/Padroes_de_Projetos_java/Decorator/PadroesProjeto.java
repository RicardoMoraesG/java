
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rodrigo
 */
public class PadroesProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coquetel meuCoquetel;
        Coquetel meuCoquetel1 = new Cachaca();
        Coquetel meuCoquetel2 = new Cachaca();
        ArrayList<Coquetel> lista = new ArrayList<>();
        lista.add(meuCoquetel1);
        lista.add(meuCoquetel2);
       /*System.out.println(meuCoquetel.getNome() + " = "
                + meuCoquetel.getPreco());
              */
        meuCoquetel = new Refrigerante(lista);
        System.out.println(meuCoquetel.getNome() + " = "
                + meuCoquetel.getPreco());
    }

}
