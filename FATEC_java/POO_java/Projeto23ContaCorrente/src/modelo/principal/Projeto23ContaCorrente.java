/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

/**
 *
 * @author Usuario
 */
public class Projeto23ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciando conta que será parâmetro do objeto pessoa.
        Conta conta1 = new Conta(9000,1200.49,1000.00);
        //instanciando endereço que será parâmetro do objeto pessoa.
        Endereco endereco1 = new Endereco("Rua Joaquim Antonio","696","Promissão","SP","16370-000");
        //passando os objetos instanciados anteriormente como parâmetros.
        Pessoa pessoa1 = new Pessoa("Priscila","Moreno","12345678910",conta1,endereco1);
        conta1.setDono(pessoa1);//define o atributo dono como o objeto da classe Pessoa.
        endereco1.addMorador(pessoa1);//define o atributo morador como o objeto da classe Pessoa.
        //testando os métodos especiais
        System.out.println("Nome Completo: " + pessoa1.getNomeCompleto() );
        pessoa1.validarCpf(pessoa1.getCpf());
        //testando o método da classe Endereço através do parâmetro da classe Pessoa.
        pessoa1.getEnderecoPessoal().getLocalizacaoByCep("16370-000");
        
        //TESTE DEPÓSITO
        System.out.println("Saldo Anterior: R$ "+pessoa1.getContaCorrente().getSaldo());
        pessoa1.getContaCorrente().depositar(500);
        System.out.println("Saldo Posterior: R$ "+pessoa1.getContaCorrente().getSaldo());
           
        
        //TESTE SEGUNDO OBJETO 
        Conta conta2 = new Conta(5000, 200.00, 2000.00);
        Endereco endereco2 = new Endereco("Rua Ernesto Monte", "91","Promissão", "SP", "16370-000");
        Pessoa pessoa2 = new Pessoa("Eliana", "Rodelli", "963852741",conta2,endereco2);
        conta2.setDono(pessoa2);//define o atributo dono como o objeto da classe Pessoa.
        endereco2.addMorador(pessoa2);//define o atributo morador como o objeto da classe Pessoa.
        System.out.println("\nNome completo" +pessoa2.getNomeCompleto() );
        //cpf digitado errado para teste.
        pessoa2.validarCpf(pessoa2.getCpf());
        //digitado cep errado para teste.
        pessoa2.getEnderecoPessoal().getLocalizacaoByCep("10000-000");
        System.out.println("Saldo Anterior: R$ " + pessoa2.getContaCorrente().getSaldo());
        pessoa2.getContaCorrente().sacar(1000);
        System.out.println("Saldo Posterior: R$ " + pessoa2.getContaCorrente().getSaldo() + " Titular: " + pessoa2.getNome());
        
        
        //TESTE TRANFERÊNCIA
        System.out.println("\nSaldo Remetente: R$ " + pessoa1.getContaCorrente().getSaldo() + " Titular " + pessoa1.getNomeCompleto());
        pessoa1.getContaCorrente().transferir(1000, conta2);
        System.out.println("Saldo Remetente: R$ " + pessoa1.getContaCorrente().getSaldo() + " Titular " + pessoa1.getNomeCompleto());
        System.out.println("Saldo Destinatario: R$ " +pessoa2.getContaCorrente().getSaldo() + " Titular: " + pessoa2.getNomeCompleto());
        
        //TESTE MORADOR NO MESMO ENDEREÇO
        Conta conta3 = new Conta();
        Pessoa pessoa3 = new Pessoa("Vera", "Lúcia Moreno", "98765432100",conta3,endereco1);
        endereco1.addMorador(pessoa3);
        endereco1.getMorador();
        

  
    }
    
}
