package academy.devdojo.javacore.Fmodificadorestatico.test;
import academy.devdojo.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(600);

        Carro c01 = new Carro("BMW", 280);
        Carro c02 = new Carro ("Mercedes", 275);
        Carro c03 = new Carro ("Audi", 290);



        c01.imprime();
        c02.imprime();
        c03.imprime();
    }
}
