package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        while(true) {
            try{
                String[] movies = {"Homens de Preto", "Arrival", "Shrek", "Gladiador"};

                Scanner leitor = new Scanner(System.in);
                System.out.print("Pergunta 1: Que ambientação você prefere?\n1. Sci-fi\n2. Medieval\nOpção: ");
                int opcao1 = leitor.nextInt();
                //1. Sci-fi
                if (opcao1 == 1) {
                    System.out.print("Pergunta 2: Que gênero você prefere?\n1. Comédia\n2. Drama\nOpção: ");
                    int opcao2 = leitor.nextInt();
                //Homens de Preto
                if (opcao2 == 1) {
                    System.out.print("O filme indicado pra você é: " + movies[0]);
                    break;
                    //Arrival
                } else if (opcao2 == 2) {
                    System.out.print("O filme indicado pra você é: " + movies[1]);
                    break;
                } else {
                    System.out.println("Opção " + opcao2 + " Invalida. Tente de novo!");
                }
                //2. Medieval
                } else if (opcao1 == 2) {
                    System.out.print("Pergunta 2: Que gênero você prefere?\n1. Comédia\n2. Drama\nOpção: ");
                    int opcao2 = leitor.nextInt();
                    //Shrek
                    if (opcao2 == 1) {
                        System.out.print("O filme indicado pra você é: " + movies[2]);
                        break;
                    //Gladiador
                    } else if (opcao2 == 2) {
                        System.out.print("O filme indicado pra você é: " + movies[3]);
                        break;
                    } else {
                        System.out.print("Opção " + opcao2 + "Invalida");
                    }
                } else {
                    System.out.println("Opção " + opcao1 + " Invalida. Tente de novo!");
                }
            } catch (InputMismatchException _){
            System.out.println("Valor inválido. Tente de novo com um numero inteiro!");
            }
        }
    }
}