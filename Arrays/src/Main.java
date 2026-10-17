import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GerenciadorPessoas gerenciador = new GerenciadorPessoas();

        int opcao;

        do {

            System.out.println("\n===== GERENCIADOR DE PESSOAS =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Remover pessoa");
            System.out.println("3 - Listar pessoas");
            System.out.println("4 - Quantidade de pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.nextLine();
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine().trim();

                    if (nome.isBlank()) {
                        System.out.println("O nome não pode estar vazio.");
                        break;
                    }

                    System.out.print("Idade: ");

                    while (!scanner.hasNextInt()) {
                        System.out.print("Digite uma idade válida: ");
                        scanner.nextLine();
                    }

                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    if (idade < 0) {
                        System.out.println("A idade não pode ser negativa.");
                        break;
                    }

                    Pessoa pessoa = new Pessoa(nome, idade);

                    gerenciador.cadastrar(pessoa);

                    System.out.println("Pessoa cadastrada com sucesso!");

                    break;

                case 2:

                    System.out.print("Nome da pessoa que deseja remover: ");

                    String nomeRemover = scanner.nextLine().trim();

                    if (nomeRemover.isBlank()) {
                        System.out.println("Informe um nome válido.");
                        break;
                    }

                    boolean removida = gerenciador.remover(nomeRemover);

                    if (removida) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }

                    break;

                case 3:

                    gerenciador.listar();

                    break;

                case 4:

                    System.out.println(
                        "Total de pessoas: " + gerenciador.quantidade()
                    );

                    break;

                case 0:

                    System.out.println("Encerrando o programa...");

                    break;

                default:

                    System.out.println("Opção inválida.");

                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}