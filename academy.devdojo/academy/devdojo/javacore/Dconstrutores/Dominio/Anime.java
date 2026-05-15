package academy.devdojo.javacore.Dconstrutores.Dominio;

    public class Anime {
        private String nome;
        private String tipo;
        private int episodios;
        private String categoria;
        private String estudio;

        public Anime(String nome, String tipo, int episodios, String categoria) {
            this();
            this.nome = nome;
            this.tipo = tipo;
            this.episodios = episodios;
            this.categoria = categoria;
            System.out.println("dentro do construtor");

        }
        public Anime() {
        }
        public Anime(String nome, String tipo, int episodios, String categoria, String estudio) {
           this(nome, tipo, episodios, categoria);
           this.estudio = estudio;

        }
        public void imprime(){
            System.out.println("Nome: " + nome);
            System.out.println("Tipo: " + tipo);
            System.out.println("Episodios: " + episodios);
            System.out.println("Categoria: " + categoria);
            System.out.println("Estudio: " + estudio);

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


