package Exer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Registravel ponto;
        int escolha;

        do{
            System.out.println("Escolha uma opção:\n1. Ponto estagiario\n2. Ponto desenvolvedor\n3. Ponto gerente\n4. Sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    ponto = new Estagiario();
                    ponto.registrarEntrada();
                    break;
                case 2:
                    ponto = new Desenvolvedor();
                    ponto.registrarEntrada();
                    break;
                case 3:
                    ponto = new Gerente();
                    ponto.registrarEntrada();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
            
                default:
                    break;
            }
        }while(escolha != 4);

        entrada.close();
    }
}
