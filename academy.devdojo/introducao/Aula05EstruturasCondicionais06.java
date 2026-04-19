package introducao;

import java.util.Scanner;
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia;
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um numéro de acordo com o dia da semana que voce quer");
        dia = input.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido burrão");
                break;
        }
        if ( dia == 1 || dia == 7){
            System.out.println("Fim de semana");
        } else if( dia >= 2 && dia <= 6) {
            System.out.println("Dia de semana otário");
        } else{
            System.out.println("ESSE NÚMERO É INVALIDO PORRAAAAAA");
        }
        }
    }


