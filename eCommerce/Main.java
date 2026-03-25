import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu = 0;

        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto maca = new Produto("Maçã", 2.99, 10);
        Produto banana = new Produto("Banana", 3.99, 10);
        Produto pera = new Produto("Pera", 4.99, 10);

        Carrinho carrinho = new Carrinho("carrinho");

        produtos.add(maca);
        produtos.add(banana);
        produtos.add(pera);

        do{
            System.out.println("\nEscolha uma opção: \n1. Visualizar produtos\n2. Comprar produtos\n3. Mostrar Carrinho\n4. Finalizar Aplicação");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    for(Produto p : produtos){
                        System.out.printf("\n%d. Produto: %s ---- Preço: R$%s ---- Estoque: %s\n", p.nome, p.preco, p.estoque);
                    }
                    break;
                case 2:
                    carrinho.adicionarProduto(produto);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                
                    

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
