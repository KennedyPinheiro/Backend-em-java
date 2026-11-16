public class Main {

    public static void main(String[] args) {

        // Referências do tipo Funcionario
        Funcionario funcionario1 = new Gerente(
                "Carlos",
                7500,
                "Tecnologia"
        );

        Funcionario funcionario2 = new Desenvolvedor(
                "Kennedy",
                5000,
                "Java"
        );

        System.out.println("=== POLIMORFISMO ===");

        funcionario1.trabalhar();
        funcionario2.trabalhar();

        System.out.println("\n=== DADOS DOS FUNCIONÁRIOS ===");

        funcionario1.exibirDados();

        System.out.println();

        funcionario2.exibirDados();

        // Verificando o tipo real dos objetos
        System.out.println("\n=== VERIFICANDO TIPOS ===");

        if (funcionario1 instanceof Gerente) {
            System.out.println("O primeiro funcionário é um gerente.");
        }

        if (funcionario2 instanceof Desenvolvedor) {
            System.out.println("O segundo funcionário é um desenvolvedor.");
        }

        // Casting para acessar métodos específicos
        System.out.println("\n=== ACESSANDO MÉTODOS ESPECÍFICOS ===");

        Gerente gerente = (Gerente) funcionario1;
        gerente.realizarReuniao();

        Desenvolvedor desenvolvedor = (Desenvolvedor) funcionario2;
        desenvolvedor.programar();
    }
}