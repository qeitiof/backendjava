package org.example;

public class Jogador {
    String nome;
    String sobrenome;
    String posicao;
    String clube;
    int idade;

    public Jogador(String nome, String sobrenome, String posicao, String clube, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.clube = clube;
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getDescricao() {
        return getNomeCompleto() + " é um futebolista brasileiro de " + idade +
                " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
}
