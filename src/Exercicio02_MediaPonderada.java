import java.util.Scanner;

public class Exercicio02_MediaPonderada {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //Entrada de dados
        System.out.print("Informe a nota 1: ");
        double notaUm = sc.nextDouble();
        System.out.print("Informe o peso da nota 1: ");
        int pesoNotaUm = sc.nextInt();
        System.out.print("Informe a nota 2: ");
        double notaDois = sc.nextDouble();
        System.out.print("Informe o peso da nota 2: ");
        int pesoNotaDois = sc.nextInt();
        System.out.print("Informe a nota 3: ");
        double notaTres = sc.nextDouble();
        System.out.print("Informe o peso da nota 3: ");
        int pesoNotaTres = sc.nextInt();

        //Soma peso notas
        int somaPesoNotas = pesoNotaUm + pesoNotaDois + pesoNotaTres;


        //Validacao de pesos informados > 0
        if (pesoNotaUm <= 0 || pesoNotaDois <= 0 || pesoNotaTres <= 0) {
            System.out.println("Erro: os pesos devem ser maiores que zero.");
        } else {
            // Calculo de media ponderada e exibicao do resultado
            double media = (notaUm * pesoNotaUm + notaDois * pesoNotaDois + notaTres * pesoNotaTres) / somaPesoNotas;
            System.out.printf("A média ponderada das notas é: %.2f\n", media);
        }

        sc.close();


    }
}
