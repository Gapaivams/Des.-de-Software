package Exer5;

public class PaypalGame implements PagamentoGame{
    protected String nome = "Paypal";
    @Override
    public double processarPagamento(double valor){
        return valor + (valor*0.03);
    }
    @Override
    public String getNome() {
        return nome;
    }
}