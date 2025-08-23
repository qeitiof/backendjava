package org.example;

import java.util.Random;

public class GeradorDePokemon {

    private static final String[] NOMES = {
            "Pikachu", "Charmander", "Bulbasaur", "Squirtle", "Jigglypuff", "Meowth", "Psyduck"
    };

    private static final String[] TIPOS = {
            "Elétrico", "Fogo", "Planta", "Água", "Normal", "Psíquico", "Inseto"
    };

    private static final Random RANDOM = new Random();

    public static Pokemon gerar() {
        String nome = NOMES[RANDOM.nextInt(NOMES.length)];
        String tipo = TIPOS[RANDOM.nextInt(TIPOS.length)];
        int nivel = RANDOM.nextInt(1, 101);
        return new Pokemon(nome, tipo, nivel);
    }
}
