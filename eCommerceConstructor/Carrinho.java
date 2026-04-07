import java.util.ArrayList;

class Carrinho{
    ArrayList<Pedido>pedidos = new ArrayList<>();

    void adicionarProduto(Pedido pedido){
        pedidos.add(pedido);
    }

    void listarProdutos(){
        System.out.println();
        for(Pedido p : pedidos){
            if(p.produto instanceof ProdutoFisico){
                System.out.printf("\nProduto: %s -- R$%.2f -- Peso: %.2f kg\n\n", p.produto.nome, p.produto.preco, ((ProdutoFisico) p.produto).peso);
            } else{
                System.out.printf("\nProduto: %s -- R$%.2f -- Tamanho: %.2f mb\n\n", p.produto.nome, p.produto.preco, ((ProdutoDigital) p.produto).tamanhoArquivo);
            }
        }
    }

    void calcularTotal(){
        double total = 0;

        for(Pedido p : pedidos){
            total += p.produto.preco;
        }

        System.out.printf("\n\nTotal: R$%.2f\n", total);
    }
}