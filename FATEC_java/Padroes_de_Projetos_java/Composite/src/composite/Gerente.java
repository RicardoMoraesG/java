
package composite;

import java.util.ArrayList;

public class Gerente extends Empregado {

    private ArrayList<Empregado> listaSubordinados = new ArrayList();
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void print() {
        System.out.println("Nome: " + super.nome);
        listaSubordinados.forEach((e) -> {
            e.print();
        });
    }
    
    @Override
    public void add(Empregado e) {
        listaSubordinados.add(e);
        
    }
    
    @Override
    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
    
}
