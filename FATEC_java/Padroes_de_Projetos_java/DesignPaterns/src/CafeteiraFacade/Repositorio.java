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
public class Repositorio {
    int qtd, temp;

 public Repositorio (int qtd, int temp) {
 this.qtd = qtd;
 this.temp = temp;
 }
 public void ejetar () {
 int i;

 for (i=0; i < this.qtd; i++)
 System.out.println("Total de água ejetada em " + i + "...");
 System.out.println ("Água ejetada!!!");
 }
 public void ferver () {
 int i;

 for (i=36; i < this.temp; i++)
 System.out.println("Temperatura em " + i + "...");
 System.out.println ("Temperatura atingida!!!");
 }

}
