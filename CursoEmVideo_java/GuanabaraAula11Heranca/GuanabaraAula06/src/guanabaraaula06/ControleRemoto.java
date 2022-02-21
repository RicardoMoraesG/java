/*
 *
    Exercicios de POO do Curso em Vídeo 
    https://www.youtube.com/cursoemvideo
    professor Guanabara.
 *
 */
package guanabaraaula06;
public class ControleRemoto implements IControlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando, até logo...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU----");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " +this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        System.out.println("");
        System.out.println("--fim MENU--");   
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }
        @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossível diminuir volume ");
        }
    }

    @Override
    public void ligarMudo() {
        if ((this.isLigado()) && (this.getVolume() > 0)) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if ((this.isLigado()) && (this.getVolume() == 0)) {
          this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
    
}
