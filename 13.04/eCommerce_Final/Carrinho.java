import java.util.ArrayList;

class Carrinho{
    ArrayList<Produto>produtos;


    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    void adicionarProduto(Produto produto, String escolha){
        Produto existente = produtos.stream().filter(p -> p.nome.trim().toLowerCase().equalsIgnoreCase(escolha.toLowerCase())).findFirst().orElse(null);
        if(existente != null){
            existente.preco = existente.preco += produto.preco;
        }else{
            if (produto.getPreco() > 0){
                produtos.add(produto);
            } else {
                System.out.println("Esse produto nao possui preço");
            }
        }

    }

    void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    void listarProdutos(){
        if(!produtos.isEmpty()){
            System.out.println();
            for(Produto p : produtos){
                System.out.printf("\nProduto: %s -- R$%.2f\n\n", p.nome, p.preco);
            }
        } else{
            System.out.println("O seu carrinho esta vazio no momento");
        }
    }

    

    void calcularTotal(){
        double total = 0;

        for(Produto p : produtos){
            total += p.preco;
        }

        System.out.printf("\n\nTotal: R$%.2f\n", total);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    
}