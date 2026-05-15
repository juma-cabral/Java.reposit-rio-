package introducao;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Aula07Arrays03 {
    public static void main(String[] args) {
       int[] numeros = {1,2,3,4,5};
        int[] numeros2 = new int[]{1,2,3,4,5};

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros2[i]);
        }
        System.out.println("\n");
        for(int i: numeros2){
            System.out.println(i);
        }
    }



}
