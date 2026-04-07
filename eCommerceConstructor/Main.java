public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jorge");
        Cliente cliente2 = new Cliente("Fernando");


        ProdutoFisico produtoFisico = new ProdutoFisico("Notebook", 3000, 2.7);
        
        ProdutoDigital produtoDigital = new ProdutoDigital("Curso Java", 159.99 , 200);

        Pedido pedido1 = new Pedido(cliente1, produtoDigital);
        Pedido pedido2 = new Pedido(cliente1, produtoFisico);

        Carrinho carrinho = new Carrinho();

        
        carrinho.adicionarProduto(pedido1);

        carrinho.adicionarProduto(pedido2);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}
