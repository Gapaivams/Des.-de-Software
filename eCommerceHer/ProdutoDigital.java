public class ProdutoDigital extends Produto{
    double tamanhoArquivo;

    public ProdutoDigital(String nome,double preco, double tamanhoArquivo){
        super(nome, preco);

        this.tamanhoArquivo = tamanhoArquivo;
    }
}
