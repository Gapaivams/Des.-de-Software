public class Aula10 {
    public static void main(String[] args) {
        // Usuario user = new Usuario("coxinha", "2");
        // System.out.println(user.getNome() + " " + user.getSenha());
        // user.alterarSenhaUsuario("234");
        // user.alterarNomeUsuario("Maria");
        // System.out.println(user.getNome() + " " + user.getSenha());

        Pessoa joao = new Pessoa();

        joao.alterarNomeUsuario("João");
        joao.alterarIdadeUsuario(-10);

        System.out.println(joao.getNome() + " " + joao.getIdade());
    }
}
