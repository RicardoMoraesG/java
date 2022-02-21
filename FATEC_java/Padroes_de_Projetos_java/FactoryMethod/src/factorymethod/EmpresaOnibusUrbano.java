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
public class EmpresaOnibusUrbano extends Empresa {

    public EmpresaOnibusUrbano() {
    }

    @Override
    public Passagem emitePassagem(String origem, String destino, String dataHoraPartida) {
        return new PassagemOnibusUrbana(origem, destino, dataHoraPartida);
    }

}
