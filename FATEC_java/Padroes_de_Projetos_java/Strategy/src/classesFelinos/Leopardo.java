package classesFelinos;

import StrategyComportamentos.CorrerLongaDist;
import StrategyComportamentos.PuloAlto;

public class Leopardo extends Felino {

    public Leopardo() {

        correrStrategy = new CorrerLongaDist();
        pularStrategy = new PuloAlto();
    }

    @Override
    public void display() {

        System.out.println("Leopardo a vista");
    }

    @Override
    public void rugir() {

        System.out.println("Arghh!");
    }
}
