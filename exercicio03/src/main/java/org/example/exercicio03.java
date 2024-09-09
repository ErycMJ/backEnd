package org.example;

import java.util.ArrayList;

public class exercicio03 {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 01", 8.5F));
        barcos.add(new Barco("Barco 02", 10F));
        barcos.add(new Barco("Barco 03", 15F));
        barcos.add(new Barco("Barco 04", 5F));
        barcos.add(new Barco("Barco 05", 10.3F));

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        for(Barco barco : barcos){
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else if(barco.getTamanho() >= 10){
                portoGrande.atracarBarco(barco);
            } else{
                System.out.println("Barco não encontrado");
            }
        }
    }
}