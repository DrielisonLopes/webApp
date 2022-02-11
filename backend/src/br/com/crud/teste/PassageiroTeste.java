package br.com.crud.teste;
import br.com.crud.dao.PassageirosDAO;
import br.com.crud.model.Passageiros;

public class PassageiroTeste {
    public static void main(String[] args) throws Exception {
        PassageirosDAO passageirosdao = new PassageirosDAO();

        Passageiros passageiros = new Passageiros();
        passageiros.setName("Drielison");
        passageiros.setEmail("drielison@gmail.com");

        passageirosdao.save(passageiros);
    }
}
