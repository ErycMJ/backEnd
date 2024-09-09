package org.example;

import java.util.ArrayList;

public class BasePorto {
    private String nome;
    private ArrayList<Barco> barcosAtracados = new ArrayList<>();

    public BasePorto(String nome){
        this.nome = nome;
    }

    public void atracarBarco(Barco barco){
        barcosAtracados.add(barco);
        System.out.println("Barco " + barco.getNome() + " - " + barco.getTamanho() + " adicionado no porto " + nome);
    }
    public void desatracarBarco(Barco barco){
        try{
            barcosAtracados.remove(barco);
            System.out.println("Barco " + barco.getNome() + " - " + barco.getTamanho() + " removido do porto " + nome);
        } catch (Exception e) {
            System.out.println("Barco " + barco.getNome() + " - " + barco.getTamanho() + " não está no porto " + nome);
        }
    }
}
