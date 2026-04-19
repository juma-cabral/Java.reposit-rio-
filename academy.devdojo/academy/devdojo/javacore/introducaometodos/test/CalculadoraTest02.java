package academy.devdojo.javacore.introducaometodos.test;

import academy.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora ca02 = new Calculadora();
        ca02.multiplicarDoisNumeros(10, 20.5F); // o que ta dentro dos parametros são chamados de argumentos
        // o numero de metodos usados tem que ser igual o numero de argumentos, se não da erro 
    }
}
