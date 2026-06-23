package academy.devdojo.javacore.kenumeracao.Test;

import academy.devdojo.javacore.kenumeracao.Dominio.Cliente;
import academy.devdojo.javacore.kenumeracao.Dominio.TipoCliente;
import academy.devdojo.javacore.kenumeracao.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Julianna", TipoPagamento.CREDITO, TipoCliente.PESSOA_FISICA) ;
        Cliente cliente2 = new Cliente("Akira", TipoPagamento.DEBITO, TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente2);
    }
}
