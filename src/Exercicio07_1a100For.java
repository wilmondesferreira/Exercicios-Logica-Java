public class Exercicio07_1a100For {
    public static void main(String[] args) {

        System.out.println("Esse programa vai imprimir todos os números de 1 a 100");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");  // Imprime na mesma linha
            if (i % 10 == 0) System.out.println();  // Quebra linha a cada 10 números
        }
    }
}
