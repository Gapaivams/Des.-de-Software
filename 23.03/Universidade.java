public class Universidade {
    String nome;
    String cidade;
    
    public Universidade(String nome,
    String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    public void mostrarUni(){
        System.out.printf("%s da cidade de %s", nome, cidade);
    }
}
