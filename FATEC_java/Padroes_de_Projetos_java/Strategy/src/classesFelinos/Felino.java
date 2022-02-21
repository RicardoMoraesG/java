package classesFelinos;

import StrategyComportamentos.CorrerStrategy;
import StrategyComportamentos.PularStrategy;

abstract public class Felino {

    protected PularStrategy pularStrategy;
    protected CorrerStrategy correrStrategy;

    abstract public void display();

    abstract public void rugir();

    public void setCorrerStrategy(CorrerStrategy correrStrategy) {

        this.correrStrategy = correrStrategy;
    }

    public void performarCorrer() {

        correrStrategy.correr();
    }

    public void setPularStrategy(PularStrategy pularStrategy) {

        this.pularStrategy = pularStrategy;
    }

    public void performarPular() {

        pularStrategy.pular();
    }
}
