package br.com.crud.model;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {

    private int id;
    private String pagar;

    private List<Viagens> viagens = new ArrayList<Viagens>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPagar() {
        return pagar;
    }

    public void setPagar(String pagar) {
        this.pagar = pagar;
    }

    public List<Viagens> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagens> viagens) {
        this.viagens = viagens;
    }

}
