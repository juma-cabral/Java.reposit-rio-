package academy.devdojo.javacore.Csobrecargametodos.test;

import academy.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("HxH", "tv", 22);
        anime.imprime();
    }
}
