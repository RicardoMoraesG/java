
package composite;

public abstract class Empregado {

    String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract void print();
    public abstract void add(Empregado e);
    public abstract void remove(Empregado e);
}
