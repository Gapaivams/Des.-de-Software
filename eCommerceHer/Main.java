public class Main {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico("Notebook", 3000, 2.7);
        
        ProdutoDigital produtoDigital = new ProdutoDigital("Curso Java", 159.99 , 200);

        Carrinho carrinho = new Carrinho();

        
        carrinho.adicionarProduto(produtoFisico);

        carrinho.adicionarProduto(produtoDigital);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}
