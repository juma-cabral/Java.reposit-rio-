package academy.devdojo.javacore.kenum.Dominio;

public class Cliente {
    public enum TipoPagamento {
        CREDITO,
        DEBITO

    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoPagamento tipoPagamento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome ='" + nome + '\'' +
                ", tipo ='" + tipoPagamento + '\'' +
                ", tipoCliente =" + tipoCliente +
                '}';
    }
}
