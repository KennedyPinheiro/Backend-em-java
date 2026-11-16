public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    // Este método não poderá ser sobrescrito
    public final void exibirIdentificacao() {
        System.out.println("Funcionário: " + nome);
    }
}