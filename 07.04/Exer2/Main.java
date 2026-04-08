public class Main {
    public static void main(String[] args) {
        ContaBancaria joao = new ContaBancaria();

        joao.setTitular("João");
        joao.setSaldo(10);
        
        System.out.println(joao.getTitular() + " " + joao.getSaldo());
        
        
        
        joao.setSaldo(-10);
        System.out.println(joao.getTitular() + " " + joao.getSaldo());
    }
}
