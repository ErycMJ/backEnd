package org.example;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Filme> filmesDisponiveis;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<Filme>();
    }

    public void cadastrarFilme(String nome, Float preco, Integer idadeMinima) {
        Filme filme = new Filme(nome, preco, idadeMinima);
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nomeFilme) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equals(nomeFilme)) return filme;
        }
        throw new RuntimeException("Impossível encontrar musica");
    }
}

