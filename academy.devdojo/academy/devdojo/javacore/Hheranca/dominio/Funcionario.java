package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private Double salario;

    static {
        System.out.println("Dentro do bloco estático de Funcionario");
    }
    {
        System.out.println("Bloco de inicialização 1 Funcionario");
    }
    {
        System.out.println("Bloco de inicialização 2 Funcionario");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime (){
        super.imprime();
        System.out.println("Nome do funcionario: " + this.nome);
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
