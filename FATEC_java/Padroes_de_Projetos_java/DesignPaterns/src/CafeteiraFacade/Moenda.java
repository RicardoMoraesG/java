/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteiraFacade;

/**
 *
 * @author aluno
 */
public class Moenda {
    int qtd;

 public Moenda (int qtd) {
 this.qtd = qtd;
 }

 public void moer () {
 int i;

 for (i = 0; i < this.qtd; i++)
 System.out.println("Moenda pronta em " + i + "...");
 System.out.println ("Moenda Pronta!!!");

 }

}
