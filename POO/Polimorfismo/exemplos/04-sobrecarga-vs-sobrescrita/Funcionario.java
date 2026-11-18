public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método original
    public double calcularBonus() {
        return salario * 0.05;
    }

    // SOBRECARGA: recebe um percentual personalizado
    public double calcularBonus(double percentual) {
        return salario * (percentual / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus padrão: R$ %.2f%n", calcularBonus());
    }
}