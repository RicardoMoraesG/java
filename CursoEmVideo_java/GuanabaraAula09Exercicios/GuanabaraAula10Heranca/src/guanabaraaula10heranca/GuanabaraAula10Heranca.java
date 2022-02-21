/**
 *
    Exercicios de POO do Curso em Vídeo 
    https://www.youtube.com/cursoemvideo
    professor Guanabara.
 */
package guanabaraaula10heranca;
public class GuanabaraAula10Heranca {

    public static void main(String[] args) {
        Professor p1 = new Professor("Educação Fisica", 10000, "Duarte", 48, "M");
        System.out.println("" +p1.Informacao());
        p1.receberAumento(500);
        p1.fazerAniver();
        System.out.println("\n" +p1.Informacao());
        
        Professor p2 = new Professor("Inglês", 10000, "Nery",42, "F");
        System.out.println("\n" +p2.Informacao() );
        p2.fazerAniver();
        p2.receberAumento(700);
        System.out.println("\n" + p2.Informacao());
        
        Aluno p3 = new Aluno(1,"JAVA","Sousa",26,"M");
        System.out.println("\n" + p3.Informacao() );
        p3.cancelarMatr();
        System.out.println("Matrícula " + p3.getMatr() );
        
        Funcionario p4 = new Funcionario("Secretaria", true,"Paes", 36, "F");
        System.out.println("\n" + p4.Informacao() );
        p4.mudarTrabalho();
        System.out.println("\n" + p4.Informacao() );
        



    }
    
}
