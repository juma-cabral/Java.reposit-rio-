package academy.devdojo.javacore.introducaoclasses.test;

import academy.devdojo.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Maria";
        p1.sexo = 'F';
        p1.idade = 20;

        System.out.println(p1.nome + ", " + p1.sexo + ", " + p1.idade);
    }
}
