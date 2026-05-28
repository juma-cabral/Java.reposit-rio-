package academy.devdojo.javacore.Hheranca.test;

import academy.devdojo.javacore.Hheranca.dominio.Funcionario;

public class herancaTest02 {
    static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fernando");



    }
}
//0 - o bloco de inicialização estático da super classe é executado quando a JVM começa a carregar classe pai
//1- Bloco de inicialização da sub classe é executado quando a JVM carrega a classe filha
//2- Alocado objeto em memória para a classe pai
//3- Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado da classe pai
//4- o bloco de inicialização da super classe é executado na ordem em que aparece
//5- o construtor da super classe é inicializado