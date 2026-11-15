public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String nome, int idade, String cpf, String cargo) {
        super(nome, idade, cpf);
        this.cargo = cargo;
    }

    public void exibirDadosFuncionario() {

        System.out.println("=== DADOS DO FUNCIONÁRIO ===");

        // Acesso ao atributo public
        System.out.println("Nome: " + nome);

        // Acesso ao atributo protected
        System.out.println("Idade: " + idade);

        // Acesso ao atributo private por meio de getter
        System.out.println("CPF: " + getCpf());

        System.out.println("Cargo: " + cargo);
    }
}