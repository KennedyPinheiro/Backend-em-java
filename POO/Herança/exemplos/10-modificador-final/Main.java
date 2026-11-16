public class Main {

    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Kennedy",
                5000,
                "Java"
        );

        System.out.println("=== DADOS DO DESENVOLVEDOR ===");

        desenvolvedor.exibirIdentificacao();
        desenvolvedor.exibirLinguagem();

        System.out.println("\n=== TRABALHO ===");

        desenvolvedor.trabalhar();

        System.out.println("\n=== SISTEMA ===");

        Sistema sistema = new Sistema();
        sistema.exibirMensagem();
    }
}