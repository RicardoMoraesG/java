/*
1) Criar um novo Projeto Java: Projeto13HerancaAnimal
2) Criar uma classe JAVA para cada classe do diagrama mostrado em sala com seus atributos e Métodos: Construtores vazio e cheio, e os métodos getters e setters.
3) Sobrescrever método makeNoise() nas subclasses mais especializadas;
4) No método MAIN da classe Principal instanciar:
um objeto de cada classe;
5) Postar no repositório (private) do Github do aluno e me convidar como colaborador (moraes65).
6) Observar o prazo para entrega.tor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Projeto13HerancaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ring comida, String habitat, String tipo, double tamanho
        Cao cao1 = new Cao(0.6,"Ração","Fazenda", "Cão Pastor Alemão");
        cao1.getInformacao();
        //double peso, String comida, String habitat, String tipo
        Lobo lobo1 = new Lobo(30,"Caça","Cerrado","Lobo Guará");
        lobo1.getInformacao();
        //Gato(String raca, String comida, String habitat, String tipo)
        Gato gato1 = new Gato("Siames","Ração","Telhado","Gato");
        gato1.getInformacao();
        //(String cor, String comida, String habitat, String tipo)
        Tigre tigre1 = new Tigre("Rajado","Caça","Florestas Asiáticas", "Tigre de Bengala");
        tigre1.getInformacao();
        //Leao(String origem, String comida, String habitat, String tipo
        Leao leao1 = new Leao("Africa", "Caça","Savana Africana", "Leão");
        leao1.getInformacao();
        
       
    }
    
}
