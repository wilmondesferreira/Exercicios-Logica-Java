import java.util.Scanner;

public class Desafio_Pacientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pacientes: ");
        int totalPacientes = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Variáveis para estatísticas
        int qtd18a25 = 0;
        int somaIdadeHomens = 0;
        int qtdHomens = 0;
        int qtdMulheresAlturaPeso = 0;
        int idadeHomemMaisVelho = -1;
        String nomeHomemMaisVelho = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;
        String nomeMulherMaisBaixa = "";

        for (int i = 1; i <= totalPacientes; i++) {
            System.out.println("\nPaciente #" + i);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            // i. Contagem total já feita pelo loop

            // ii. Pacientes entre 18 e 25 anos
            if (idade >= 18 && idade <= 25) {
                qtd18a25++;
            }

            // iii. Média de idade dos homens
            if (sexo == 'M' || sexo == 'm') {
                somaIdadeHomens += idade;
                qtdHomens++;

                // v. Homem mais velho
                if (idade > idadeHomemMaisVelho) {
                    idadeHomemMaisVelho = idade;
                    nomeHomemMaisVelho = nome;
                }
            }

            // iv. Mulheres com altura entre 1,60 e 1,70 e peso > 70kg
            if ((sexo == 'F' || sexo == 'f') && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                qtdMulheresAlturaPeso++;
            }

            // vi. Mulher mais baixa
            if ((sexo == 'F' || sexo == 'f') && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
        }

        // Cálculo da média de idade dos homens
        double mediaIdadeHomens = qtdHomens > 0 ? (double) somaIdadeHomens / qtdHomens : 0;

        // Exibição do relatório
        System.out.println("\n=== RELATÓRIO DE PACIENTES ===");
        System.out.println("i. Quantidade total de pacientes: " + totalPacientes);
        System.out.println("ii. Pacientes com idade entre 18 e 25 anos: " + qtd18a25);
        System.out.printf("iii. Média de idade dos homens: %.1f anos\n", mediaIdadeHomens);
        System.out.println("iv. Mulheres com altura entre 1,60 e 1,70m e peso >70kg: " + qtdMulheresAlturaPeso);
        System.out.println("v. Homem mais velho: " + (nomeHomemMaisVelho.isEmpty() ? "Nenhum homem registrado" : nomeHomemMaisVelho));
        System.out.println("vi. Mulher mais baixa: " + (nomeMulherMaisBaixa.isEmpty() ? "Nenhuma mulher registrada" : nomeMulherMaisBaixa));

        scanner.close();
    }
}