import java.util.Locale;
import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        System.out.println("Nota informada: " + nota);

        scanner.close();
    }
}

