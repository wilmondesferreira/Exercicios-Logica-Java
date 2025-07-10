public class Exercicio08_100a1For {
    public static void main(String[] args) {

        System.out.println("Esse programa vai imprimir todos os números de 100 a 1");

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");  // Imprime na mesma linha
            if (i % 10 == 0) System.out.println();  // Quebra linha a cada 10 números
        }
    }
}
