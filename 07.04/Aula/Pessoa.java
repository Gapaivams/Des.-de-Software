public class Pessoa {
    private String nome;
    private int idade;

    public void alterarIdadeUsuario(int idade){
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }

    }

    public void alterarNomeUsuario(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
