import java.util.Scanner;
import java.util.Locale;

public class FormularioBasico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("===== CADASTRO DE USUÁRIO =====");

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Está estudando Java? (true/false): ");
        boolean estudandoJava = scanner.nextBoolean();

        System.out.println("\n===== DADOS CADASTRADOS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Estudando Java: " + estudandoJava);

        scanner.close();
    }
}