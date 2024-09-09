package org.example;

public class Ingresso {
    private Cliente cliente;
    private Filme filme;
    private String assento;

    //Construtor
    public Ingresso(Cliente cliente, Filme filme, String assento){
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }

    //Getter
    public Cliente getCliente(){
        return this.cliente;
    }

    public Filme getFilme(){
        return this.filme;
    }

    public String getAssento(){
        return this.assento;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}
