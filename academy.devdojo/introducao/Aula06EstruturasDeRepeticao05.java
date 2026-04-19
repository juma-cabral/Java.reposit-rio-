package introducao;

import java.util.Scanner;
public class Aula06EstruturasDeRepeticao05 {
    // em quantas parcelas o carro pode ser parcelado mas o valorParcelas >=1000

    public static void main(String[] args) {
        double valorTotal, valorParcela;
        int parcela;
        System.out.println("Em quantas parcelas voce quer coisar o carro?");
        Scanner input = new Scanner(System.in);
        valorTotal = input.nextDouble();

        for (parcela = 1; parcela <= valorTotal ; parcela++){
            valorParcela = valorTotal / parcela;

            if(valorParcela < 1000){
                continue;
            }
            System.out.printf("Parcela %d: R$ %.2f\n", parcela, valorParcela);
        }


    }
}
