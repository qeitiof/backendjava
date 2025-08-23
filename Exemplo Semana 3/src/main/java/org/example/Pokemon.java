package org.example;

public class Pokemon {
    String nome;
    String tipo;
    int nivel;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String toString() {
        return nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".";
    }
}

