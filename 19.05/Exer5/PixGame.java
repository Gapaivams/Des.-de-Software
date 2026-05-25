package Exer5;

public class PixGame implements PagamentoGame{
    protected String nome = "Pix";
    @Override
    public double processarPagamento(double valor){
        return valor + (valor*0.02);
    }
    @Override
    public String getNome() {
        return nome;
    }
}
