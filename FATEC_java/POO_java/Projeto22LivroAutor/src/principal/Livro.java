package principal;
import java.util.ArrayList;
/**
 * Relacionamentos entre classes.
 * @author Usuario
 */
public class Livro {
    private String Titulo;
    private String Editora;
    private int ano;
    /**
     * referencía uma ArrayList tipada de uma classe diferente da atual.
     */
    ArrayList<Autor> Escritores = new ArrayList<>();

    public Livro() {
    }

    public Livro(String Titulo, String Editora, int ano) {
        this.Titulo = Titulo;
        this.Editora = Editora;
        this.ano = ano;

    }
//getter e setter
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
/**
 * exibe um objeto de um indice em uma ArrayList
 */   
    public void getEscritores() {
        
        for (int i = 0; i < Escritores.size(); i++){
            System.out.println(" Autor" + this.Escritores.get(i).getNome());
            
        }
    }
/**
 * passa como parametro um objeto de uma outra classe: Autor.
 * @param aut 
 */
    public void setEscritores(Autor aut) {
        Escritores.add(aut);
    }

}//Fim classe
