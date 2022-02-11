package br.com.crud.model;

import java.util.ArrayList;
import java.util.List;

public class Passageiros {
    private int id;
    private String name;
    private String email;

    private List<Viagens> viagens = new ArrayList<Viagens>();

    public Passageiros(){
        super();
    }

    public Passageiros(int id, String name, String email){
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Viagens> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagens> viagens) {
        this.viagens = viagens;
    }

}
