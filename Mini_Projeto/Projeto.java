import java.util.Scanner;
public class Projeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu = 0;

        String[][] produtos = {{"Maçã", "1.99", "10"},{"Banana", "3.99", "10"},{"Pera", "2.99", "10"}};
        
        String[][] carrinho = new String[produtos.length][2];

        double totalCompra = 0;
        do{
            System.out.println("\nEscolha uma opção: \n1. Visualizar produtos\n2. Comprar produtos\n3. Mostrar Carrinho\n4. Finalizar Aplicação");
            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    mostrarProdutos(produtos);
                    break;
                case 2:
                    totalCompra += comprarProdutos(produtos, entrada , carrinho);
                    break;
                case 3:
                    mostrarCarrinho(carrinho);
                    break;
                case 4:
                    if(totalCompra > 200){
                        totalCompra = totalCompra - (totalCompra*0.1);
                    }
                
                    System.out.printf("\nTotal gasto no sistema: R$%.2f", totalCompra);

                    System.out.println("\nSaindo do programa...");
                    break;
            
                default:
                    System.out.println("\nOpção Invalida!!");
                    break;
            }
        }while(menu != 4);

        entrada.close();
    }

    

    public static void mostrarProdutos(String[][] mtrz){
        for(int i = 0; i < mtrz.length; i++){
            System.out.printf("\n%d. Produto: %s ---- Preço: R$%s ---- Estoque: %s\n", i+1, mtrz[i][0], mtrz[i][1], mtrz[i][2]);
        }
    }

    public static void mostrarCarrinho(String[][] mtrz){
        for(int i = 0; i < mtrz.length; i++){
            if(mtrz[i][0] != null){
                System.out.printf("\nProduto: %s ---- Quantidade: %s u.\n", mtrz[i][0], mtrz[i][1]);
            }
        }
    }


    public static double comprarProdutos(String[][] produtos, Scanner entrada, String[][] compras){
        
        System.out.println("\nEscolha o produto que deseja comprar\n");
        int escolha = entrada.nextInt();
        if (escolha > produtos.length || escolha < 0){
            System.out.println("Opção invalida");
            return 0;
        }
        int unid = 0;
        if(compras[escolha-1][1] != null){
            unid = Integer.parseInt(compras[escolha-1][1]);
        }
        System.out.println("\nEscolha a quantidade que deseja comprar\n");
        unid += entrada.nextInt();
        if (unid < 0){
            unid = 1;
        }

        boolean possuiEstoque = verificarQuantidade(produtos, escolha, unid);

        if (possuiEstoque){
            produtos[escolha-1][2] = String.valueOf(Integer.parseInt(produtos[escolha-1][2]) - unid);

            compras[escolha-1][0] = produtos[escolha-1][0];
            compras[escolha-1][1] = String.valueOf(unid);
    
            return Double.parseDouble(produtos[escolha-1][1]) * unid;
        } else{
            System.out.println("O estoque nao possui a quantidade desejada");
            return 0;
        }
        
        
    }

    public static boolean verificarQuantidade(String[][] mtrz, int escolha, int unid) {
        int quantidade = Integer.parseInt(mtrz[escolha][2]);
        if(unid > quantidade){
            return false;
        } else{
            return true;
        }
    }

}
