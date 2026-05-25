package Exer5;

public class Compra {
    private String nome;
    private double valorCompra;
    private PagamentoGame metodoPagamento;

    public Compra(String nome, double valorCompra, PagamentoGame metodoPagamento){
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.metodoPagamento = metodoPagamento;
    }

    public PagamentoGame getMetodoPagamento() {
        return metodoPagamento;
    }
    
    public String getMetodoPagamentoTipo() {
        return metodoPagamento.getNome();
    }
    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setMetodoPagamento(PagamentoGame metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void mostrarResumo(){
        System.out.printf("\nJogador: %s\nPagamento: %s\nValor: R$%.2f", getNome(), getMetodoPagamentoTipo(), metodoPagamento.processarPagamento(getValorCompra()));
    }
}
