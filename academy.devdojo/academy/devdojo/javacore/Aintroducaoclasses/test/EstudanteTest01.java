package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante e01 = new Estudante();
        e01.idade = 22;
        e01.sexo = 'F';
        e01.nome = "Juma";

        System.out.println(e01.nome);
        System.out.println(e01.sexo);
        System.out.println(e01.idade);
    }
}
