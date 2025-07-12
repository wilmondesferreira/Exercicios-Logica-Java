import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10_NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numerosDigitados = new ArrayList<>();

        System.out.println("Digite números positivos (digite um número negativo para parar):");

        while (true) {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                break;  // Sai do loop quando um número negativo é digitado
            }

            numerosDigitados.add(numero);  // Adiciona o número positivo à lista
        }

        // Exibe os números digitados
        System.out.println("\nNúmeros positivos digitados:");
        for (double num : numerosDigitados) {
            System.out.println(num);
        }

        scanner.close();
    }
}