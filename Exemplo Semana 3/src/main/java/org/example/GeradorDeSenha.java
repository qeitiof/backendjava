package org.example;

import java.util.Random;

public class GeradorDeSenha {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int TAMANHO_SENHA = 8;

    public static void main(String[] args) {
        String senha = gerarSenha();
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha() {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < TAMANHO_SENHA; i++) {
            int indice = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }

        return senha.toString();
    }
}
