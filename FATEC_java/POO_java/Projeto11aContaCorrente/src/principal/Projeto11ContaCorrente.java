package principal;
public class Projeto11ContaCorrente {
    public static void main(String[] args) {
        // TODO code application logic here
        Conta dono01 = new Conta();
        Conta dono02 = new Conta();
        
        dono01.transferir(0, dono02);
        
       dono01.cadastrarTitular();
    }
}
