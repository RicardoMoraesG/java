package cliente;

import StrategyComportamentos.CorrerCurtaDist;
import classesFelinos.Felino;
import classesFelinos.Leao;
import classesFelinos.Leopardo;
import classesFelinos.TigreToy;

public class TesteCliente {

    public static void main(String args[]) {

        Felino leao = new Leao();
        Felino leopardo = new Leopardo();
        Felino tigreToy = new TigreToy();
        System.out.println("Leão: ");
        leao.performarCorrer();
        /* Correr curta distância, porém com o objetivo bem próximo. */
        leao.performarPular();
        /* Pulo alto e objetivo. */

        System.out.println("Leopardo: ");
        leopardo.performarCorrer();
        /* Correr longa distância, caso necessário. */
        leopardo.performarPular();
        /* Pulo alto e objetivo. */

        System.out.println("Toy: ");
        tigreToy.performarCorrer();
        /* Sou um brinquedo, não corro. */
        tigreToy.performarPular();
        /* Sou um brinquedo, não pulo. */

        System.out.println("Leopardo, alterando comportamento: ");
        /* LEOPARDO DE BARRIGA CHEIA, CORRENDO COMO LEÃO PARA PEGAR A JANTA! */
        leopardo.setCorrerStrategy(new CorrerCurtaDist());
        leopardo.performarCorrer();
        /* Correr curta distância, porém com o objetivo bem próximo. */

    }
}
