public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        System.out.printf("Saldo: R$%.2f", saldo);
    }
}