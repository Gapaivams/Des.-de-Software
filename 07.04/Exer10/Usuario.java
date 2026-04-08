public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        setEmail(email);
        setNome(nome);
        setSenha(senha);
    }

    public void setNome(String nome){   
        this.nome = nome;
    }
    public void setEmail(String email){   
        this.email = email;
    }
    public void setSenha(String senha){
        if(senha.length() >= 6){
            this.senha = senha;
        }   
        else{
            System.err.println("A senha deve conter pelo menos 6 caracteres");
        }
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
}
