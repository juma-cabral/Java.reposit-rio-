package academy.devdojo.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String categoria;

    public Anime() {

    }
    public void init (String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public void init (String nome, String tipo, int episodios, String categoria) {
        this.init(nome, tipo, episodios);
        this.categoria = categoria;
    }

    public void imprime(){
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("Episodios: "+episodios);
        System.out.println("Categoria: "+categoria);

    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getTipo() {
        return tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
