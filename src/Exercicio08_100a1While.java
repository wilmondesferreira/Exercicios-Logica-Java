public class Exercicio08_100a1While {
    public static void main(String[] args) {

        System.out.println("Esse programa vai imprimir todos os números de 100 a 1");

        int i = 100;

        while (i >= 1){
            System.out.print(i + " ");
            if (i % 10 == 0) System.out.println();
            --i;
        }





    }
}
