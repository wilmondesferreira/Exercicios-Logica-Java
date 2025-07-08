import java.util.Scanner;

public class Exercicio01_MediaAritmeticaComArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     double[] notas = new double[3];
     double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];
        }

        double mediaNotas =  somaNotas / notas.length;

        System.out.printf("A média aritmética das notas é: %.2f\n", mediaNotas);

        sc.close();
    }
}
