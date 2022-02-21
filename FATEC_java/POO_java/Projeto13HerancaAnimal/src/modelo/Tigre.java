/**
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala 
   com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
 */
package modelo;
public class Tigre extends Felino{
    private String cor;

    public Tigre(String cor, String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
        this.cor = cor;
    }

    public Tigre() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public void makeNoise(){
        System.out.println("Urra");
    }
    @Override
    public void getInformacao(){
        super.getInformacao();
        System.out.println("Cor: "+this.getCor());
        
    }
}
