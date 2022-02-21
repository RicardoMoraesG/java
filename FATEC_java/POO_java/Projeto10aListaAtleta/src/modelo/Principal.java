/*1) Criar um novo Projeto Java: Projeto10aListaAtleta
2) Criar uma classe JAVA conforme abaixo:
Nome da classe: Atleta
Atributos: idAtleta (int), nome (String), equipe(String), cidade(String), estado (String)
Métodos: Construtores vazio e cheio, e os métodos getters e setters
No método MAIN da classe Principal instanciar:
- 5 objetos (um a um) e adicionar num objeto da classe ArrayList;
- 5 objetos (usando o FOR) e adicionar no mesmo objeto da classe ArrayList;
- Percorrer a lista e exibir os dados de todos os atletas;
- Percorrer a lista e localizar UM atleta pelo ID;
- Percorrer a lista e localizar UM atleta pelo NOME;
- Percorrer a lista e localizar os atletas de uma determinada EQUIPE;*/
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //ATRIBUTOS Atleta(int idAtleta, String nome, String equipe, String cidade, String estado)
        Atleta atleta01 = new Atleta(1, "Usain St. Leo Bolt", "EquipeJava", "Sherwood Content", "Jamaica");
        Atleta atleta02 = new Atleta(2, "Renaud Lavillenie", "EquipeC", "Barbezieux", "Saint-Hilaire");
        Atleta atleta03 = new Atleta(3, "Willian Frederick Carlton 'Carl' Lewis", "EquipeJava", "Birmingham", "Alabama");
        Atleta atleta04 = new Atleta(4, "Maurren Higa Maggi", "EquipeC", "São Carlos", "São Paulo");
        Atleta atleta05 = new Atleta(5, "David Lekuta Rudisha", "EquipePython", "Kilgoris", "Quênia");
        //5 objetos (um a um) e adicionar num objeto da classe ArrayList;
        ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
        listaAtleta.add(atleta01);
        listaAtleta.add(atleta02);
        listaAtleta.add(atleta03);
        listaAtleta.add(atleta04);
        listaAtleta.add(atleta05);
        //5 objetos (usando o FOR) e adicionar no mesmo objeto da classe ArrayList;
        for (int j = 6; j <= 10; j++) {
            Atleta objAtleta = new Atleta(j, "Atleta " + j, "Equipe " + j + j, "Cidade " + j + j + j, "Estado " + j + j + j + j);
            listaAtleta.add(objAtleta);
        }//fim for
        //Percorrer a lista e exibir os dados de todos os atletas;
        for (int i = 0; i < listaAtleta.size(); i++) {
            System.out.println("ID: "
                    + listaAtleta.get(i).getIdAtleta() + " - "
                    + listaAtleta.get(i).getNome() + " - "
                    + listaAtleta.get(i).getEquipe() + " - "
                    + listaAtleta.get(i).getCidade() + " - "
                    + listaAtleta.get(i).getEstado());
        }
        //Percorrer a lista e localizar UM atleta pelo ID;
        Atleta objAtletaPesquisa = new Atleta();//criar um objeto auxiliar para comparar
        int posicao = 0;
        for (int i = 0; i < listaAtleta.size(); i++) {//percorrer a lista
            objAtletaPesquisa = listaAtleta.get(i);//copiar todos os valores deste índice para o objeto de comparação
            posicao++;
            if (objAtletaPesquisa.getIdAtleta() == 4) {//comparar o idAtleta recebido do índice com o id pesquisado.
                System.out.println("Atleta " + objAtletaPesquisa.getNome()+//se encontrado exibir o resultado
                                   " está na lista, na posição " + posicao);//e a posição em que está.
            }//fim if
        }//fim for
        //Percorrer a lista e localizar UM atleta pelo NOME;
        System.out.println("Pesquisa nome do atleta: ");
        objAtletaPesquisa.setNome(entrada.next());//receber do teclado um nome para o objeto auxiliar de pesquisa.
        int nomeEncontrado = 0;//se NÃO encontrar o nome, não alterará este valor.
        posicao = 0;
        for (int i = 0; i < listaAtleta.size() - 1; i++) {//percorrer a lista.
            posicao++;
            if (listaAtleta.get(i).getNome().toLowerCase().contains(objAtletaPesquisa.getNome())){//comparar o nome pesquisado com o nome do índice.
                            nomeEncontrado++;
                            System.out.println("Nome encontrado na lista: ID " + //se encontrado exibir o resultado.
                                     listaAtleta.get(i).getIdAtleta() + 
                             " - " + listaAtleta.get(i).getNome()+ 
                             " - " + listaAtleta.get(i).getEquipe()+ 
                             " - " + listaAtleta.get(i).getCidade()+ 
                             " - " + listaAtleta.get(i).getEstado()+ 
                             " - Na Posição " + posicao);
            }//fim if
        }//fim for
        if (nomeEncontrado == 0) {
            System.out.println("Nome não encontrado na lista. ");
        }//fim if
        //Percorrer a lista e localizar os atletas de uma determinada EQUIPE;
        System.out.println("Pesquisar lista da Equipe: ");
        objAtletaPesquisa.setEquipe(entrada.next());
        int encontrado = 0;
        for (int i = 0; i < listaAtleta.size() - 1; i++) {//percorrer a lista.
            if ((listaAtleta.get(i).getEquipe().toLowerCase().contains(objAtletaPesquisa.getEquipe()))) {
                System.out.println(listaAtleta.get(i).getNome());
                encontrado++;
            }//fim if
        }//fim for
        if (encontrado == 0) {
            System.out.println("Equipe NÃO contêm atletas");
        }//fim if
    }//fim public static void main(String[] args)
}//fim public class Principal