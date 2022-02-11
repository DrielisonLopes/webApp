package br.com.crud.teste;
import br.com.crud.dao.ViagensDAO;
import br.com.crud.model.Viagens;

public class ViagensTeste {
    public static void main(String[] args) throws Exception {
        ViagensDAO viagensdao = new ViagensDAO();

        Viagens viagens = new Viagens();
        viagens.setPartida("Salvador");
        viagens.setDestino("Capadócia");
        viagens.setDestino("10/04/2022");
        viagens.setDestino("01/05/2022");

        viagensdao.save(viagens);
    }
}
