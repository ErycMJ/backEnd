package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema filmesCinema = new Cinema();
        filmesCinema.cadastrarFilme("Filme 01", 25.5F, 14);
        filmesCinema.cadastrarFilme("Filme 02", 15.5F, 10);
        filmesCinema.cadastrarFilme("Filme 03", 25.5F, 10);
        filmesCinema.cadastrarFilme("Filme 04", 45.5F, 16);
        filmesCinema.cadastrarFilme("Filme 05", 45.5F, 14);

        Scanner leitor = new Scanner(System.in);
        String mensagem = "";

        while(true) {
            try {
                System.out.print("Digite o nome do comprador: ");
                String nomeCliente = leitor.next();

                System.out.print("Digite a idade do comprador: ");
                Integer idadeCliente = leitor.nextInt();

                System.out.print("Digite o nome do filme desejado: ");
                String nomeFilme = leitor.next();
                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                System.out.print("Digite o nome do assento: ");
                String assento = leitor.next();

                Filme filmeEscolhido = filmesCinema.buscarFilme(nomeFilme);

                Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}