public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Kennedy",
                22,
                "123.456.789-00",
                "Desenvolvedor"
        );

        funcionario.exibirDadosFuncionario();

        System.out.println("\n=== ACESSANDO ATRIBUTOS ===");

        // Atributo public
        System.out.println("Nome: " + funcionario.nome);

        // Atributo protected
        // System.out.println("Idade: " + funcionario.idade);

        // Atributo private
        // System.out.println("CPF: " + funcionario.getCpf());
    }
}