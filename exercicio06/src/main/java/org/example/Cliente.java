package org.example;

public class Cliente {
    private String nome;
    private Integer idade;

    //Construtor
    public Cliente(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Getter
    public String getNome(){
        return this.nome;
    }

        public Integer getIdade(){
            return this.idade;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setIdade(Integer idade){
            this.idade = idade;
    }
}