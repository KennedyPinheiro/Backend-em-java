import java.util.Scanner;
import java.util.Locale;

public class CadastroEstudante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("----------------Cadastro de Estudante ----------------- ");
        System.out.print("Informe o nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe a prmeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;


        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade + " "+ "anos");
        System.out.println("Primeira nota:"+nota1);
        System.out.println("Segunda nota:"+nota2);
        System.out.println("Media :"+media);
        scanner.close();
    }
}