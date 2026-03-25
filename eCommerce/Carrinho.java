import java.util.ArrayList;

public class Carrinho {
    String nome;
    double precoTotal = 0;
    ArrayList<Produto> produtos = new ArrayList<>();

    public Carrinho(String nome){
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
        
    }

    public void mostrarTotal(){
        System.out.printf("\nValor total da compra = R$%.2f\n", this.precoTotal > 200 ? this.precoTotal - this.precoTotal*0.1 : this.precoTotal);
    }
}
