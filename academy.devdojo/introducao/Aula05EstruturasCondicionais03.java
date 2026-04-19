package introducao;

import java.util.Scanner;
    public class Aula05EstruturasCondicionais03 {
       public static void main(String[] args) {
            double salario;
            Scanner input = new Scanner(System.in);
            //(condição operador ternário)? verdadeiro : falso


           /* if (salario >= 5000) {
                System.out.println("Voce pode fazer a doação");
            } else {
                System.out.println("Tu é liso pode fazer krai nenhum n");
                //comentei só pra não me atrapalhar
            }*/

           //operador ternário: (condição) ? verdadeiro : falso


           System.out.println("Qual o seu salário?");
           salario = input.nextDouble();

           String resultado = (salario >= 5000)? "Voce pode fazer essa doação" : "Tu é liso";

           System.out.println(resultado);
        }
}
