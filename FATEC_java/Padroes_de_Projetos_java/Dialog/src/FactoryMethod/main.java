package FactoryMethod;

import java.util.Random;

/**
 *
 * @author Ricardo.
 */
public class main {

    public static void main(String[] args) {
        Dialog dialog = null;
        System.out.println("escolha... FACTORY: Windows Button [ 0 ] Web Button [ 1 ] ");
        Random r = new Random();
        int n = r.nextInt(2);
        if (n == 0) {
            dialog = new WindowsDialog();
        }
        if (n == 1) {
            dialog = new WebDialog();
        }
        System.out.print("Botão: [" + n + "] ");
        dialog.render();
        System.out.println("Você clicou sem olhar!");
        System.out.println("Execute novamente...");
    }
}
