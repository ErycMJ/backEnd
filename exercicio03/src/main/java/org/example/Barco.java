package org.example;

public class Barco {
    private String nome;
    private Float tamanho;

    public Barco(String nomeConstrutor, Float tamanhoConstrutor) {
        //System.out.println("Construtor iniciado");
        this.nome = nomeConstrutor;
        this.tamanho = tamanhoConstrutor;
    }

    public Barco() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }
}