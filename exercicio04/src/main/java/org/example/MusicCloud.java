package org.example;

import java.util.ArrayList;

public class MusicCloud {
    private ArrayList<Playlist> listaMusicas = new ArrayList<Playlist>();

    public void adicionarPlaylist(String nome, String musica) {
        Playlist playlist = new Playlist(nome, musica);
        listaMusicas.add(playlist);
    }

    public Playlist buscarPlaylist(String nomePlaylist) throws RuntimeException{
        for (Playlist item : listaMusicas) {
            if (item.getNome().equals(nomePlaylist)) return item;
        }
        throw new RuntimeException("A musica não foi encontrada");
    }
}
