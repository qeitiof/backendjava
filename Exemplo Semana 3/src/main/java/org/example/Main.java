package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Gerar jogador aleatório");
            System.out.println("2. Listar jogadores gerados");
            System.out.println("3. Ver detalhes de um jogador");
            System.out.println("4. Gerar senha aleatória");
            System.out.println("5. Gerar Pokémons aleatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                // ... casos 1 a 4 omitidos para foco no 5
                case 5 -> {
                    System.out.print("Quantos Pokémons deseja gerar? ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < quantidade; i++) {
                        Pokemon p = GeradorDePokemon.gerar();
                        System.out.println(p);
                    }
                }
                case 0 -> {
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
