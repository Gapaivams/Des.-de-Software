import java.util.Scanner;

public class Aula1 {
    public static void main(String args[]) {
        // String texto = "Disciplina - Desenvolvimento de Software";
        // int ano = 2024;
        // System.out.print(texto);
        // System.out.println(" Universidade");
        // System.out.print(ano);
        // System.out.println();
        // System.out.println("=================");

        // System.out.print("Ola " + "Maria");

        // int numero;

        // Scanner entrada = new Scanner(System.in);

        // System.err.print("Digite um numero: ");
        // numero = entrada.nextInt();
        
        // System.out.println("Resultado: ");
        // System.out.println(numero + 2);


        // String nome = "Maria";
        // int idade = 20;
        // System.out.println("Olá, " + nome + "!");
        // System.out.println("Você tem " + idade + " anos.");


        // Scanner entrada = new Scanner(System.in);

        // int idade;

        // System.out.println("Digite a sua idade: ");
        // idade = entrada.nextInt();

        // System.out.println("Sua idade é: " + idade);

        // int i = 5;
        // System.out.println(i);
        // int j = i++;
        // System.out.println(i);
        // System.out.println(j);
        // int x = ++i;
        // System.out.println(i);
        // System.out.println(x);
        // int y = j + x;
        // System.out.println(i);
        // System.out.println(y);

        // Scanner entrada = new Scanner(System.in);

        // int a, b, c;

        // System.out.println("Digite 3 valores");
        // a = entrada.nextInt();
        // b = entrada.nextInt();
        // c = entrada.nextInt();

        // double media = (a+b+c)/3;

        // System.out.println(media);

        Scanner entrada = new Scanner(System.in);

        double a, b, c;

        String tipo;
        String existencia;

        System.out.println("Digite tres valores");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        if ((a + b > c && a + c > b && b + c > a)){
            existencia = "Verdadeiro";
            if (a != b && b != c && a != c){
                tipo = "Escaleno";
            } else if(a == b && b == c){
                tipo = "Equilatero";
            } else{
                tipo = "Isoceles";
            }
        } else {
            existencia = "nao é triangulo";
            tipo = null;
        }

        System.out.println("Seu triangulo " + existencia + " e seu tipo é " + tipo);


    }
}



