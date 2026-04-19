package introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int contador = 0;
        while ( contador <= 10){
            System.out.println(contador);
            contador++; // isso é igual contador = contador + 1;
        }
        contador = 0;
        do {
            System.out.println("Dentro do 'do while' " + contador);
            contador += 2;
        } while (contador < 10);

        for(int i = 0; i < 10; i++){
            System.out.println( "for" + i);
        }
    }
}
