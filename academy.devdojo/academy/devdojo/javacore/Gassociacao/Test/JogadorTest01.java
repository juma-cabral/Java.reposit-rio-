package academy.devdojo.javacore.Gassociacao.Test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;

import  java.util.Scanner;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Romario");
        Jogador jogador02 = new Jogador("Maria");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador [] jogadores = new Jogador[]{jogador01,jogador02,jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
