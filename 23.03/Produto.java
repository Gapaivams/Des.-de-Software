public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void apresentar(){
        System.out.printf("Produto: %s ---- Preço: R$%.2f ---- Quantidade: %d un", nome, preco, quantidade);
    }

    public double calcularTotal(){
        return preco * quantidade;
    }

    
}
