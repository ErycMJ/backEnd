package org.example;

//POJO de Música
public class Musica {
    private String titulo;
    private String artista;

    //Construtor
    public Musica(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    //Getter
    public String getTitulo(){
        return this.titulo;
    }

    public String getArtista(){
        return this.artista;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }
}
