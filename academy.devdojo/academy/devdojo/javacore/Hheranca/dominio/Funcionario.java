package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private Double salario;

    public void imprime (){
        System.out.println("Nome do funcionario: " + this.nome);
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
