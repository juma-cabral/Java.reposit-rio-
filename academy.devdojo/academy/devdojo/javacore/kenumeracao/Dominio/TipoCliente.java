package academy.devdojo.javacore.kenumeracao.Dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica"),;

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String relatorio) {
        this.valor = valor;
        this.nomeRelatorio = relatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
           if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
               return tipoCliente;
           }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
