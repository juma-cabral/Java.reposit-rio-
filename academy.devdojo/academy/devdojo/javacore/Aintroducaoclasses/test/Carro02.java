package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class Carro02 {
    public static void main(String[] args) {
        Carro c02 = new Carro();
        c02.modelo = "Ferrari";
        c02.ano = 2004;
        c02.nome = "Solari";

        System.out.println(c02.modelo + ", " + c02.ano + ", " + c02.nome); // eu poderia ter colocado os dois
        //objetos no mesmo arquivo, mas fui meio ju e não fiz
    }
}
