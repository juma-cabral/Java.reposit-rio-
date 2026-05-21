package academy.devdojo.javacore.Gassociacao.dominio;

public class Professor02 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor02(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor02(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminario;
    }

    public void imprime(){
        System.out.println("---Professor---");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
       if (this.seminarios != null){
            for (Seminario seminario: this.seminarios) {
                System.out.println("Seminário titulo" + seminario.getTitulo());
                System.out.println("Local: " + seminario.getLocal().getEndereco());
                if (seminario.getAlunos() == null) continue;
                System.out.println("*Alunos*");
                for (Alunos aluno : seminario.getAlunos()){
                    System.out.println("Aluno: " + aluno.getNome());
                    System.out.println("Idade: " + aluno.getIdade());
                }
            }
       } else {
            System.out.println("Esse professor ainda n ta relacionado a um seminário");
        }
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminarios = seminario;
    }
}
