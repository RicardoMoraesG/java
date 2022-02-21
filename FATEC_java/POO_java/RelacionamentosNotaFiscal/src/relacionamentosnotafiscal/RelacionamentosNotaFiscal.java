/*
* Relacionamentos entre classes.
*/
package relacionamentosnotafiscal;

/**
 *
 * @author Ricardo de Moraes Gonçalves
 */
public class RelacionamentosNotaFiscal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Podem ser instanciados sem Nota: (cadastro à parte)
        - Endereços
        - Empresas
        - Produtos        
        */
        /* Só podem ser instanciados com a Nota:
        - Itens.
        */
        
        // Cadastro de endereços:
        //Endereco(String rua, int numero, String bairro, String cidade, String estado, String cep)
        Endereco end1 = new Endereco("Rua Rodrigo Gonçalves", 91, "Centro","Campo Verde", "MT","85100-200");
        Endereco end2 = new Endereco("Rua Rafael de M. G.", 45,"Zeca Pagodinho", "CarakaCity","SP", "16250-020");
        Endereco end3 = new Endereco("Rua Vera Lucia", 80,"Liberdade","São Paulo","SP","11951-951");
        
        //Cadastro de empresas:
        //Empresa(Endereco endereco,String nomeRazaoSocial, String cpfCnpj)
        Empresa emp1 = new Empresa(end1,"Override Tecnologies","98765432109");
        Empresa emp2 = new Empresa(end2,"POO Ind.","10102030405");
        Empresa emp3 = new Empresa(end3,"IO Tecpeças","7415296300");
        
        // Cadastro de produtos:   ***INSTANCIANDO PRODUTOS COM ARRAY ***
        int N = 10; // quantidade de produtos.
        Produto prod[] = new Produto[N];
        prod[0] = new Produto(12.90,"extensão");
        prod[1] = new Produto(1000.50,"TV");
        prod[2] = new Produto(500.30,"antena");
        prod[3] = new Produto(2500.90,"notebook");
        prod[4] = new Produto(90.30,"fone");
        prod[5] = new Produto(42.50,"lanterna");
        prod[6] = new Produto(17.70,"mouse");
        prod[7] = new Produto(18.90,"adaptador");
        prod[8] = new Produto(39.99,"caixa de som");
        prod[9] = new Produto(25.79,"cabo");
        
        //INSTANCIANDO PRODUTO SEM ARRAY
        Produto prod01 = new Produto(79.90, "Formatação");
        
        Nota nf01 = new Nota(emp1, emp2);
        System.out.println("Numeracao: " + (nf01.itens.size()));
        nf01.addItens(new Item(prod01, 10)); 
        System.out.println("Numeracao: " + (nf01.itens.size()));
        nf01.addItens(new Item(prod[0], 5));
        System.out.println("Numeracao: " + (nf01.itens.size()));
        nf01.ImprimirNF();
        
        System.out.println("Numeracao: " + nf01.itens.size());
        
    }
    
}
