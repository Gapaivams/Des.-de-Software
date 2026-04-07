public class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha){
        if(senha.length() >= 6){
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            System.out.println("Usuario registrado com sucesso");
        }else {
            System.out.println("A senha deve conter pelo menos 6 caracteres");
        }
    }

    public void mostrarDados(){
        if(this.nome != null && this.email != null){
            System.out.printf("\nNome: %s ---- Email:%s\n", this.nome, this.email);
        }
    }
}
