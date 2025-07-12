public class Exercicio11_Pares500a250 {
    public static void main(String[] args) {

        int numInicial = 500;
        int numFinal = 250;
        int somaNumerosPares = 0;
        int contador = 0;

        System.out.print("Números pares: ");

        for (int i = numInicial; i >= numFinal ; i -= 2) {
                System.out.print(i + " ");
                somaNumerosPares += i;
                contador++;

                //Contador para gerar quebra de linhas a cada 10 numeros
            if (contador % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n\nSoma total numeros Pares: " + somaNumerosPares);

    }

}


