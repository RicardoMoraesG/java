
package guanabaraaula11heranca;

/**
 *
 * @author Usuario
 */
public class GuanabaraAula11Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        Professor p1 = new Professor();
        p1.setNome("Amadeus");
        p1.setIdade(48);
        p1.setSexo("M");
        p1.fazerAniversario();
        p1.setEspecialidade("POO");
        p1.setSalario(200);
        p1.receberAumento(20);
        System.out.println(p1.toString());
        Tecnico t1 = new Tecnico();
        t1.setNome("Abelardo");
        t1.setCurso("Matemática");
        t1.praticar();
        t1.registroProfissional(157);
        System.out.println(t1.toString());
    }
    
}
