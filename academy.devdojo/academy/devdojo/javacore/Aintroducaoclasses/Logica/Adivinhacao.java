package academy.devdojo.javacore.Aintroducaoclasses.Logica;

import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSecreto = 0;
        int palpite = 0;

        System.out.println("Peça para um amigo digitar o número ate 20: ");
        numSecreto = input.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n");

        do{
            System.out.println("Qual o seu palpite? ");
            palpite = input.nextInt();
            if(palpite<numSecreto){
                System.out.println("O numero é maior que o palpite :)\n");

            }else if(palpite>numSecreto){
                System.out.println("O numero é menor que o palpite :)\n");

            }else {
                System.out.println("Voce ACERTOUUU!!!");
                break;
            }

        }while(palpite != numSecreto);
        input.close();


    }
}