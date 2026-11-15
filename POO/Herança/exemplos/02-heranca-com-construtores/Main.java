public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "Kennedy",
            22,
            "Desenvolvedor",
            3500.00
        );

        System.out.println("===== DADOS DO FUNCIONÁRIO =====");

        funcionario.exibirDadosFuncionario();
    }
}