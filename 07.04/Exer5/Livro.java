public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas){
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
    }

    public void setTitulo(String titulo){
        this. titulo = titulo;
    }
    public void setAutor(String autor){
        this. autor = autor;
    }
    public void setPaginas(int paginas){
        this.paginas  = paginas;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }

}
