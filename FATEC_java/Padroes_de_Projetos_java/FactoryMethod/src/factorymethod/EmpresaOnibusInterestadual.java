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
public class EmpresaOnibusInterestadual extends Empresa {

    public EmpresaOnibusInterestadual() {
    }

   @Override
    public Passagem emitePassagem(String origem, String destino, String dataHoraPartida) {
        return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
    }
   


}
