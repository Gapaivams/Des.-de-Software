public class Moto extends Veiculo{
    int cilindradas;

    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);

        this.cilindradas = cilindradas;
    }

    void mostrarDados(){
        System.out.printf("\n\nMarca: %s ---- Modelo: %s ---- Cilindradas: %d", this.marca, this.modelo, this.cilindradas);
    }
}
