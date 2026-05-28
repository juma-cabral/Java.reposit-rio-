package academy.devdojo.javacore.JmodificadorFinal.test;

import academy.devdojo.javacore.JmodificadorFinal.dominio.Carro;
import academy.devdojo.javacore.JmodificadorFinal.dominio.Comprador;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.getNome());
    }
}
