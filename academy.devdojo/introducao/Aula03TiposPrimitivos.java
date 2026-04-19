package introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivos {

    public static void main(String[] args) {
        String  nome, endereco;
        int idade, data;
        float salario;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        System.out.println("Digite seu salario: ");
        salario = input.nextFloat();

        input.nextLine();

        System.out.println("Digite sua data de nascimento sem pontuação: ");
        data = input.nextInt();


        System.out.println("Digite seu endereço: ");
        endereco = input.nextLine();

        System.out.println( "Eu, " + nome + " morando no endereço " + endereco +
                " confirmo que recebi o salário de, " + salario + " na atual data" + data );

    }
}
