public class Aluno {
    String nome;
    String matricula;
    String curso;
    String cpf;
    double nota;

    public Aluno(String nome, String matricula, String curso, String cpf, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.nota = nota;
    }

    public void apresentar(){
        System.out.println("Meu nome é: " + nome);
        System.out.println("Curso " + curso);
        System.out.println("Minha nota atual é " + nota);
        System.out.println();
    }


}
