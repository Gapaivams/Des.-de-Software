public class Pedido {

    Cliente cliente;
    Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void mostrarProdutos(){
        System.out.printf("\nCarrinho do Usuario: %s\n", cliente.getNome());
        System.out.printf("\nLista de produtos:\n");
        carrinho.listarProdutos();
        System.out.println();
        carrinho.calcularTotal();
    }

    


}
