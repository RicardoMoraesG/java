/*
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala 
   com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
 */
package modelo;
public class Lobo extends Canino{
    private double peso;

    public Lobo(double peso, String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
        this.peso = peso;
    }

    public Lobo() {
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
     

//METODOS SUBSTITUTOS
   
    @Override
    public void makeNoise(){
        System.out.println("Uiva");
    }
    @Override
        public void getInformacao(){
        super.getInformacao();
            System.out.println("Peso: " + this.getPeso());
    }//Fim getInformacao*/

 
    
}
