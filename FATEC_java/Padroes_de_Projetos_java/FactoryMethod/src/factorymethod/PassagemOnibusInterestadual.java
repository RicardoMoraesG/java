/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Usuario
 */
public class PassagemOnibusInterestadual extends Passagem {

    public PassagemOnibusInterestadual(String origem, String destino, String dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus urbana: "
                + this.getOrigem()
                + " para "
                + this.getDestino()
                + ", Data/Hora: "
                + this.getDataHoraPartida()
        );
    }

}
