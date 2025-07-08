import java.util.Scanner;

public class Exercicio02_MediaPonderadaComArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        int[] pesos = new int[3];

        double somaNotasPonderadas = 0;
        int somaPesos = 0;

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            System.out.print("Informe o peso da nota " + (i + 1) + ": ");
            pesos[i] = sc.nextInt();

            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        // Cálculo da média ponderada
        double mediaPonderada = somaNotasPonderadas / somaPesos;

        // Exibição do resultado
        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);

        sc.close();
    }
}
