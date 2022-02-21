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
public class Pressurizador {
    int pressao;

 public Pressurizador (int pressao) {
 this.pressao = pressao;
 }


 public void ligar () {
 int i;

 for (i=0; i < this.pressao; i++)
 System.out.println("Pressão pronta em " + i + "...");
 System.out.println ("Pressão Pronta!!!");

 }
}
