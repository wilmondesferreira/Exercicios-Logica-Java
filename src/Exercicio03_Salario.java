import java.util.Scanner;

public class Exercicio03_Salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário base: ");
        double salarioBase = sc.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double impostoSalario = salarioBase * 0.07;

        double salarioReceber = salarioBase + gratificacao - impostoSalario;

        System.out.printf("O salário a receber é: R$ %.2f\n", salarioReceber);

        sc.close();


    }


}
