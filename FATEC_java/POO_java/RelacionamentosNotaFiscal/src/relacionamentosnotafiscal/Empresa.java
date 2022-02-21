/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionamentosnotafiscal;

/**
 *
 * @author Usuario
 */
public class Empresa {
    protected String cpfCnpj;
    protected String nomeRazaoSocial;
    protected Endereco endereco;

    public Empresa(Endereco endereco,String nomeRazaoSocial,String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.endereco = endereco;
    }
    
    

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }
        public void getEndereco() {
        System.out.print("Rua: " + endereco.getRua() );
        System.out.print(" N. : " + endereco.getNumero() );
        System.out.print(" Bairro: " + endereco.getBairro() );
        System.out.print(" Cidade: " + endereco.getCidade() );
        System.out.print(" CEP: " + endereco.getCep() );
    }
    
}
