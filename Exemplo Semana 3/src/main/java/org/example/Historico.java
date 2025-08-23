package org.example;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<Jogador> jogadores = new ArrayList<>();

    public void adicionar(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listar() {
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador foi gerado ainda.");
        } else {
            for (int i = 0; i < jogadores.size(); i++) {
                Jogador j = jogadores.get(i);
                System.out.println((i + 1) + ". " + j.getNomeCompleto());
            }
        }
    }

    public Jogador buscarPorNome(String nomeBuscado) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNomeCompleto().equalsIgnoreCase(nomeBuscado)) {
                return jogador;
            }
        }
        return null;
    }
}
