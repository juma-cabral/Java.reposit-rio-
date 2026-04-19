package academy.devdojo.javacore.introducaometodos.test;
import  java.util.Scanner;

import academy.devdojo.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora ca03 = new Calculadora();// eu poderia dar o nome de c01 que iria funcionar
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = input.nextDouble();

        double result = ca03.divideDoisNumeros(num1, num2);
        System.out.println("Resultado: " + result);

    }
}
