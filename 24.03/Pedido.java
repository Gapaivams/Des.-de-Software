import java.util.ArrayList;

public class Pedido {
    String nome;
    double precoTotal = 0;
    ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido(String nome){
        this.nome = nome;
    }

    public void adicionarProduto(Produto... produto){
        for(Produto p : produto){
            this.produtos.add(p);
            this.precoTotal += p.preco;
        }
    }

    public void mostrarProdutos(){
        for(Produto p : this.produtos){
            System.out.printf("\nProduto: %s ---- Preço: R$%.2f\n", p.nome, p.preco);
        }
        System.out.printf("Valor total da compra = R$%.2f\n", this.precoTotal);
    }
}
