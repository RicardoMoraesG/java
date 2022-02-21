
package composite;

public class Composite {

    public static void main(String[] args) {
        //Folhas
        Programador p1 = new Programador("Ricardo" , 3900);
        Programador p2 = new Programador("Jonathan", 900);
        Programador p3 = new Programador("Piá", 2800);
        //Nós intermediários
        Gerente g1 = new Gerente("Ponce", 10000);
        Gerente g2 = new Gerente("Pazim", 12000);
        Gerente g3 = new Gerente("Adriana", 20000);
        //estrutura em arvore
        
        g1.add(p1);
        
        g2.add(p2);
        g2.add(p3);
        
        g3.add(g1);
        g3.add(g2);
        
        g3.print();

    }
    
}
