public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("João", "joao@email.com", "123456");
        
        System.out.println(joao.getNome() + " " + joao.getEmail() + " " + joao.getSenha());
    }
}
