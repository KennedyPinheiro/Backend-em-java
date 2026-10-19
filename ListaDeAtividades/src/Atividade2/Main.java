
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome : ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        apresentarPessoa(nome, idade, cidade);

    }

    public static boolean ehMaiordeIdade(int idade) {
        return idade >= 18;
    }

    public static void apresentarPessoa(String nome, int idade, String cidade) {

        String classificacao = "";

        boolean maiorDeIdade = ehMaiordeIdade(idade);

        if (maiorDeIdade == true) {
            classificacao = "Maior de Idade";
        } else {
            classificacao = "Menor de Idade";
        }

        System.out.println("----------Cadastro--------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Classificação: " + classificacao);
        System.out.println("-------------------------------");
    }

}
