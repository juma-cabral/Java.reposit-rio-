package academy.devdojo.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 1. Bloco de inicialização estático (Executa apenas uma vez quando a classe é carregada)
    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[10]; // Reduzi para 10 apenas para o console não ficar gigante
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");

    }

    {
        System.out.println("Dentro do bloco de inicialização ");

    }

    // 2. Construtor sem argumentos
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
        // Não reinstanciamos o array aqui, apenas usamos o que o bloco estático criou
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("\n");
    }

    // 3. Construtor com argumentos (Boa prática: chama o construtor padrão primeiro)
    public Anime(String nome) {
        this(); // Chama o construtor Anime() para imprimir os episódios
        this.nome = nome;
        System.out.println("Dentro do construtor com nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}