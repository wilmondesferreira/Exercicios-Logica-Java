public class Exercicio09_Impares250a500 {
    public static void main(String[] args) {

        int numeroInicio = 250;
        int numeroFim = 500;
        int somaNumero = 0;

        System.out.println("Números ímpares entre " + numeroInicio + " e " + numeroFim);

        for (int i = numeroInicio; i <= numeroFim; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
                somaNumero += i;
            }
        }

        System.out.println("\n\nSoma total numero Impares: " + somaNumero);

    }
}
