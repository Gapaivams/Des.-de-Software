import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo da conta");
        double saldo = entrada.nextDouble();

        ContaBancaria joao = new ContaBancaria(saldo);

        joao.setNome("João");
        System.out.println(joao.getTitular() + " " + joao.getSaldo());
        
    }
}
