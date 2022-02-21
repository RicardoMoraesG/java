/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pessoa {
   private String nome;
    private String sobrenome;
    private String cpf;
    //relaciona outras classes, utilizando-as como atributos.
    private Conta contaCorrente;
    private Endereco enderecoPessoal;

    public Pessoa(String nome, String sobrenome, String cpf, Conta contaCorrente, Endereco enderecoPessoal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.contaCorrente = contaCorrente;
        this.enderecoPessoal = enderecoPessoal;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Conta contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Endereco getEnderecoPessoal() {
        return enderecoPessoal;
    }

    public void setEnderecoPessoal(Endereco enderecoPessoal) {
        this.enderecoPessoal = enderecoPessoal;
    }


    /**
     * retorna true se o cpf digitado contém onze digitos.
     * @param cpf
     * @return 
     */
    public boolean validarCpf(String cpf){
        /*compara se a string cpf tem o tamanho de 11 caracteres*/
        if(this.getCpf().length() == 11 ) {
            System.out.println("CPF Válido!");
        } else {
            System.out.println("CPF Inválido!");
        }
        return this.getCpf().length() == 11; 
   }
    /**
     * retorna uma String composta do Nome e do Sobrenome concatenados.
     * @return 
     */
    public String getNomeCompleto() {
        return " " + this.nome + " " + this.sobrenome;
    }

}
