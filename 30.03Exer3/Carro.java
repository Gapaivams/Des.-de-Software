public class Carro extends Veiculo{
    int portas;

    public Carro(String marca, String modelo, int portas){
        super(marca, modelo);

        this.portas = portas;
    }

    void mostrarDados(){
        System.out.printf("\n\nMarca: %s ---- Modelo: %s ---- Portas: %d", this.marca, this.modelo, this.portas);
    }
}
