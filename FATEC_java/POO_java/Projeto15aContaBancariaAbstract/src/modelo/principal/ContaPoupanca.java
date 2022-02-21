/*
Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria.
A segunda possui um atributo limite que dá credito a mais para o correntista 
caso ele precise sacar mais que o saldo. Neste caso, o saldo pode ficar negativo
desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe 
Conta Corrente.
 */
package modelo.principal;
/**
 * @author Ricardo de Moraes Gonçalves
 */
public class ContaPoupanca extends ContaBancaria {
    private double limite = -500;
    
    //CONTRUTOR CHEIO
    public ContaPoupanca(int numeroConta, double saldo, double limite){
        this.limite = limite;
    }
    //CONSTRUTOR VAZIO
    public ContaPoupanca(){
    }
    //GETTERS E SETTERS
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return this.limite;
    }
    
    //SUBSTITUIÇÃO DOS MÉTODOS ABSTRATOS
    @Override
    public double sacar(double saque){
        this.setSaque(saque);
        System.out.println("OPERAÇÃO DE SAQUE(C.POUPANÇA):");
        System.out.println("\t**Limite: R$ " + this.limite);
        if( (this.saldo - saque  < 0)&&(this.saldo - saque  < this.limite) ){
            //se tentar sacar acima do limite
            System.out.printf("\t*Tentativa de saque acima do limite!");
            System.out.printf("\n\tSaldo atual Poupança: \tR$%10.2f\n  " , this.saldo);
        }
        else{
            //se tentar sacar dentro do limite
            System.out.printf("\tSaldo anterior: \tR$ %10.2f\n  " ,this.saldo);
            System.out.printf("\tSaque Poupança: \tR$ %10.2f\n  " ,this.saque);
            this.saldo -= this.saque;
            System.out.printf("\tSaldo atual Poupança: \tR$ %10.2f\n  " ,this.saldo);
        }  
        System.out.printf( "\t**Total disponível para saque:\tR$ %10.2f\n  " ,(this.saldo + (this.limite * -1)) );
    return this.saldo; 
    }
    @Override
    public double depositar(double deposito){
        this.deposito = deposito;
        System.out.println("OPERAÇÃO DE DEPÓSITO (C.POUPANÇA): ");
        System.out.printf("\tSaldo anterior: \tR$ %10.2f\n  " ,this.saldo);
        System.out.printf("\tDepósito Poupança: \tR$ %10.2f\n  " , this.deposito);
        this.saldo += this.deposito;
        System.out.printf("\tSaldo Poupança: \tR$ %10.2f\n  " ,this.saldo);
        System.out.println("\t**Limite: R$ " + this.limite);
        System.out.printf( "\t**Total disponível para saque:\tR$ %10.2f\n  " ,(this.saldo + (this.limite * -1)) );
        return this.saldo;
    }
}