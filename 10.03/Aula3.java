
import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // int i = 0;
        // System.out.println("Escolha uma opção: \n1-Java\n2-Python\n3-JavaScript");
        // i = entrada.nextInt();
        // switch (i) {
        //     case 1: {
        //         System.out.println("Escolheu Java");
        //         break;
        //     }
        //     case 2: {
        //         System.out.println("Escolheu Python");
        //         break;
        //     }
        //     case 3: {
        //         System.out.println("Escolheu JavaScript");
        //         break;
        //     }
        //     default: {
        //         System.out.println("Escolha invalida");
        //         break;
        //     }
        // }
        // System.out.println("Programa encerrado");




        // double num1 = 0, num2 = 0, resultado = 0;
        // int operação = 0;
        // System.out.println("Digite um numero");
        // num1 = entrada.nextDouble();
        // System.out.println("Digite um numero");
        // num2 = entrada.nextDouble();
        // System.out.println("Escolha uma operação: \n\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        // operação = entrada.nextInt();
        // switch (operação) {
        //     case 1: {
        //         resultado = num1 + num2;
        //         break;
        //     }
        //     case 2: {
        //         resultado = num1 - num2;
        //         break;
        //     }
        //     case 3: {
        //         resultado = num1 * num2;
        //         break;
        //     }
        //     case 4: {
        //         if (num2 >= 0) {
        //             resultado = num1 / num2;
        //         } else {
        //             System.out.println("Não é possivel dividir por 0");
        //         }
        //         break;
        //     }
        //     default: {
        //         System.out.println("\nOperação invalida\n");
        //         break;
        //     }
        // }
        // System.out.println("Resultado = " + resultado);
        // entrada.close();




        // double nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
        // String situação = "";
        // System.out.println("Digite a sua nota 1");
        // nota1 = entrada.nextDouble();
        // System.out.println("Digite a sua nota 2");
        // nota2 = entrada.nextDouble();
        // System.out.println("Digite a sua nota 3");
        // nota3 = entrada.nextDouble();

        // media = (nota1 + nota2 + nota3) / 3;

        // if (media >= 7) {
        //     situação = "Aprovado";
        // } else if (media >= 5) {
        //     situação = "Recuperação";
        // } else {
        //     situação = "Reprovado";
        // }

        // System.out.println("Sua media foi: " + media + " Sua situação é: " + situação);
        



        // int num = 0;
        // num = entrada.nextInt();

        // do{
        //     System.out.println(num);
        //     num--;
        // } while(num >= 0);


        // int i = 1;
        // double soma = 0;
        
        // do{
        //     System.out.println("Digite um numero");
        //     double num = entrada.nextDouble();
        //     soma += num;
        //     i++;
        // }while(i<=5);


        // System.out.println(String.format("Resultado da soma = %.2f", soma));

        // int i = 1;
        
        // do{
        //     System.out.println("Digite um numero");
        //     int num = entrada.nextInt();
        //     if(num % 2 == 0){
        //         System.out.println(String.format("O numero %d é par", num));
        //     } else{
        //         System.out.println(String.format("O numero %d é impar", num));
        //     }
        //     i++;
        // }while(i<=10);

        // System.out.println("Programa encerrado");



        // int[] numero = new int[5];
        
        // numero[0] = 2;
        // numero[1] = 15;
        // numero[2] = 56;
        // numero[3] = 12;
        // numero[4] = 8;

        // for(int i = 0; i<5; i++){
        //     System.out.println("Nota: " + numero[i]);
        // }



        // int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        // for(int i = 0; i < matriz.length; i++){
        //     for(int j = 0; j < matriz[0].length; j++){
        //         System.out.print(matriz[i][j] + " ");
        //     }

        //     System.out.println();
        // }

        // System.out.println(matriz.length);


        int[] matriz = new int[5];




        for(int i = 0; i < matriz.length; i++){
            System.out.println(String.format("Digite o numero da posição %d", i+1));
            matriz[i] = entrada.nextInt();
        }

        System.out.println();

        for(int i = 0; i < matriz.length; i++){
            System.out.print("[" + i + "] = " + matriz[i] + "; ");
        }
        

    }
}
