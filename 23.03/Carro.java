import javax.print.DocFlavor.STRING;

public class Carro {
    String marca;
    String modelo;
    double velocidade;

    public Carro(String marca, String modelo, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        System.out.printf("\n\nO carro %s da marca %s está acelerando", modelo, marca);
    }
}
