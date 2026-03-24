public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrar(){
        System.out.printf("\n\nNome: %s\nIdade: %d anos", nome, idade);
    }
}
