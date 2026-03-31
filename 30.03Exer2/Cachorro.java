public class Cachorro extends Animal{
    String raca;

    public Cachorro(String nome, String raca){
        super(nome);

        this.raca = raca;
    }

    void mostrarDados(){
        System.out.printf("\n\nNome: %s ---- Raça: %s", this.nome, this.raca);
    }
}
