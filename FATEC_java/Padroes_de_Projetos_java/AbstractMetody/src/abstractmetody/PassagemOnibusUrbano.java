/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractmetody;

/**
 *
 * @author Usuario
 */
public abstract class PassagemOnibusUrbano {

    private String origem;
    private String destino;
    private String dataHoraPartida;

    public PassagemOnibusUrbano(String origem, String destino, String dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public abstract void exibirDetalhes();

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

}
