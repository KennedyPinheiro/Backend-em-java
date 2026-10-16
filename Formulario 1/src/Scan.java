import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);

        scanner.close();
    }
}