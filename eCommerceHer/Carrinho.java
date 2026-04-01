import java.util.ArrayList;

class Carrinho{
    ArrayList<Produto>produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listarProdutos(){
        System.out.println();
        for(Produto p : produtos){
            if(p instanceof ProdutoFisico){
                System.out.printf("\nProduto: %s -- R$%.2f -- Peso: %.2f kg\n\n", p.nome, p.preco, ((ProdutoFisico) p).peso);
            } else{
                System.out.printf("\nProduto: %s -- R$%.2f -- Tamanho: %.2f mb\n\n", p.nome, p.preco, ((ProdutoDigital) p).tamanhoArquivo);
            }
        }
    }

    void calcularTotal(){
        double total = 0;

        for(Produto p : produtos){
            total += p.preco;
        }

        System.out.printf("\n\nTotal: R$%.2f\n", total);
    }
}