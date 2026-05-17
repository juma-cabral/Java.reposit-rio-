package academy.devdojo.javacore.Gassociacao.Test;
import academy.devdojo.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.javacore.Gassociacao.dominio.Escola;


public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("juma");
        Professor[] professores = {professor1};
        Escola escola1 = new Escola("Kanoa", professores);

        escola1.imprime();




    }
}
