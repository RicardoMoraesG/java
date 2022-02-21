package principal;
import java.util.Scanner;
public class Conta {
    private String nomeDono;
    private int numConta;
    private double saldo;
    
    Scanner scan = new Scanner(System.in);;
    public Conta() {
    }

    public Conta(String nomeDono, int numConta, double saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
      
    public void depositar(double deposito){
       this.saldo = this.saldo + deposito;
    }
    
    public void sacar(double saque){
       this.saldo = this.saldo - saque;
    }
    
    public void transferir(double transferir, Conta contaDestino){
        this.saldo = this.saldo - transferir;
        contaDestino.depositar(transferir);
    }
    public void exibir(){
        System.out.println("Número da Conta: " +this.getNumConta());
        System.out.println("Titular: " +this.getNomeDono());
        System.out.println("Saldo R$: " +this.getSaldo());
    }
    public void cadastrarTitular(){
     System.out.println("Número da conta: ");
        this.setNumConta(scan.nextInt());
        System.out.println("Saldo Inicial ");
        this.setSaldo(scan.nextDouble());
        System.out.println("Nome do Titular ");
        this.setNomeDono(scan.next().toUpperCase());  
        System.out.println("Cadastrado com Sucesso");
        this.exibir();
    }
}