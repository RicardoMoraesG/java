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
public class PassagemOnibusInterestadualConcreta extends PassagemOnibusInterestadual {

    public PassagemOnibusInterestadualConcreta(String origem, String destino, String dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Passagem de Ônibus Interestadual: "
                + this.getOrigem()
                + " para "
                + this.getDestino()
                + " Data/Hora "
                + this.getDataHoraPartida()
        );
    }

}
