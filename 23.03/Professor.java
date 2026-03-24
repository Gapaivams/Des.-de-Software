public class Professor {
    String nome;
    String disciplina;

    public Professor(String nome,
    String disciplina){
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void mostrarProf(){
        System.out.printf("%s --- %s", nome, disciplina);
    }
}
