public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public void alterarSenhaUsuario(String senha){
        this.senha = senha;
    }

    public void alterarNomeUsuario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public String getSenha(){
        return senha;
    }
}
