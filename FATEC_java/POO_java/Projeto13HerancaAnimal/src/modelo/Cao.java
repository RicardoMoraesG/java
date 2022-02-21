/*
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala 
   com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
 */
package modelo;
public class Cao extends Canino {
    private double tamanho;
 
    public Cao(double tamanho, String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
        this.tamanho = tamanho;
    }
    public Cao() {
    }
//Exclusivo da Classe    
    public double getTamanho(){
        return tamanho;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
//MÉTODOS SUBSTITUTOS
    @Override
    public void makeNoise(){
        System.out.println("Late");
    }
    @Override
    public void getInformacao() {
        super.getInformacao();
        System.out.println("Tamanho: " + this.getTamanho());
    }
    
 
}//Fim Classe
