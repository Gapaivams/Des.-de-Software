public class Main {
    public static void main(String[] args) {
        Produto joao = new Produto();

        joao.setNome("João");
        joao.setPreco(10);
        
        System.out.println(joao.getNome() + " " + joao.getPreco());
        
        
        
        joao.setPreco(-10);
        System.out.println(joao.getNome() + " " + joao.getPreco());
    }
}
