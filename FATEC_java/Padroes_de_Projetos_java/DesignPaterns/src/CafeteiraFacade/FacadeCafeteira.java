
package CafeteiraFacade;

/**
 *
 * @author aluno
 */
public class FacadeCafeteira {

    boolean verdadeiro = true;
    Pressurizador p;
    Moenda m;
    Repositorio r;

    public FacadeCafeteira(int funcao) {
        switch (funcao) {
            case 1:
                forte();
                break;
            case 2:
                medio();
                break;
            case 3:
                fraco();
                break;
            default:
                System.out.println("Opção incorreta!!!");
                verdadeiro = false;
        }
        if (verdadeiro) {
            p.ligar();
            m.moer();
            r.ferver();
            r.ejetar();
        }
    }
    public void forte() {
        int pressao = 35;
        int temperatura = 110;
        int qtdAgua = 75;
        int qtdCafe = 40;
        p = new Pressurizador(pressao);
        m = new Moenda(qtdCafe);
        r = new Repositorio(qtdAgua, temperatura);
    }

    public void medio() {
        int pressao = 30;
        int temperatura = 105;
        int qtdAgua = 95;
        int qtdCafe = 35;
        p = new Pressurizador(pressao);
        m = new Moenda(qtdCafe);
        r = new Repositorio(qtdAgua, temperatura);
    }

    public void fraco() {
        int pressao = 30;
        int temperatura = 100;
        int qtdAgua = 110;
        int qtdCafe = 30;
        p = new Pressurizador(pressao);
        m = new Moenda(qtdCafe);
        r = new Repositorio(qtdAgua, temperatura);
    }

}
