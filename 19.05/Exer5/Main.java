package Exer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0;
        PagamentoGame metodo;

        System.out.printf("\nDigite seu nome: \n");
        String nome = entrada.nextLine();


        System.out.printf("\nEscolha o jogo:\n1. Zelda ---- R$399.99\n2. The witcher ---- R$89.99\n3. Final Fantasy ---- R$299.99\n4. Sair\n");
        int jogoEscolha;
        do{

            jogoEscolha = entrada.nextInt();
            switch (jogoEscolha) {
                case 1:
                    valor += 399.99;
                    System.out.println("Produto adicionado ao carrinho");
                    break;
                case 2:
                    valor += 89.99;
                    System.out.println("Produto adicionado ao carrinho");
                    break;
                case 3:
                    valor += 299.99;
                    System.out.println("Produto adicionado ao carrinho");
                    break;
                case 4:
                    System.out.println("Indo para a seleção do metodo de pagamento");
                    break;
            
                default:
                    valor = -1;
                    System.out.println("Produto nao identificado");
                    break;
            }
        }while(jogoEscolha != 4);

        System.out.printf("\nDigite O metodo de pagamento:\n1. Pix\n2. Cartão\n3. Paypal");
        int pagamentoEscolha = entrada.nextInt();

        switch (pagamentoEscolha) {
            case 1:
                metodo = new PixGame();
                break;
            case 2:
                metodo = new CartaoGame();
                break;
            case 3:
                metodo = new PaypalGame();
                break;
        
            default:
                metodo = null;
                System.out.println("Metodo nao identificado");
                break;
        }

        if(valor >= 0 && metodo != null){
            Compra compra = new Compra(nome, valor, metodo);
            compra.mostrarResumo();
        }

        entrada.close();
    }
}
