package org.example;

import java.util.Random;

public class GeradorDeJogador {
    private static final String[] nomes = {"Cristiano","Wellinton", "Sidnei", "Neymar","Ribamar","Clodosvaldo"};
    private static final String[] sobrenomes = {"Da Silva","Santos", "Ronaldo", "Nazário","Gaucho","Carioca"};
    private static final String[] posicoes = {"Goleiro","Atacante","Lateral","Meio Campo","Volante","Zagueiro"};
    private static final String[] clubes = {"Inter","Gremio","Criciuma","Corinthians","Flamengo","Palmeiras"};

    private static final Random random = new Random();

    public static Jogador gerar() {
        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String clube = clubes[random.nextInt(clubes.length)];
        int idade = random.nextInt(16, 45);

        return new Jogador(nome, sobrenome, posicao, clube, idade);
    }
}
