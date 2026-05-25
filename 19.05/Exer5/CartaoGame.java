package Exer5;

public class CartaoGame implements PagamentoGame{
    protected String nome = "Cartão";

    @Override
    public double processarPagamento(double valor){
        return valor + (valor*0.04);
    }
    @Override
    public String getNome() {
        return nome;
    }
}