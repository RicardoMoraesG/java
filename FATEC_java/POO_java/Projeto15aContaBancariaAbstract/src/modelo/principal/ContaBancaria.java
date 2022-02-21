/*
Crie uma classe abstrata Conta Bancaria que contém como atributos o numero 
da conta e o saldo, e como métodos abstratos sacar e depositar que recebem um 
parâmetro do tipo double.
 */
package modelo.principal;

/**
 *
 * @author Ricardo de Moraes Gonçalves
 */
public abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;
    protected double saque;
    protected double deposito;
    
//CONSTRUTOR CHEIO
    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
//CONSTRUTOR VAZIO
    public ContaBancaria() {
    }
        
//GETTERS E SETTERS
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 
    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    
    //MÉTODOS ABSTRATOS
    public abstract double sacar(double saque);    
    public abstract double depositar(double deposito);

}//FIM CLASSE CONTA BANCARIA