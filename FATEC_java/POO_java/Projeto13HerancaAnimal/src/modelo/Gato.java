package modelo;
public class Gato extends Felino{
    private String raca;

    public Gato(String raca, String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
        this.raca = raca;
    }

    public Gato() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public  void makeNoise(){
        System.out.println("Mia");
    }
    @Override
    public void getInformacao(){
        super.getInformacao();
        System.out.println("Raça: "+this.getRaca());
        
    }   
}
