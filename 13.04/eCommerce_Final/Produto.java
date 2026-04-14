class Produto{
    String nome;
    double preco;

    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double porcentagem){
        this.preco = preco - (preco * porcentagem / 100);
    }

    
}
