public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno();

        joao.setNome("João");
        joao.setNota(10);
        
        System.out.println(joao.getNome() + " " + joao.getNota());
        
        
        
        joao.setNota(-10);
        System.out.println(joao.getNome() + " " + joao.getNota());
    }
}
