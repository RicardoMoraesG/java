/*
2. Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria.
- A primeira possui um atributo taxaDeOperação que é descontado sempre que um 
saque e um depósito são feitos.
 */
package modelo.principal;
/**
 * @author Ricardo de Moraes Gonçalves
 */
public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao = 0.5; 
    
    //CONSTRUTOR CHEIO
    public ContaCorrente(int numeroConta, double saldo, double taxaDeOperacao){
       this.taxaDeOperacao = taxaDeOperacao;
    }
    //CONSTRUTOR VAZIO
    public ContaCorrente(){
    }
    
    //GETTERS E SETTERS
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    //SUBSTITUIÇÃO DOS MÉTODOS ABSTRATOS
    @Override
    public double sacar(double saque){
        this.setSaque(saque);  
        System.out.println("OPERAÇÃO DE SAQUE(CC):");
        System.out.println("\t**Taxa de operação: " + this.taxaDeOperacao + "%");
        if ((this.saldo - saque + (taxaDeOperacao  * (saque /100) )) < 0){
            System.out.printf("\tSaque solicitado: \tR$%10.2f\n  " , (this.getSaque()));
            System.out.printf("\tSaldo após operação: \tR$ %10.2f\n" , (this.saldo - saque + (taxaDeOperacao  * (saque /100) )));
            System.out.println("\tSaldo insuficiente para saque.");
            System.out.println("\tOperação cancelada.");
            System.out.printf("\tSaldo disponível para saque:\tR$%10.2f\n " , this.saldo);
        }
        else{
            System.out.printf("\tSaldo Anterior: \tR$ %10.2f\n " , this.saldo);
            this.saldo -= saque + (taxaDeOperacao  * (saque /100) );
            System.out.printf("\tSaque: \t\t\tR$ %10.2f\n" ,this.getSaque());
            System.out.printf("\tSaldo Conta Corrente: \tR$ %10.2f\n" , this.saldo);
        }
        return this.saldo;
    }    
    @Override
    public double depositar(double deposito){  
        System.out.println("OPERAÇÃO DE DEPÓSITO(CC):");
        System.out.println("\t**Taxa de operação: " + this.taxaDeOperacao + "%");
        this.setDeposito(deposito);
        System.out.printf("\tSaldo Anterior: \tR$ %10.2f\n  " , this.saldo);
        this.saldo += deposito - (taxaDeOperacao  * (deposito /100) );
        System.out.printf("\tDeposito:  \t\tR$ %10.2f\n  " ,this.getDeposito());
        System.out.printf("\tSaldo Conta Corrente: \tR$ %10.2f\n  " , this.saldo);
        return this.saldo;
    }    
}