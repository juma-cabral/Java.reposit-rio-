package academy.devdojo.javacore.Gassociacao.Test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;


public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Daniel");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Jogador ---");


        System.out.println("---Time ---");
        time.imprime();
        /*
        criamos duas instancias para jogador e uma para time (ja que estamos trabalhando que um time especifico, Brasil,
        recebe, nesse caso, dois jogadores) criamos uma array para jogador e colocamos os objetos criados
        nela. jogador1.setTime(time);jogador2.setTime(time); aqui pegamos o objeto jogador e colocamos ele
        dentro do time. time.setJogadores(jogadores); e aqui pegamos o time e dizemos "em voce é esses jogadores aqui que estão jogando"



        */

    }
}
