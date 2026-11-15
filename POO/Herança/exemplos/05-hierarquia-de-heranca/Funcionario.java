public class Funcionario extends Pessoa {

    protected String cargo;
    protected double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {

        super(nome, idade);

        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirFuncionario() {

        exibirPessoa();

        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}