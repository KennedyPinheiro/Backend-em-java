import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GerenciadorNotas gerenciador = new GerenciadorNotas();

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite a nota " + (i + 1) + ": ");
            double valor = scanner.nextDouble();

            gerenciador.adicionarNota(valor);
        }

        System.out.println("\nNotas cadastradas:");

        gerenciador.listarNotas();

        System.out.println(
            "\nMédia das notas: " + gerenciador.calcularMedia()
        );

        scanner.close();
    }
}