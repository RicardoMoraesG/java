package projeto09classepessoa;
public class Projeto09ClassePessoa {
    public static void main(String[] args) {
        System.out.println("CADASTRO DE PESSOAS");
        
       //Parâmetros(int código, String: "nome", "celular", "email", "endereço")
       Pessoa p1 = new Pessoa(1,"Eliana Rodelli", "(14)99876-5432","lirodelli@gmail.com","Rua Ercídio Vicente de Moraes, 1991");
       p1.status();
       
       Pessoa p2 = new Pessoa(2, "Rafael Gonçalves", "(14)91234-5678","rafagonc1984@yahoo.com.br","Rua Yukio Wada, 8");
       p2.status();
       
       Pessoa p3 = new Pessoa(3, "Rodrigo Nery", "(14)98755-6621","rodrigo.nery32@uol.com","Rua Ernesto Monte, 91");
       p3.status();
       
       Pessoa p4 = new Pessoa(4, "Isabela Angeli", "(14)96342-1817","bela.angeli@gmail.com","Rua Benigno Neres, 2005");
       p4.status();
    }//Fim main()
    
}//FIM Projeto09ClassePessoa
