public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está desenvolvendo em " + linguagem + ".");
    }

    public void programar() {
        System.out.println(nome + " está escrevendo código em " + linguagem + ".");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem: " + linguagem);
    }
}