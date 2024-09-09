package org.example;

public class Filme {
    private String nome;
    private Float preco;
    private Integer idadeMinima;

    //Construtor
    public Filme(String nome, Float preco, Integer idadeMinima){
        this.nome = nome;
        this.preco = preco;
        this.idadeMinima = idadeMinima;
    }

    //Getter
    public String getNome(){
        return this.nome;
    }

    public Float getPreco(){
        return this.preco;
    }

    public Integer getIdadeMinima(){
        return this.idadeMinima;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Float preco){
        this.preco = preco;
    }

    public void setIdadeMinima(Integer idadeMinima){
        this.idadeMinima = idadeMinima;
    }
}
