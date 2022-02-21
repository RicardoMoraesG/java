
package abstractmetody;

public abstract class EmpresaOnibus {

    public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem,
            String destino,
            String dataHoraPartida);

    public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem,
            String destino,
            String dataHoraPartida);
}
