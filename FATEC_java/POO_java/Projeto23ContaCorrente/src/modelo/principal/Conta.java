/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Conta {
   private int numero;
    private double saldo;
    private double limite;
    ////relaciona outras classes, utilizando-as como atributos.
    private Pessoa dono;

    public Conta(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() {
    }
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    /**
     * soma um valor ao saldo.
     * @param deposito 
     */
    public void depositar(double deposito){
       this.saldo = this.saldo + deposito;
        System.out.println("Operação de depósito: R$ " + deposito);
    }
    /**
     * subtrai um valor do saldo.
     * @param saque 
     */
    public void sacar(double saque){
       this.saldo = this.saldo - saque;
        System.out.println("Operação de Saque: R$ " + saque);
    }
    /**
     * subtrai um valor do primeiro objeto
     * e o adiciona na conta do segundo.
     * @param transferir
     * @param contaDestino 
     */
    public void transferir(double transferir, Conta contaDestino){
        this.saldo = this.saldo - transferir;
        
        System.out.println("Operação de Transferência: - R$ " + transferir);
        contaDestino.depositar(transferir);
        System.out.print("Número da Conta Destinatária: " + contaDestino.getNumero());
        System.out.println(": " + contaDestino.getDono().getNomeCompleto());
    }
}
