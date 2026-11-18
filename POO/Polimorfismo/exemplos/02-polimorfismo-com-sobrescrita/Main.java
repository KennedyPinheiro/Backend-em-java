public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Carlos",
                3000
        );

        Funcionario gerente = new Gerente(
                "Ana",
                7000
        );

        Funcionario desenvolvedor = new Desenvolvedor(
                "Kennedy",
                5000
        );

        System.out.println("=== CÁLCULO DE BÔNUS ===");

        funcionario.exibirInformacoes();

        System.out.println();

        gerente.exibirInformacoes();

        System.out.println();

        desenvolvedor.exibirInformacoes();
    }
}