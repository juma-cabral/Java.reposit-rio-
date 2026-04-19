package introducao;

import java.util.Scanner;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana considerando o 1 dia o domingo
        byte dia;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        dia = input.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo");
                break; //se não colocar o break ele vai continuar imprimindo os resultados apos o que nós queremos
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sabado");
                break;
            default:
                System.out.println("opçao invalida");
                break;// o default ele pode estar em qualquer posição, não necessariamente em ultimo, ma geralmente ele ta em último

        }
        char sexo;

        System.out.println("Digite o sexo (M) ou (F): ");
        sexo = input.next().charAt(0);
       //EX 2
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
                case 'F':
                    System.out.println("Feminino");
                    break;
                    default:
                        System.out.println("te dana");
                        break;
        }
    }
}
