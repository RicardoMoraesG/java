/*
1. Crie uma classe abstrata Conta Bancaria que contém como atributos o numero 
da conta e o saldo, e como métodos abstratos sacar e depositar que recebem um 
parâmetro do tipo double.
2. Crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria.
- A primeira possui um atributo taxaDeOperação que é descontado sempre que um 
saque e um depósito são feitos.
- A segunda possui um atributo limite que dá credito a mais para o correntista 
caso ele precise sacar mais que o saldo. Neste caso, o saldo pode ficar negativo
desde que não ultrapasse o limite. Contudo isso não pode acontecer na classe 
Conta Corrente.
 */
package modelo.principal;
/**
 * @author Ricardo de Moraes Gonçalves
 */
public class Projeto15aContaBancariaAbstract {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        ContaBancaria dono1 = new ContaCorrente();
        dono1.setSaldo(100);
        dono1.depositar(100);
        dono1.sacar(100);

        ContaBancaria dono2 = new ContaPoupanca();
        dono2.setSaldo(100);
        dono2.depositar(100);
        dono2.sacar(100);
        dono2.sacar(600);
        dono2.sacar(200);
       
    }  
}
