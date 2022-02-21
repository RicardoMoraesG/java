/*
 CONCEITOS DE AGREGAÇÃO
 *
 CONCEITOS DE INTERFACE
*/
package guanabaraexerciciopooaula9;
public class Livro implements IPublicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;//CONCEITO DE AGREGAÇÃO: um atributo em uma classe é de um tipo de outra classe

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagAtual = 0;//começa fechado
        this.totPaginas = totPaginas;
        this.aberto = false;//começa fechado
        //this.leitor = leitor;/*pode ser que o livro exista mas não tenha leitor*/
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
           
    public void detalhes(){
        System.out.println("=====DETALHES======");
        System.out.println("Título " + this.getTitulo());
        System.out.println("Autor " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        System.out.println("===================");
    }

    @Override
    public void abrir() {
        if (this.aberto == false){
            this.aberto = true;
            System.out.println("Abri o livro");
        }else System.out.println("Mas o livro já estava aberto.. ;D");
        
    }

    @Override
    public void fechar() {
        if (this.aberto){
            this.aberto = false;
            System.out.println("Fechei o livro");
        }else System.out.println("Mas o livro já estava fechado.. =x");
    }

    @Override
    public void folhear() {
        int i = 1;
        this.setPagAtual(i);
        System.out.println("Folheando páginas... ");
        for (i = 1 ; i <= this.getTotPaginas(); i++){
        this.setPagAtual(i);
        System.out.print("... pg " +this.getPagAtual());
        }
        System.out.println("");

    }

    @Override
    public void avancarPagina() {
        this.pagAtual++;
 
    }

    @Override
    public void voltarPagina() {
        this.pagAtual--;
    }
    
}
