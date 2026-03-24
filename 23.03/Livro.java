public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo,
    String autor,
    int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirLivro(){
        System.out.printf("%s %s %d", titulo, autor, 1900);
    }
}
