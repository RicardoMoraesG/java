/*
 *
    Exercicios de POO do Curso em Vídeo 
    https://www.youtube.com/cursoemvideo
    professor Guanabara.
 *
 */
package guanabaraaula4;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p){ //este é o método Construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
       
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public float setPonta(float p){
        return this.ponta = p;
    }
    
    public void tampar(){
        this.tampada=true;
    }
    
    public void destampar(){
        this.tampada=false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA");
        //duas formas de declarar sobre o 'this.'
        //1ª:
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta: " +this.ponta);
        //2:
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta: " +this.getPonta());
        System.out.println("Cor: " +this.cor);
        System.out.println("Tampada : " +this.tampada);
        
    }
}
