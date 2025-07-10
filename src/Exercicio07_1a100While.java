public class Exercicio07_1a100While {
    public static void main(String[] args) {

        System.out.println("Esse programa vai imprimir todos os números de 1 a 100");
        int i = 1;
        while (i <= 100) {
            System.out.printf(i + " ");
            if (i % 10 == 0) System.out.println();
            ++i;
        }
    }
}
