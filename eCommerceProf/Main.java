import java.util.ArrayList;

class Produto{
    String nome;
    double preco;

    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class Carrinho{
    ArrayList<Produto>produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listarProdutos(){
        System.out.println();
        for(Produto p : produtos){
            System.out.printf("\nProduto: %s -- R$%.2f\n\n", p.nome, p.preco);
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


public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000);
        Produto produto2 = new Produto("Monitor", 800);
        Produto produto3 = new Produto("Mouse", 300);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}
