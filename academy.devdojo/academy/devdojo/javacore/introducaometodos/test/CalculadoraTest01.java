package academy.devdojo.javacore.introducaometodos.test;

import academy.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora ca01 = new Calculadora();

        ca01.somaDoisNumeros(); /*essa linha roda o bloco de comando que a escrito ´(chama o
        metodo)´ no metodo somarDoisnumeros()
        dentro da Classe calculadora*/

        System.out.println("Finalizando CalculadoraTest01 ");//apos executar o metodo ele volta pra essa linha normalmente

        ca01.subtrairDoisNumeros();

    }

}