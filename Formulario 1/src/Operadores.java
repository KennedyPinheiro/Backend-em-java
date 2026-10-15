public class Operadores {

    public static void main(String[] args) {

        int idade = 20;
        boolean emailValido = true;

        boolean cadastroValido = idade >= 18 && emailValido;

        System.out.println("Idade: " + idade);
        System.out.println("E-mail válido: " + emailValido);
        System.out.println("Cadastro válido: " + cadastroValido);

    }
}
