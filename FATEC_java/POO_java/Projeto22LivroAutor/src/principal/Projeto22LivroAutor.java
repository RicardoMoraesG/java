/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Projeto22LivroAutor {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * instancia objetos do tipo Autor.
         */
        Autor objAut1 = new Autor("Martim", 1965, "lll@inter");
        Autor objAut2 = new Autor("King", 1982, "222@inter");
        Autor objAut3 = new Autor("Assis", 1839,"333@nac");
        Autor objAut4 = new Autor("Linspector", 1920, "444@nac");
        Autor objAut5 = new Autor("Amado", 1912, "555@nac");
        Autor objAut6 = new Autor("Orwell", 1903, "666@inter");
        
        /**
         * instancia objetos do tipo Livro.
         */
        Livro objLiv1 = new Livro("GoT","Leia",350);
        Livro objLiv2 = new Livro("NgT", "NLeia", 120);
        Livro objLiv3 = new Livro("HM","Nova",450);
        Livro objLiv4 = new Livro("ALdA", "PqF", 1250);
        Livro objLiv5 = new Livro("Casmurro", "x", 1000);
        Livro objLiv6 = new Livro("Quincas Borbas", "x", 1000);
        Livro objLiv7 = new Livro("Bras Cubas", "x", 1000);
        Livro objLiv8 = new Livro("Lacos de Familia", "x", 1000);
        Livro objLiv9 = new Livro("O Lustre", "x",1000);
        Livro objLiv10 = new Livro("Agua Viva", "x", 1000);
        Livro objLiv11 = new Livro("Capitães da Areia","y",1000);
        Livro objLiv12 = new Livro("Tieta do Agreste", "y", 1000);
        Livro objLiv13 = new Livro("Gabriela, Cravo e Canela", "x", 1000);
        Livro objLiv14 = new Livro("O Iluminado","E", 1000);
        Livro objLiv15 = new Livro("A Torre Negra","G", 1000);
        Livro objLiv16 = new Livro("Carrie", "E", 1000);
        Livro objLiv17 = new Livro("1984", "N", 1000);
        Livro objLiv18 = new Livro("A Revolução dos Bichos", "E", 1000);
        
        /**
         * atribui objeto do tipo Autor ao objeto Livro.
         */
        objLiv1.setEscritores(objAut1);
        objLiv1.setEscritores(objAut2);
        objLiv5.setEscritores(objAut3);
        objLiv6.setEscritores(objAut3);
        objLiv7.setEscritores(objAut3);
        
        /**
         * atribui objeto do tipo Livro ao objeto do tipo Autor.
         */
        objAut1.setObra(objLiv2);
        objAut1.setObra(objLiv1);
        objAut1.setObra(objLiv4);
        objAut2.setObra(objLiv3);
        objAut2.setObra(objLiv14);
        objAut2.setObra(objLiv15);
        objAut2.setObra(objLiv16);
        objAut3.setObra(objLiv5);
        objAut3.setObra(objLiv6);
        objAut3.setObra(objLiv7);
        objAut4.setObra(objLiv8);
        objAut4.setObra(objLiv9);
        objAut4.setObra(objLiv10);
        objAut5.setObra(objLiv11);
        objAut5.setObra(objLiv12);
        objAut5.setObra(objLiv13);
        objAut6.setObra(objLiv17);
        objAut6.setObra(objLiv18);
        /**
         * instancia um objeto do tipo ArrayList tipada com a classe Livro.
         */
       ArrayList<Livro> listaLivraria = new ArrayList<Livro>();
       listaLivraria.add(objLiv1);
       listaLivraria.add(objLiv2);
       listaLivraria.add(objLiv3);
       listaLivraria.add(objLiv4);
       listaLivraria.add(objLiv5);
       listaLivraria.add(objLiv6);
       listaLivraria.add(objLiv7);
       listaLivraria.add(objLiv8);
       listaLivraria.add(objLiv9);
       listaLivraria.add(objLiv10);
       listaLivraria.add(objLiv11);
       listaLivraria.add(objLiv12);
       listaLivraria.add(objLiv13);
       listaLivraria.add(objLiv14);
       listaLivraria.add(objLiv15);
       listaLivraria.add(objLiv16);
       listaLivraria.add(objLiv17);
       listaLivraria.add(objLiv18);
       
       /**
        * Percorre a ArrayList listaLivraria e imprime o nome dos títulos.
        */
        System.out.println("LISTA DE LIVROS");
       for(int i = 0; i < listaLivraria.size(); i++) {
           System.out.println("\tLivro: " + listaLivraria.get(i).getTitulo());
       }
       /**
        * Instancia um objeto da classe ArrayList tipada com a classe Autor.
        * Adiciona os objetos da classe Autor na ArrayList.
        */
       ArrayList<Autor> listaAutores = new ArrayList<Autor>();
       listaAutores.add(objAut1);
       listaAutores.add(objAut2);
       listaAutores.add(objAut3);
       listaAutores.add(objAut4);
       listaAutores.add(objAut5);
       listaAutores.add(objAut6);
       
       /**
        * Exibe os objetos da lista tipada.
        */
        System.out.println("LISTA DE AUTORES");
       for (int i = 0; i < listaAutores.size(); i++ ) {
           System.out.println("\tAutor: " + listaAutores.get(i).getNome());
       }
       /**
        * Lista os objetos da classe Livro que são atribuidos a cada objeto da
        * classe Autor, por meio de um método especial da classe Autor.
        */
        System.out.println("\n\tAutor: " + objAut1.getNome());
        objAut1.getObra();
        System.out.println("\n\tAutor: " + objAut2.getNome());
        objAut2.getObra();
        System.out.println("\n\tAutor: " + objAut3.getNome());
        objAut3.getObra();
        System.out.println("\n\tAutor: " + objAut4.getNome());
        objAut4.getObra();
        System.out.println("\n\tAutor: " + objAut5.getNome());
        objAut5.getObra();
       
    }
}
