package org.example;

public class Creeper extends Personagem{
    public boolean animacaoExplodir = false;

    @Override
    public void atacar(Personagem alvo){
        System.out.println(alvo.nome + " foi atacado por " + this.nome);
        alvo.vida -= 90;
        this.vida = 0;
    }
}