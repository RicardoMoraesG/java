
package modelo;

public class Atleta {
    //Atributos
    private int idAtleta;
    private String nome;
    private String equipe;
    private String cidade;
    private String estado;
    //Fim atributos

    //Construtor Vazio
    public Atleta() {
    }
    //Construtor Cheio
    public Atleta(int idAtleta, String nome, String equipe, String cidade, String estado) {
        this.idAtleta = idAtleta;
        this.nome = nome;
        this.equipe = equipe;
        this.cidade = cidade;
        this.estado = estado;
    }
    //Fim Construtores
    
    //Getters e Setters
    public int getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(int idAtleta) {
        this.idAtleta = idAtleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Fim Getters e Setters
    
    
}
