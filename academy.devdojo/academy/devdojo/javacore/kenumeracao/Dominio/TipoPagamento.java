package academy.devdojo.javacore.kenumeracao.Dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.5;
        }
    },

    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    };

    public abstract double calcularDesconto(double valor);
}