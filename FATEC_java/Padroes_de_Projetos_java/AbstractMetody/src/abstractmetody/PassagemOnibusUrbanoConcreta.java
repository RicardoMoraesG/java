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
public class PassagemOnibusUrbanoConcreta extends PassagemOnibusUrbano {

    public PassagemOnibusUrbanoConcreta(String origem, String destino, String dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Passagem de Ônibus Urbano: "
                + this.getOrigem()
                + " para "
                + this.getDestino()
                + " Data/Hora "
                + this.getDataHoraPartida()
        );
    }

}
