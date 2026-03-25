import java.util.ArrayList;

public class Aula8 {
    public static void main(String[] args) {
        // Professor joao = new Professor("João", "Algoritmo");

        // Curso ads = new Curso("ASD", joao);

        // System.out.println(ads.professor.nome);

        // Aluno fernando = new Aluno("Fernando", 25);
        // Aluno roberto = new Aluno("Roberto", 30);
        // Aluno lina = new Aluno("Lina", 24);

        // ArrayList<Aluno> alunos = new ArrayList<>();

        // alunos.add(fernando);
        // alunos.add(roberto);
        // alunos.add(lina);

        // for(Aluno a : alunos){
        //     System.out.println(a.nome);
        //     System.out.println(a.idade);
        //     System.out.println();
        // }

        Produto maca = new Produto("Maçã", 2.99);
        Produto banana = new Produto("Banana", 3.99);
        Produto pera = new Produto("Pera", 4.99);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(maca);
        produtos.add(banana);
        produtos.add(pera);

        for(Produto p : produtos){
            System.out.println(p.nome);
            System.out.println(p.preco);
            System.out.println();
        }

        Pedido frutas = new Pedido("frutas");

        frutas.adicionarProduto(maca, pera, banana);


        frutas.mostrarProdutos();

    }
}
