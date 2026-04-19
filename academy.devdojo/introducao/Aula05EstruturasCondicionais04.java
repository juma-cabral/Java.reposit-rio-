package introducao;

import java.util.Scanner;
public class Aula05EstruturasCondicionais04 {
    public  static void main(String[] args) {
        double salarioAnual;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.5 / 100;
        double terceiraTaxa = 49.50 / 100;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu salário");
        salarioAnual = input.nextFloat();

        if (salarioAnual <= 34000) {
            salarioAnual = salarioAnual * primeiraTaxa;
            System.out.println(" Esse é o seu salário t1 " + salarioAnual);
        } else if (salarioAnual >= 34000 && salarioAnual <= 68000) {
            salarioAnual *= segundaTaxa; // é a mesma coisa que foi escrita em cima mas usando um operador lógico
            System.out.println(" Esse é o seu salário t2 " + salarioAnual);
        } else {
            salarioAnual *= terceiraTaxa;
            System.out.println(" Esse é o seu salário t3 " + salarioAnual);
        }

    }
}
