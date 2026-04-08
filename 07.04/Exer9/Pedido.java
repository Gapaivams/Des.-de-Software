public class Pedido {
    private int numero;
    private double valor;

    public Pedido(int numero, double valor){
        setNumero(numero);
        setValor(valor);
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public int getNumero(){
        return numero;
    }

    public double getValor(){
        return valor;
    }
}
