/*
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala 
   com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
 */
package modelo;
public class Felino extends Animal {
    public Felino() {
    }

    public Felino(String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
    }
    
}