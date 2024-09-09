package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            MusicCloud spotify = new MusicCloud();

            // Cadastrando as músicas
            spotify.adicionarPlaylist("Playlist 01", "Musica 01");
            spotify.adicionarPlaylist("Playlist 01", "Musica 02");
            spotify.adicionarPlaylist("Playlist 02", "Musica 03");
            spotify.adicionarPlaylist("Playlist 02", "Musica 04");
            spotify.adicionarPlaylist("Playlist 03", "Musica 05");
            spotify.adicionarPlaylist("Playlist 03", "Musica 06");

            // Pedindo o nome de uma música para o usuário
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome de uma playlist: ");
            String nomePlaylist = scanner.nextLine();
            System.out.print("Digite o nome de uma musica: ");
            String nomeMusica = scanner.nextLine();

            try {
                Playlist musicaPesquisada = spotify.buscarPlaylist(nomePlaylist);
                System.out.println(musicaPesquisada.getNome() + " - " + musicaPesquisada.getMusicas());
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
