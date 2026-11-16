public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe.");
    }

    public void realizarReuniao() {
        System.out.println(nome + " está realizando uma reunião.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
    }
}