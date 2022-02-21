package projeto09classepessoa;

public class Pessoa {
    
    //DECLARAÇÃO DE ATRIBUTOS
    private int CodPessoa;
    private String nome;
    private String celular;
    private String email;
    private String endereco;
    //Fim de atributos

    //CONSTRUTOR PESSOA
    public Pessoa(int CodPessoa, String nome, String celular, String email, String endereco) {
        this.CodPessoa = CodPessoa;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;        
    }//Fim Contrutor Pessoa()
    
    //GETTERS E SETTERS
    public int getCodPessoa() {
        return CodPessoa;
    }
    public void setCodPessoa(int CodPessoa) {
        this.CodPessoa = CodPessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //Fim Getters e Setters
    
    //STATUS
    public void status(){
        System.out.println("----------------------------------------------------");
        System.out.println("Código : " +getCodPessoa());
        System.out.println("Nome: " +getNome());
        System.out.println("Celular: " +getCelular());
        System.out.println("Email: " +getEmail());
        System.out.println("Endereço: " +getEndereco());
        System.out.println("----------------------------------------------------");
    }//Fim status()
    
}//Fim Classe Pessoa
