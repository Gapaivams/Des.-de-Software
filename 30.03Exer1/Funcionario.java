public class Funcionario extends Pessoa{
    double salario;

    public Funcionario(String nome, int idade, double salario){
        super(nome, idade);

        this.salario = salario;
    }

    void mostrarDados(){
        System.out.printf("\n\nNome: %s ---- Idade: %d ---- Salario: R$%.2f", this.nome, this.idade, this.salario);
    }
}
