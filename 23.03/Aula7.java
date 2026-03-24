public class Aula7 {
    public static void main(String[] args) {
        // Aluno aluno1 = new Aluno("rafael", "12345678912", "ADS", "123-456-789-12", 9.5);
        // Aluno aluno2 = new Aluno("jorge", "98765432121", "ADS", "987-654-321-12", 8.7);

        // aluno1.apresentar();
        // aluno2.apresentar();

        // Produto maca = new Produto("Pacote de Salcicha", 8.00, 10);

        // maca.apresentar();

        // System.out.println("\n\nTotal = R$" + maca.calcularTotal());

        // Carro pegeout = new Carro("pegeout", "208", 60);

        // pegeout.acelerar();

        // Pessoa renan = new Pessoa("renan",  60);

        // renan.mostrar();

        // Animal gato = new Animal("Gato");
        // gato.emitirSom("Miau");

        // ContaBancaria gabriel = new ContaBancaria("gabriel", 500.00);
        // gabriel.mostrarSaldo();

        Universidade positivo = new Universidade("Positivo", "Londrina");
        Professor helton = new Professor("Helton", "bagunça");

        positivo.mostrarUni();
        System.out.println();
        System.out.println();
        helton.mostrarProf();


    }
}