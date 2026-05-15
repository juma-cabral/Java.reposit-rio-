package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro c01 = new Carro();
        c01.modelo = "gol";
        c01.ano = 2021;
        c01.nome = "Fiat";

        Carro c02 = new Carro();
        c02.modelo = "Ferrari";
        c02.ano = 2004;
        c02.nome = "Solari";

        c01 = c02; // esse tipo de associação só pode ser feito com objetos da mesma classe
        //se eu pegasse o objeto estudante da classe Estudante não iria acontecer isso

        System.out.println(c01.nome+ ", " + c01.ano + ", " + c01.modelo);
        System.out.println(c02.nome+ ", " + c02.ano + ", " + c02.modelo);


    }
}
