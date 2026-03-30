import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    String nome;
    double preco = 0;
    int unid = 0;

    public Carrinho(String nome){
        this.nome = nome;
    }

    public void adicionarProduto(ArrayList<Produto> produtos, Scanner entrada, ArrayList<Carrinho> produtosCarrinho){
        entrada.nextLine();
        System.out.println("\nEscolha o produto que deseja comprar\n");
        String escolha = entrada.nextLine().trim();

        for(Produto p : produtos){
            System.out.println("\nproduto: " + p.nome.toLowerCase().trim());
        }

        System.out.println("\nproduto escolhido: " + escolha.toLowerCase().trim());

        Produto add = produtos.stream().filter(p -> p.nome.trim().toLowerCase().equalsIgnoreCase(escolha.toLowerCase())).findFirst().orElse(null);

        if(add == null){
            System.out.println("Produto nao encontrado");
            return;
        }

        System.out.println("\nEscolha a quantidade que deseja comprar\n");
        Carrinho existente = produtosCarrinho.stream().filter(c -> c.nome.trim().equalsIgnoreCase(escolha.trim())).findFirst().orElse(null);
        int quantidade = entrada.nextInt();

        if (quantidade > 0 && quantidade <= add.estoque) {

            add.estoque -= quantidade;

            if (existente != null) {
                // Produto já está no carrinho → soma
                existente.unid += quantidade;
                existente.preco += add.preco * quantidade;
            } else {
                // Produto não existe → cria novo
                Carrinho car = new Carrinho(escolha);
                car.unid = quantidade;
                car.preco = add.preco * quantidade;
                produtosCarrinho.add(car);
            }
        }


        
        
    }

    public void mostrarCarrinho(ArrayList<Carrinho> produtosCar){
        for(Carrinho p : produtosCar){
            System.out.printf("\nProduto: %s ---- Preço: R$%.2f\n", p.nome, p.preco);
        }
        
    }

    public void mostrarTotal(ArrayList<Carrinho> produtosCar){
        double precoTotal = 0;
        for(Carrinho c : produtosCar){
            precoTotal += c.preco;
        }
        System.out.printf("\nValor total da compra = R$%.2f\n", precoTotal > 200 ? precoTotal - precoTotal*0.1 : precoTotal);
    }
}