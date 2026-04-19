package introducao;

import java.util.Scanner;

public class Aula04Operadodes {
    public static void main(String[] args) {
        //& (AND) || (OR) !
        int idade;
        float salario;
        Scanner input = new Scanner(System.in);


        System.out.println("Qual a sua idade? ");
        idade = input.nextInt();

        System.out.println("Qual o seu salario? ");
        salario = input.nextFloat();

        if (salario > 4612 && idade > 30) {
            System.out.println("Voce esta Dentro da lei");
        }else {
            System.out.println("Voce nao esta Dentro da lei");
        }
        // fiquei com preguiça de fazer o operador do OU, mas ele funciona igual a C
    }
}
