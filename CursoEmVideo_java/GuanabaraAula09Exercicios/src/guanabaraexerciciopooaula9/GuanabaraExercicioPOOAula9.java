/*
 *
    Exercicios de POO do Curso em Vídeo 
    https://www.youtube.com/cursoemvideo
    professor Guanabara.
 *
 */
package guanabaraexerciciopooaula9;
public class GuanabaraExercicioPOOAula9 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        p[0] = new Pessoa("Oliveira", 40, "F");
        p[1] = new Pessoa("Gonçalves", 36, "M");
        System.out.println("" + p[0].getNome());
        Livro l[] = new Livro[2];
        l[0] = new Livro("POO", "Guanabara",20);
        l[0].setLeitor(p[0]);
        System.out.println("livro " +l[0].getTitulo() + ", está em leitura por " + l[0].getLeitor().getNome());
        l[0].abrir();
        l[0].abrir();
        l[0].fechar();
        l[0].fechar();
        l[0].folhear();
        l[0].detalhes();
        l[0].setLeitor(p[1]);
        System.out.println("livro " + l[0].getTitulo() + " está com " +l[0].getLeitor().getNome() );
        System.out.println("" +p[0].cracha());
    }
}
