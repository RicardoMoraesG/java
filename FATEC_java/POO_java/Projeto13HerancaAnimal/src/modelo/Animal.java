/**
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala 
   com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
 */
package modelo;
public class Animal {
    private String comida;
    private String habitat;
    private String tipo;
    
    public Animal() {
        
    }
    
    public Animal(String comida, String habitat, String tipo) {
        this.comida = comida;
        this.habitat = habitat;
        this.tipo = tipo;
    }
    
    //GETTERS E SETTERS
    public String getComida() {
        return comida;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//FIM GETTER E SETTER
    
    public void makeNoise(){
        System.out.println("Fazer Barulho");
    }
    
    public void getInformacao(){
        System.out.println();
        System.out.println("ANIMAL: " +this.getTipo());
        System.out.println("Comida: " +this.getComida());
        System.out.println("Habitat: "  +this.getHabitat());
        System.out.print("Barulho: ");
        this.makeNoise();
    }//Fim getInformacao*/
    
    
}//Fim Classe Animal
