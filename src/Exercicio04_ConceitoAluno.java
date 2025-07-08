import java.util.Scanner;

public class Exercicio04_ConceitoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];
        }

        double mediaNotas = somaNotas / notas.length;

        // Mensagem associada à média
        if (mediaNotas < 7) {
            System.out.printf("A média das notas é: %.2f - Você precisa estudar mais\n", mediaNotas);
        } else if (mediaNotas == 7) {
            System.out.printf("A média das notas é: %.2f - Você foi aprovado\n", mediaNotas);
        } else if (mediaNotas > 7 && mediaNotas < 8) {
            System.out.printf("A média das notas é: %.2f - Parabéns, suas notas ficaram acima da média\n", mediaNotas);
        } else if (mediaNotas >= 8 && mediaNotas < 9) {
            System.out.printf("A média das notas é: %.2f - Parabéns, sua média ficou próxima da nota máxima\n", mediaNotas);
        } else if (mediaNotas >= 9 && mediaNotas <= 10) {
            System.out.printf("A média das notas é: %.2f - Parabéns, você é um excelente aluno\n", mediaNotas);
        } else {
            System.out.println("Média inválida. Verifique os valores inseridos.");
        }

        sc.close();
    }
}
