package br.com.crud.teste;
import br.com.crud.dao.ViagensDAO;
import br.com.crud.model.Viagens;

public class ViagensTeste {
    public static void main(String[] args) throws Exception {
        ViagensDAO viagensdao = new ViagensDAO();

        Viagens viagens = new Viagens();
        viagens.setPartida("Salvador");
        viagens.setDestino("Rio de Janeiro");
        viagens.setDataIda(10042022);
        viagens.setDataVolta(01052022);

        viagens.setPassageiroId(5);
        viagens.setPagamentoId(5);

        viagensdao.save(viagens);
    }
}
