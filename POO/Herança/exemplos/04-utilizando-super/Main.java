public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
            "Kennedy",
            7500.00,
            "Tecnologia"
        );

        System.out.println("===== DADOS DO GERENTE =====");

        gerente.exibirDados();

        System.out.println("\n===== ATIVIDADES =====");

        gerente.trabalhar();
        gerente.realizarReuniao();

        System.out.println("\n===== SALÁRIO =====");

        gerente.exibirSalarioBase();
    }
}