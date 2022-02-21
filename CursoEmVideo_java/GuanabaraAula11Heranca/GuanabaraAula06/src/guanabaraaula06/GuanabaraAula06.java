
package guanabaraaula06;

public class GuanabaraAula06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ControleRemoto  c = new ControleRemoto();
        c.ligar();
       
        c.maisVolume();
        c.menosVolume();
        c.maisVolume();
        c.menosVolume();c.menosVolume();
        c.play();
        c.pause();
        c.play();
        c.abrirMenu();
        c.desligar();
    }
    
}
