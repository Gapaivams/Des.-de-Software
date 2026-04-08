public class Aluno {
    private String nome;
    private double nota;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.err.println("A nota deve estar entre 0 e 10");
        }
    }

    public String getNome(){
        return nome;
    }

    public double getNota(){
        return nota;
    }
}
