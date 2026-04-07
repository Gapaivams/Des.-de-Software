public class Main {
    public static void main(String[] args) {
        Usuario joao = new Usuario("João", "joao@email.com", "12345");
        Usuario maria = new Usuario("Maria", "maria@email.com", "123456");

        joao.mostrarDados();
        maria.mostrarDados();
    }
}
