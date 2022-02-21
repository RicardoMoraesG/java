package guanabaraaula10heranca;
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    private boolean matriculado;
    public Aluno(int matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
        this.matriculado = false;
    }

    public int getMatr() {
        if (!matriculado)
            System.out.println("MATRICULA FOI CANCELADA");
        return matr;
    }   

    public void setMatr(int matr) {
        this.matr = matr;
        if ( this.matr > 0 ) {
            matriculado = true;
        }
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatr(){
        System.out.println("Matricula " +this.getMatr() + " Cancelada!");
        matriculado = false;
    }
}
