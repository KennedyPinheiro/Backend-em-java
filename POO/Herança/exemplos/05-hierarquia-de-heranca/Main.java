public class Main {

    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Kennedy",
            22,
            "Desenvolvedor Full-Stack",
            5000.00,
            "Java",
            "Júnior"
        );

        System.out.println("===== DADOS DO DESENVOLVEDOR =====");

        desenvolvedor.exibirDesenvolvedor();

        System.out.println("\n===== ATIVIDADES =====");

        desenvolvedor.programar();
    }
}