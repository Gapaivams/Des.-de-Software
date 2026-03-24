public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome,
    double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void mostrarDados(){
        System.out.printf("%s --- R$%.2f", nome, salario);
    }
}
