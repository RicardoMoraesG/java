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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa viacaoX = new EmpresaOnibusUrbano();

        Empresa viacaoY = new EmpresaOnibusInterestadual();

        Passagem pUrbano = viacaoX.emitePassagem("Promissão", "Lins", "16h00");
        Passagem pInterestadual = viacaoY.emitePassagem("São Paulo", "Promissão", "20h00");
    }

}
