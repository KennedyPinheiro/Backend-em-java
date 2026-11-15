public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }

    public void trabalhar() {
        System.out.println(nome + " está realizando suas atividades.");
    }
}