package GuanabaraAula3;
public class GuanabaraAula3 {
    
    public static void main(String[] args) {
      Caneta3 c1 = new Caneta3();
      c1.modelo = "BIC Cristal";
      c1.cor = "Azul";
      //c1.ponta = 0.5f;
      c1.carga = 80;
      //c1.tampada = true;
      c1.destampar();
      c1.status();
      c1.rabiscar();
       
    }
    
}
