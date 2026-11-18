public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Funcionario gerente = new Gerente("Mariana", 8000);

        System.out.println("=== FUNCIONÁRIO ===");

        funcionario.exibirInformacoes();

        System.out.printf(
            "Bônus personalizado (10%%): R$ %.2f%n",
            funcionario.calcularBonus(10)
        );

        System.out.println("\n=== GERENTE ===");

        gerente.exibirInformacoes();

        System.out.printf(
            "Bônus personalizado (10%%): R$ %.2f%n",
            gerente.calcularBonus(10)
        );
    }
}