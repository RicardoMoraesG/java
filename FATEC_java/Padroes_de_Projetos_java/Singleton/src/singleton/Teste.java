/*
 quando nao pode 
utilizar mais de um objeto 
da mesma classe 
 */
package singleton;

/**
 *
 * @author Usuario
 */
public class Teste {
    public static void main(String[] args){
        Janela j = Janela.getInstance();
        
        j.pack();
        j.setVisible(true);
        
        Janela j2 = Janela.getInstance();
        j2.pack();
        j2.setVisible(true);
    }
}
