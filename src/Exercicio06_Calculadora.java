import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        double resultadoOperacao = 0;


        System.out.println("Informe o primeiro número: ");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double segundoNumero = sc.nextDouble();

        System.out.print("1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão\nAgora escolha qual operação deseja fazer: ");
        int operacaoEscolhida = sc.nextInt();

        switch (operacaoEscolhida){
            case 1:
                resultadoOperacao = primeiroNumero + segundoNumero;
                System.out.printf("O resultado da sua adição ficou: %.2f%n" , resultadoOperacao);
                break;
            case 2:
                resultadoOperacao = primeiroNumero - segundoNumero;
                System.out.printf("O resultado da sua subtração ficou: %.2f%n",  resultadoOperacao);
                break;
            case 3:
                resultadoOperacao = primeiroNumero * segundoNumero;
                System.out.printf("O resultado da sua multiplicação ficou: %.2f%n", resultadoOperacao);
                break;
            case 4:
                if (segundoNumero == 0) {
                    System.out.println("Erro: Divisão pro zero nao e permitido");
                } else {
                    resultadoOperacao = primeiroNumero / segundoNumero;
                    System.out.printf("O resultado da sua divisão ficou: %.2f%n", resultadoOperacao);
                }
                break;
            default:
                System.out.println("Opção inválida! Escolha entre 1 e 4.");
                break;
        }
        sc.close();
    }
}





