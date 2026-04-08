public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno();

        joao.setNome("João");
        joao.setIdade(10);
        
        System.out.println(joao.getNome() + " " + joao.getIdade());
        
        
        
        joao.setIdade(-10);
        System.out.println(joao.getNome() + " " + joao.getIdade());
    }
}
