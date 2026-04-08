public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        } else{
            System.out.println("preco deve ser maior que zero");
        }
    }
}
