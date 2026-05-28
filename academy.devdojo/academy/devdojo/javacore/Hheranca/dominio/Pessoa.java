package academy.devdojo.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização 1 de pessoa");
    }
    {
        System.out.println("Bloco de inicialização 2 de pessoa");
    }

    public Pessoa(String nome){
        System.out.println("Dentro de construtor de pessoa");
        this.nome = nome;
    }


    public void imprime(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + "Cep: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}