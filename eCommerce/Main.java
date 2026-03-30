import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "UTF-8");
        int menu = 0;

        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Carrinho> produtosCar = new ArrayList<>();
        
        Produto caqui = new Produto("Caqui", 2.99, 100);
        Produto banana = new Produto("Banana", 3.99, 100);
        Produto pera = new Produto("Pera", 4.99, 100);

        Carrinho carrinho = new Carrinho("carrinho");

        produtos.add(caqui);
        produtos.add(banana);
        produtos.add(pera);

        do{
            System.out.println("\nEscolha uma opção: \n1. Visualizar produtos\n2. Comprar produtos\n3. Mostrar Carrinho\n4. Finalizar Aplicação");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    for(Produto p : produtos){
                        System.out.printf("\nProduto: %s ---- Preço: R$%s ---- Estoque: %s\n", p.nome, p.preco, p.estoque);
                    }
                    break;
                case 2:
                    for(Produto p : produtos){
                        System.out.println(p.nome);
                    }
                    carrinho.adicionarProduto(produtos, entrada, produtosCar);
                    break;
                case 3:
                    carrinho.mostrarCarrinho(produtosCar);
                    break;
                case 4:
                    
                    carrinho.mostrarTotal(produtosCar);
                    

                    System.out.println("\nSaindo do programa...");
                    break;
            
                default:
                    System.out.println("\nOpção Invalida!!");
                    break;
            }
        }while(menu != 4);

        entrada.close();
    }
}