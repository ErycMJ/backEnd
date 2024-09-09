package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.nome = "Steve";

        Personagem inimigo = new Personagem();
        inimigo.nome = "Herobrine";

        Creeper verdao = new Creeper();
        verdao.nome = "Creeper";

        jogador.atacar(inimigo);
        verdao.atacar(jogador);

        System.out.println("Jogador: " + jogador.vida);
        System.out.println("Herobrine " + inimigo.vida);
        System.out.println("Creeper: " + verdao.vida);
    }
}