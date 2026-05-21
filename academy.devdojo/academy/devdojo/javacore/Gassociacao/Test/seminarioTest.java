package academy.devdojo.javacore.Gassociacao.Test;
import academy.devdojo.javacore.Gassociacao.dominio.Alunos;
import academy.devdojo.javacore.Gassociacao.dominio.Professor02;
import academy.devdojo.javacore.Gassociacao.dominio.Seminario;
import academy.devdojo.javacore.Gassociacao.dominio.Local;


public class seminarioTest {
    public static void main(String[] args) {
        Local local01 = new Local("Japão");
        Alunos aluno = new Alunos ("Julianna", 15);
        Professor02 professor = new Professor02("Deyvson", "Matematica");
        Alunos[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Logaritmo", alunosParaSeminario, local01);
        Seminario[] seminariOS = {seminario};

        professor.setSeminario(seminariOS);

        System.out.println("Relatório");
        professor.imprime();



    }
}
