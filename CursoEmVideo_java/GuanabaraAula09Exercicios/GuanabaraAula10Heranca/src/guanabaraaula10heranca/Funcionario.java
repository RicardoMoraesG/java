package guanabaraaula10heranca;
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public void mudarTrabalho(){
        this.setTrabalhando(false);
        System.out.println("Funcionário mudou de trabalho");
    }
    @Override
    public String Informacao() {
        String trab;
        if (this.trabalhando){
            trab = "sim";
        } else
            trab = "não";
        return "Pessoa{" + "nome " + this.getNome() + ", idade " + this.getIdade() + ", sexo " + this.getSexo() + '}'+
                "\nFuncionário{" + "Setor" + setor + ", Trabalhando " + trab + '}' ;
    }
}
