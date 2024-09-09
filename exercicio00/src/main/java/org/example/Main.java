package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = leitor.next();

        System.out.print("Digite seu segundo nome: ");
        String segundoNome = leitor.next();

        Random geradorAleatorio = new Random();
        int numeroAleatorio = geradorAleatorio.nextInt(1, 100);

        System.out.print(primeiroNome + segundoNome + numeroAleatorio);
    }
}