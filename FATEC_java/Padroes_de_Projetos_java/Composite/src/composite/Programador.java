
package composite;

public class Programador extends Empregado {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void print() {
        System.out.println("Nome " + super.nome);
    }

    @Override
    public void add(Empregado e) {
        System.out.println("não é possivel adicionar empregado subordinado ao prigramador");}

    @Override
    public void remove(Empregado e) {
        System.out.println("não e possivel");
    }

}
