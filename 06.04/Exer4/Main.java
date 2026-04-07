public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Jorge", 1114.15);
        System.out.println(conta.titular + " " + conta.saldo);
    }
}
