package br.com.crud.teste;
import br.com.crud.dao.PagamentosDAO;
import br.com.crud.model.Pagamentos;

public class PagamentoTeste {
    public static void main(String[] args) throws Exception {
        PagamentosDAO pagamentosdao = new PagamentosDAO();

        Pagamentos pagamentos = new Pagamentos();
        pagamentos.setPagar("R$3000");

        pagamentosdao.save(pagamentos);
    }
}
