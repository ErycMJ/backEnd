package org.example;

//POJO de Música
public class Playlist {
    private String nome;
    private String musicas;

    //Construtor
    public Playlist(String nome, String musicas){
        this.nome = nome;
        this.musicas = musicas;
    }

    //Getter
    public String getNome(){
        return this.nome;
    }

    public String getMusicas(){
        return this.musicas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMusicas(String musicas){
        this.musicas = musicas;
    }
}
