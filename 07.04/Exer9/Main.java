public class Main {
    public static void main(String[] args) {
        Pedido joao = new Pedido(0001, 200.00);
        
        System.out.println(joao.getNumero() + " " + joao.getValor());

    }
}
