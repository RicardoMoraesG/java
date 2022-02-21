/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buider;

/**
 *
 * @author Usuario
 */
public abstract class PrestadorDeServico {

    private Categoria categoria;
    private DadosPessoais dadosPessoais;
    private LocalDeAtuacao localDeAtuaocao;
    private Avaliacao avaliacao;

    public abstract void exibirTelefone();

    public abstract void exibirPerfil();

}
