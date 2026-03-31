public class Main{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jose", 20, "ADS");
        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.curso);

        Professor professor1 = new Professor("Rose", 30, "Eng. de Software");
        System.out.println(professor1.nome);
        System.out.println(professor1.idade);
        System.out.println(professor1.disciplina);
    }

    
}
