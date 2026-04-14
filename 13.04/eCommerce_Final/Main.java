import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "UTF-8");
        int menu = 0;

        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto caqui = new Produto("Caqui", 2.99);
        Produto banana = new Produto("Banana", 3.99);
        Produto pera = new Produto("Pera", 4.99);


        produtos.add(caqui);
        produtos.add(banana);
        produtos.add(pera);

        Carrinho carrinho = new Carrinho();

        System.out.println("Digite o seu usuario: \n");
        String usuario = entrada.nextLine();

        Cliente cliente = new Cliente(usuario);

        Pedido pedido = new Pedido(cliente, carrinho);


        do{
            System.out.println("\nEscolha uma opção: \n1. Visualizar produtos\n2. Comprar produtos\n3. Remover Produto\n4. Mostrar Produtos\n5. Aplicar desconto\n6. Sair");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    for(Produto p : produtos){
                        System.out.printf("\nProduto: %s ---- Preço: R$%s\n", p.nome, p.preco);
                    }
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("Digite o produto que deseja adicionar");
                    String escolha1 = entrada.nextLine();
                    Produto add1 = produtos.stream().filter(p -> p.nome.trim().toLowerCase().equalsIgnoreCase(escolha1.toLowerCase())).findFirst().orElse(null);
                    
                    carrinho.adicionarProduto(add1, escolha1);
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("Digite o produto que deseja Remover");
                    String escolha2 = entrada.nextLine();
                    Produto add2 = produtos.stream().filter(p -> p.nome.trim().toLowerCase().equalsIgnoreCase(escolha2.toLowerCase())).findFirst().orElse(null);

                    carrinho.removerProduto(add2);
                    break;
                case 4:
                    pedido.mostrarProdutos();

                    break;

                case 5:
                    entrada.nextLine();
                    System.out.println("Digite o produto que deseja aplicar desconto");
                    String escolha3 = entrada.nextLine();
                    Produto add3 = produtos.stream().filter(p -> p.nome.trim().toLowerCase().equalsIgnoreCase(escolha3.toLowerCase())).findFirst().orElse(null);

                    System.out.println("Digite o percentual de desconto que deseja aplicar: ");
                    double percentual = entrada.nextDouble();

                    add3.aplicarDesconto(percentual);
                    
                    break;

                case 6:
                    carrinho.calcularTotal();
                    System.out.println("\nSaindo do programa...");
                    break;
            
                default:
                    System.out.println("\nOpção Invalida!!");
                    break;
            }
        }while(menu != 6);

        entrada.close();
    }
}
