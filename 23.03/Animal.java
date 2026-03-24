public class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void emitirSom(String som){
        System.out.printf("\n\n%s!!", som);
    }
}
