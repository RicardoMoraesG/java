/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guanabaraaula11heranca;

/**
 *
 * @author Usuario
 */
public class Tecnico extends Aluno {
    public void registroProfissional(int registro) {
        if (registro % 2 == 0){
            System.out.println("Registro Profissional: " + registro + ": Par é Humanas !");
        } else {
            System.out.println("Registro Profissional: " + registro + ": Impar é Exatas !");
        }
        
    }
    public void praticar() {
        System.out.println(this.getNome() + " está praticando.");
    }
    
}
