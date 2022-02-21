
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
public class Refrigerante extends CoquetelDecorator {
    public Refrigerante(ArrayList<Coquetel> listaCoquetel) {
        super(listaCoquetel);
        nome = "Refrigerante";
        preco = 1.0;
    }
    
}
