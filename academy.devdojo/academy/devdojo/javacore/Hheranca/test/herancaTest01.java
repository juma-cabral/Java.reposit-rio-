package academy.devdojo.javacore.Hheranca.test;

import academy.devdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javacore.Hheranca.dominio.Pessoa;

public class herancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Nova ");
        endereco.setCep("12345-206");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juma");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sol");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(500.0);
        funcionario.imprime();

    }
}
