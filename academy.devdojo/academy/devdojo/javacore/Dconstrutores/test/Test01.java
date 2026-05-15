package academy.devdojo.javacore.Dconstrutores.test;

import academy.devdojo.javacore.Dconstrutores.Dominio.Anime;

public class Test01 {
    public static void main(String[] args) {
        Anime anime = new Anime("GOT", "TV", 12, "Comedia");
        anime.imprime();
    }
}
