public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está programando em " + linguagem + ".");
    }

    public void exibirLinguagem() {
        System.out.println("Linguagem principal: " + linguagem);
    }
}