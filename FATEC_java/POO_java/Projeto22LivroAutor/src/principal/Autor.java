package principal;
import java.util.ArrayList;
/**
 * Relacionamentos entre classes
 * @author Usuario
 */
public class Autor {
     private String nome;
    private int anoNasc;
    private String email;
    ArrayList<Livro> Obra = new ArrayList<>();

    public Autor() {
    }

    public Autor(String nome, int anoNasc, String email) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.email = email;
    }
//setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
/**
 * exibe um objeto de um indice em uma ArrayList
 */  
    public void getObra() {
        System.out.println("PUBLICAÇÕES DO AUTOR");
        for (int i = 0; i < Obra.size(); i++){
            System.out.println("\t: " + this.Obra.get(i).getTitulo());
        }
    }
/**
 * passa como parametro um objeto de uma outra classe: Livro.
 * @param liv 
 */
    public void setObra(Livro liv) {
        Obra.add(liv);
    }
   
}
