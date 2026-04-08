public class Main {
    public static void main(String[] args) {
        Produto joao = new Produto("Banana", -2.99);
        
        System.out.println(joao.getNome() + " " + joao.getPreco());
    }
}
