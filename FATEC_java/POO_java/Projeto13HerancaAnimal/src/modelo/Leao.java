package modelo;
public class Leao extends Felino{
    private String origem;

    public Leao(String origem, String comida, String habitat, String tipo) {
        super(comida, habitat, tipo);
        this.origem = origem;
    }

    public Leao() {
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    @Override
    public void makeNoise(){
        System.out.println("Urra");
    }
    @Override
     public void getInformacao(){
        super.getInformacao();
            System.out.println("Origem: " + this.getOrigem());
    }
}
