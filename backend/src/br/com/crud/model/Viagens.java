package br.com.crud.model;

public class Viagens {
    private int id;
    private String partida;
    private String destino;
    private String dataIda;
    private String dataVolta;

    private int PagamentoId;
    private Pagamentos pagamentos;
    private int PassageiroId;
    private Passageiros passageiros;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamentos pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Passageiros getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiros passageiros) {
        this.passageiros = passageiros;
    }

    public int getPagamentoId() {
        return PagamentoId;
    }

    public void setPagamentoId(int PagamentoId) {
        this.PagamentoId = PagamentoId;
    }

    public int getPassageiroId() {
        return PassageiroId;
    }

    public void setPassageiroId(int PassageiroId) {
        this.PassageiroId = PassageiroId;
    }

}
