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
public abstract class Empresa {
    
    public abstract Passagem emitePassagem(String origem, String Destino, String dataHoraPartida);
    
}
