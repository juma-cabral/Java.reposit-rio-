package academy.devdojo.javacore.kenum.Test;

import academy.devdojo.javacore.kenum.Dominio.Cliente;
import academy.devdojo.javacore.kenum.Dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Julianna", Cliente.TipoPagamento.CREDITO, TipoCliente.PESSOA_FISICA) ;
        Cliente cliente2 = new Cliente("Akira", Cliente.TipoPagamento.DEBITO, TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
